import javax.swing.JOptionPane;
public class Main {
    
public static void main(String args[]) {
    int ordem = 0, n = 0, cont = 0, i = 0, aux = 0;
    int num[] =  new int[100];

    ordem = Integer.parseInt(JOptionPane.showInputDialog("Informe a ordem que você queira que seja apresentada (Crescente - 1) (Descrescente - 2)"));
    if ((ordem != 1) && (ordem != 2)) {
        JOptionPane.showMessageDialog(null,"Atenção!!! Apenas utilize umas das duas opções disponíveis!");
        System.exit(0);
    }
    n = Integer.parseInt(JOptionPane.showInputDialog("Informe a Quantidade de Números"));
    for(cont=0;cont<n;cont++) {
        num [cont] = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o "+cont+"º número"));
       }
    if(ordem == 2) {
        System.out.println("Vetor Ordenado descrescente:");
         for(cont=0;cont<n;cont++) {
            for(i=0;i<n-1;i++) {
                if(num[i]<num[i+1]) {
                    aux = num[i];
                    num[i]=num[i+1];
                    num[i+1] = aux;
                }
            }
        }
       for(cont=0;cont<n;cont++) {
            System.out.println(num[cont]);
        }
   }
    else if(ordem == 1){
        System.out.println("Vetor Ordenado Crescente:");
        for(cont=0;cont<n;cont++) {
            for(i=0;i<n-1;i++) {
                if(num[i]>num[i+1]) {
                    aux=num[i];
                    num[i]=num[i+1];
                    num[i+1]=aux;
                }
            }
        }
        for(cont=0;cont<n;cont++) {
            System.out.println(num[cont]);
        }
    }
    }
 }