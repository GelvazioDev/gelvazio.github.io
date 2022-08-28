package ExerciciosCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op;
		Scanner scan = new Scanner (System.in);
		
		ArrayList<String> estoqueFrutas = new ArrayList<>();
		
		do {
		
		System.out.println("\t\t::: Estoque de Frutas :::");
		System.out.println("__________________________________________________________________________");
		System.out.println("\n (1) - Adicionar fruta ao estoque"
				+ "\n (2) - Remover fruta"
				+ "\n (3) - Atualizar "
				+ "\n (4) - Mostrar todas as frutas do estoque"
				+ "\n (0) - Sair do programa");
		System.out.println("__________________________________________________________________________");
		System.out.println("\n\t\t::Escolha uma opção ::");
		op = scan.nextInt();
		
		switch (op) {
		case 1: 
			scan.nextLine(); // vai limpar o buffer de memória
			System.out.println("\nDigite a fruta que queira adicionar:");
			String fruta = scan.next().toUpperCase();
			estoqueFrutas.add(fruta);
			break;
		case 2:
			scan.nextLine(); // vai limpar o buffer de memória
			System.out.println("\nDigite a fruta que queira remover:");
			String frutaRe = scan.next().toUpperCase();
			estoqueFrutas.add(frutaRe);
				if(estoqueFrutas.contains(frutaRe)) {
				estoqueFrutas.remove(frutaRe);
				}else {
				System.err.println("\n Fruta não reconhecida");
				}
			break;
		case 3:
			scan.nextLine(); // vai limpar o buffer de memória
			System.out.println("\n Digite o que deseja remover:");
			String verifica = scan.next().toUpperCase();
			System.out.println("\n Digite o que deseja incluir:");
			String novaFruta = scan.next().toUpperCase();
			estoqueFrutas.add(novaFruta);
				if(estoqueFrutas.contains(verifica.toUpperCase())) {
					estoqueFrutas.remove(verifica.toUpperCase());
					estoqueFrutas.add(novaFruta.toUpperCase());
				}
				else {
					System.out.println("Fruta não encontrada.");
				}
			break;
		case 4:
			System.out.println("\nFrutas no estoque");
			System.out.println("\n" + estoqueFrutas+ "\n");
			break;
			default:
				System.out.println("Você finalizaou o programa. Obrigado!!");
			}
		}
		while(op!=0);
		}

	}
	
