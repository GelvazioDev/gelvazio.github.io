/**************************************************************************
// Roberto Speicys Cardoso
// Exercício-Programa 03
// Curso BCC - Professor: Carlinhos
// Computador: Pentium 133 Mhz
// Compilador: JDK 1.1.3
/**************************************************************************
/*-------------------------------------------------------------------------
	Janela principal do EP03. Contém toda interface com o usuário que
permite a seleção do número de barras e do algoritmo.
-------------------------------------------------------------------------*/

import java.awt.*; 
import java.awt.event.*;
import java.io.*;

class Principal extends Frame implements ItemListener,ActionListener
{
	Menu Algoritmo;
	Menu NBarras;
	Menu Ordem;

	CheckboxMenuItem	Bubble;
	CheckboxMenuItem	Quick;
	CheckboxMenuItem	Heap;
	CheckboxMenuItem	MixVigor;
	final byte BUBBLE=0;
	final byte QUICK=1;
	final byte HEAP=2;
	final byte MIXVIGOR=3;
	
	CheckboxMenuItem	barra10;
	CheckboxMenuItem	barra20;
	CheckboxMenuItem	barra40;
	CheckboxMenuItem	barra60;
	CheckboxMenuItem	barra80;
	CheckboxMenuItem	barra100;

	CheckboxMenuItem	Aleatoria;
	CheckboxMenuItem	Crescente;
	CheckboxMenuItem	Decrescente;
	CheckboxMenuItem	Parcial;
	final byte ALEATORIA=0;
	final byte CRESCENTE=1;
	final byte DECRESCENTE=2;
	final byte PARCIAL=3;

	Panel		Toolbar;
	Button	Ordenar;
	TextField	Tempo, Comp, Troca;

	boolean	pintou;

	// Contadores de troca, comparação e tempo
	int n_troca, n_comp;
	long n_tempo;

	// Vetor com as barras criadas
	Barra barras[];

	public Principal()
	{
		setTitle("Sort Analyser v. 1.0ß");
		setBounds(0, 0, 800, 600);

		// Crio os menus
		IniMenus();
			
		// Crio uma barra de menu com os menus construídos
		MenuBar BarraMenu = new MenuBar();
		BarraMenu.add(Algoritmo);
		BarraMenu.add(NBarras);
		BarraMenu.add(Ordem);

		// Coloco a barra de menu na tela
		setMenuBar(BarraMenu);

		// Crio a barra de menu
		Ordenar = new Button("Ordenar");
		Tempo = new TextField(10);
		Comp	= new TextField(12);
		Troca = new TextField(12);

		// Marco os textfield como não editáveis
		Tempo.setEnabled(false);
		Comp.setEnabled(false);
		Troca.setEnabled(false);

		Toolbar = new Panel();
		Toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));
		Toolbar.setBackground(Color.lightGray);
		Toolbar.add(Ordenar);
		Toolbar.add(new Label());
		Toolbar.add(new Label("Tempo gasto (s)"));
		Toolbar.add(Tempo);
		Toolbar.add(new Label());
		Toolbar.add(new Label("Comparações"));
		Toolbar.add(Comp);
		Toolbar.add(new Label());
		Toolbar.add(new Label("Trocas"));
		Toolbar.add(Troca);
		
		add(Toolbar, "North");

		// Adiciono os Item Listener
		AdicionaItemListener();

		Ordenar.addActionListener(this);

		
	}

	public void itemStateChanged(ItemEvent e)
	{
		// Item que gerou este evento
		CheckboxMenuItem	Sel = new CheckboxMenuItem();
		Sel = (CheckboxMenuItem)e.getItemSelectable();
		
		
		// Marco apenas o item selecionado, de acordo com o menu
		if(Sel==Bubble || Sel==Quick || 
		    Sel==Heap || Sel==MixVigor)
		{
			ZeraAlgoritmo();
			Sel.setState(true);	
			pintou=true;
			repaint();
		}

		if(Sel==barra10 || Sel==barra20 || 
		   Sel==barra40 || Sel==barra60 || 
		   Sel==barra80 || Sel==barra100)
		{
			ZeraNBarras();
			Sel.setState(true);
			pintou=false;
			repaint();
		}
	
		if(Sel==Aleatoria || Sel==Crescente || 
		    Sel==Decrescente || Sel==Parcial)
		{
			ZeraOrdem();
			Sel.setState(true);
			pintou=false;
			repaint();
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
		// Zero os indicadores da performance do algoritmo
		n_tempo = System.currentTimeMillis();
		n_troca = 0;
		n_comp = 0;
		Tempo.setText("");
		Comp.setText("");
		Troca.setText("");

		// Descubro o número de barras selecionado
		int n_barras = getNBarras();
		// Descubro a ordem escolhida
		byte ordem = getOrdem(); 
		// Descubro o algoritmo escolhido
		byte algoritmo = getAlgoritmo();
		// Ordeno as barras
		Organiza(n_barras, ordem, algoritmo, getGraphics());
		
		// Calculo o tempo total
		long tempo_atual = System.currentTimeMillis();
		n_tempo = tempo_atual-n_tempo;
		
		// Mostro na tela os totais da performance
		Tempo.setText(String.valueOf((double)n_tempo/1000.0));
		Comp.setText(String.valueOf(n_comp));
		Troca.setText(String.valueOf(n_troca));
    	}
	
	public void paint(Graphics g)
	{
		// Controlo quando pintar a tela
		if(!pintou)
		{
			// Descubro o número de barras selecionado
			int n_barras = getNBarras();
			// Crio as barras 
			CalcBarras(n_barras);
			// Descubro a ordem escolhida
			byte ordem = getOrdem(); 
			// Desenho as barras
			DesBarras(n_barras, ordem, g);
			
			// Sinalizo que já pintou
			pintou=true;
		}

		else
		{
			// Descubro o número de barras selecionado
			int n_barras = getNBarras();
			// Descubro a ordem escolhida
			byte ordem = getOrdem(); 
			// Desenho as barras
			DesBarras(n_barras, CRESCENTE, g);
		}		
	}

	protected void IniMenus()
	{
		Algoritmo = new Menu("Algoritmo");
		NBarras = new Menu("Número de Barras");
		Ordem = new Menu("Ordem");

		Bubble = new CheckboxMenuItem("Bubblesort", true);
		Quick = new CheckboxMenuItem("Quicksort");
		Heap = new CheckboxMenuItem("Heapsort");
		MixVigor = new CheckboxMenuItem("MixVigorsort");

		barra10 = new CheckboxMenuItem("10 Barras", true);
		barra20 = new CheckboxMenuItem("20 Barras");
		barra40 = new CheckboxMenuItem("40 Barras");
		barra60 = new CheckboxMenuItem("60 Barras");
		barra80 = new CheckboxMenuItem("80 Barras");
		barra100 = new CheckboxMenuItem("100 Barras");

		Aleatoria = new CheckboxMenuItem("Aleatória", true);
		Crescente = new CheckboxMenuItem("Crescente");
		Decrescente = new CheckboxMenuItem("Decrescente");
		Parcial = new CheckboxMenuItem("Parcialmente Ordenada");

		Algoritmo.add(Bubble);
		Algoritmo.add(Quick);
		Algoritmo.add(Heap);
		Algoritmo.add(MixVigor);
		
		NBarras.add(barra10);
		NBarras.add(barra20);
		NBarras.add(barra40);
		NBarras.add(barra60);
		NBarras.add(barra80);
		NBarras.add(barra100);

		Ordem.add(Aleatoria);
		Ordem.add(Crescente);
		Ordem.add(Decrescente);
		Ordem.add(Parcial);
	}

	protected void AdicionaItemListener()
	{
		Bubble.addItemListener(this);
		Quick.addItemListener(this);
		Heap.addItemListener(this);
		MixVigor.addItemListener(this);

		barra10.addItemListener(this);
		barra20.addItemListener(this);
		barra40.addItemListener(this);
		barra60.addItemListener(this);
		barra80.addItemListener(this);
		barra100.addItemListener(this);

		Aleatoria.addItemListener(this);
		Crescente.addItemListener(this);
		Decrescente.addItemListener(this);
		Parcial.addItemListener(this);
	}

	protected void ZeraAlgoritmo()
	{
		Bubble.setState(false);
		Quick.setState(false);
		Heap.setState(false);
		MixVigor.setState(false);
	}

	protected void ZeraNBarras()
	{
		barra10.setState(false);
		barra20.setState(false);
		barra40.setState(false);
		barra60.setState(false);
		barra80.setState(false);
		barra100.setState(false);
	}

	protected void ZeraOrdem()
	{
		Aleatoria.setState(false);
		Crescente.setState(false);
		Decrescente.setState(false);
		Parcial.setState(false);
	}

	protected int getNBarras()
	{
		if(barra10.getState())
			return(10);

		if(barra20.getState())
			return(20);

		if(barra40.getState())
			return(40);
		
		if(barra60.getState())
			return(60);

		if(barra80.getState())
			return(80);

		if(barra100.getState())
			return(100);

		// Se nenhum item estiver setado, retorno 10 barras
		return(10);
	}

	protected byte getOrdem()
	{
		if(Aleatoria.getState())
			return(ALEATORIA);

		if(Crescente.getState())
			return(CRESCENTE);

		if(Decrescente.getState())
			return(DECRESCENTE);
		
		if(Parcial.getState())
			return(PARCIAL);

		// Se nenhum item estiver setado, retorno Aleatoria
		return(ALEATORIA);
	}

	protected byte getAlgoritmo()
	{
		if(Bubble.getState())
			return(BUBBLE);

		if(Quick.getState())
			return(QUICK);

		if(Heap.getState())
			return(HEAP);
		
		if(MixVigor.getState())
			return(MIXVIGOR);

		// Se nenhum item estiver setado, retorno Bubble
		return(BUBBLE);
	}

	protected void CalcBarras(int n_barras)
	{
		int	i, largura, altura, x, y, degrau;
		barras = new Barra[n_barras];

		// Calculo a largura de cada barra
		if(n_barras!=0)
			largura = 600/n_barras;
		else
			largura = 0;

		// Seto a posição da primeira barra
		x = 100;
		y = 450;
		degrau = (300/n_barras);
		altura = 100;

		// Instancio cada barra do vetor
		for(i=0; i<n_barras; i++)
		{
			Color cor = new Color((float)Math.random(), 
						     (float)Math.random(), 
							(float)Math.random());
			barras[i] = new Barra(x, y, largura, altura, cor);
			x+=largura;
			y-=degrau;
			altura+=degrau;
		}
	}

	protected void DesBarras(int n_barras, byte ordem, Graphics g)
	{
		int	i, j;

		// Gero o vetor da seqüência de acordo com a ordem desejada
		switch(ordem)
		{
			case ALEATORIA:
				RandomizaBarras(n_barras);
				break;

			case CRESCENTE:
				break;

			case DECRESCENTE:
				for(j=0,i=n_barras; i>0; i--,j++)
				{
					barras[j].setAltura(100+i*300/n_barras);
					barras[j].setTopo(450-i*300/n_barras);
				}
				break;

			case PARCIAL:
				int comeco = (int)(Math.random()*n_barras);
				for(j=0, i=comeco; i<n_barras; i++, j++)
				{
					barras[j].setAltura(100+i*300/n_barras);
					barras[j].setTopo(450-i*300/n_barras);
				}
				for(i=0; i<comeco; i++, j++)
				{
					barras[j].setAltura(100+i*300/n_barras);
					barras[j].setTopo(450-i*300/n_barras);
				}
				break;
		}

		// Desenho as barras na seqüência
		for(i=0; i<n_barras; i++)
			barras[i].Desenha(g);
	}

	protected void RandomizaBarras(int n_barras)
	{
		byte 	 ordenadas[];
		int	 i;

		ordenadas = new byte[n_barras];

		for(i=0; i<n_barras; i++)
		{
			// Marco todas as posições do vetor 'ordenadas' com -1, 
			// para indicar que nenhuma barra foi reordenada
			ordenadas[i]=-1;
		}

		// Calculo o número de barras aleatórias
		int n_al=(int)4*n_barras/5;

		// Organizo metade das barras em ordem aleatória
		for(i=0; i<n_al; i++)
		{
			int n_pos;
			
			// Gero a nova posição que a barra irá ocupar
			do
			{
				n_pos = (int)(Math.random()*n_barras);
			}while(ordenadas[n_pos]!=-1);

			// Se esta posição ainda não foi ocupada, 
			// coloco a barra [i]
			barras[n_pos].setAltura(100+i*300/n_barras);
			barras[n_pos].setTopo(450-i*300/n_barras);

			// Marco no vetor que a posição já foi ordenada
			ordenadas[n_pos]=0;
		}
		
		// Preencho os espaços vazios com a outra metade das barras
		int j=0;
		
		for(i=n_al; i<n_barras; i++)
		{
			// Encontro os índices das barras vazias
			for(;ordenadas[j]!=-1;j++);

			// Se esta posição ainda não foi ocupada, 
			// coloco a barra [i]
			barras[j].setAltura(100+i*300/n_barras);
			barras[j].setTopo(450-i*300/n_barras);

			// Marco no vetor que a posição já foi ordenada
			ordenadas[j]=0;	
		}	
	}
	
	protected void Organiza(int n_barras, byte ordem, byte algoritmo, 
										Graphics g)
	{
		Barra	aux_barras[];
		aux_barras = new Barra[n_barras];
		int i;

		
		// Crio uma cópia do vetor das barras
		for(i=0; i<n_barras; i++)
		{
			aux_barras[i]=new Barra();
			try
			{ aux_barras[i]=(Barra)barras[i].clone(); }
			catch(CloneNotSupportedException e)
			{ return; }
		}

		switch(algoritmo)
		{
			case BUBBLE:
				BubbleSort(n_barras, aux_barras, g);
				break;
			
			case QUICK:
				QuickSort(0, n_barras-1, aux_barras, g);
				break;
	
			case HEAP:
				HeapSort(n_barras, aux_barras, g);
				break;
		
			case MIXVIGOR:
				MixVigorSort(n_barras, aux_barras, g);
				break;
		}
	}

	protected void BubbleSort(int n_barras, Barra vetor[], Graphics g)
	{
		boolean trocou=true;
		int	i;

		while(trocou)
		{
			trocou=false;
			
			for(i=0; i<n_barras-1; i++)
			{
				// Pego as alturas das barras
				int altura1 = vetor[i].getAltura();
				int altura2 = vetor[i+1].getAltura();

				// Incremento o contador de comparações
				n_comp++;
				// Se a primeira barra for maior que a segunda, troco
				if(altura1 > altura2)
				{
					TrocaBarra(i, i+1, vetor, g);
					trocou=true;
				}
			}
		}
	}

	protected void QuickSort(int ini, int fim, Barra vetor[], Graphics g)
	{
		if(ini<fim)
		{
			int indice=Separa(ini, fim, vetor, g);
			QuickSort(ini, indice-1, vetor, g);
			QuickSort(indice+1, fim, vetor, g);
		}
	}

	protected int Separa(int ini, int fim, Barra vetor[], Graphics g)
	{
		int i, f;
		i = ini;
		f = fim;

		while(i<f)
		{
			while(i<f && vetor[f].getAltura()>=vetor[i].getAltura())
			{
				// Incremento o contador de comparações
				n_comp++;
				f--;
			}
				
			if(i<f)
				TrocaBarra(i, f, vetor, g);

			while(vetor[i].getAltura()<vetor[f].getAltura())
			{
				// Incremento o contador de comparações
				n_comp++;
				i++;
			}

			if(i<f)
				TrocaBarra(i, f, vetor, g);
		}
		return(i);
	}

	protected void HeapSort(int n_barras, Barra vetor[], Graphics g)
	{
		Heapfica(n_barras, vetor, g);
      	for (int i=n_barras-1; i>0; i--)
      	{
         		TrocaBarra(0, i, vetor, g);
			Rebaixa(i, 0, vetor, g);
		}
   	}
	
	protected void Heapfica(int n, Barra vetor[], Graphics g)
	{
		for(int i=(n-2)/2; i>=0; i--)
			Rebaixa(n, i, vetor, g);
	}

	protected void Rebaixa(int n, int i, Barra vetor[], Graphics g)
	{
		int filho = 2*i+1;
		
		if(filho<n)
		{
			if(filho+1<n)
			{
				// Incremento o contador de comparações
				n_comp++;
				if(vetor[filho+1].getAltura() > 
					vetor[filho].getAltura())
						filho++;
			}
			
			// Incremento o contador de comparações
			n_comp++;
			if(vetor[filho].getAltura() > vetor[i].getAltura())
			{
				TrocaBarra(filho, i, vetor, g);
				Rebaixa(n, filho, vetor, g);
			}
		}
	}

	protected void MixVigorSort(int n_barras, Barra vetor[], Graphics g)
	{
		// Se o vetor for menor que 20 elementos, utilizo o bubble
		if(n_barras<20)
			BubbleSort(n_barras, vetor, g);

		// Senão, utilizo o QuickSort
		else
			QuickSort(0, n_barras-1, vetor, g);

		/************************************************************/
		/*				OBSERVAÇÃO					*/
		/*										*/
		/*	Como cada troca demora muito mais do que cada compara-*/
		/* ção, o algoritmo HeapSort obteve tempos sempre maiores,	*/
		/* devido à maior quantidade de trocas realizadas. Portanto,*/
		/* num problema de ordenação com as características deste 	*/
		/* programa, o algoritmo HeapSort não é interessante de ser */
		/* usado, e a escolha entre o algoritmo que oferece o menor */
		/* tempo de execução se restringe a escolher entre o Bubble */
		/* e o Quick.								*/
		/*										*/
		/************************************************************/
	}	

	protected void TrocaBarra(int prim, int seg, Barra vetor[], Graphics g)
	{
		// Incremento o contador de trocas
		n_troca++;
	
		// Salvo a primeira barra
		Barra copia = new Barra();
		
		// Considero a segunda barra sempre como a mais à direita
		if(seg<prim)
		{
			int aux_int=prim;
			prim=seg;
			seg=aux_int;
		}

		try
		{ copia = (Barra)vetor[prim].clone(); }
		catch(CloneNotSupportedException e)
		{ return; }

		// Apago as barras
		vetor[prim].Apaga(g);
		vetor[seg].Apaga(g);

		// Seto a cor e altura da primeira barra
		vetor[prim].setCor(vetor[seg].getCor());
		vetor[prim].setAltura(vetor[seg].getAltura());
		vetor[prim].setTopo(vetor[seg].getTopo());
		vetor[prim].setEsq(vetor[seg].getEsq()-
					  ((seg-prim)*vetor[seg].getLargura()));
		vetor[prim].Desenha(g);

		// Seto a cor e a altura da segunda barra
		vetor[seg].setCor(copia.getCor());
		vetor[seg].setAltura(copia.getAltura());
		vetor[seg].setTopo(copia.getTopo());
		vetor[seg].setEsq(copia.getEsq()+
					  ((seg-prim)*copia.getLargura()));
		vetor[seg].Desenha(g);
		
		// Gasto tempo
		GastaTempo();
	}

	protected void GastaTempo()
	{
		int i, j;

		for(i=0; i<10000; i++)
			for(j=0; j<10; j++);
	}
}	
