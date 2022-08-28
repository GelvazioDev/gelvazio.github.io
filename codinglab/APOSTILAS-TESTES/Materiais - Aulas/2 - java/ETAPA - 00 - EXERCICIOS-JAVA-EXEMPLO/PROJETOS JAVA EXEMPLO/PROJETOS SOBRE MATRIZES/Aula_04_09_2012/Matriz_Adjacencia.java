/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_09_2012;

/**
 *
 * @author aluno
 */
public class Matriz_Adjacencia {

    public static void main(String args[]) {
        int linha = 0, coluna = 0, c = 0, i = 0;
        int a[][] = new int[30][30];
        int b[][] = new int[30][30];
        String[] cidade = {
            "	RIO O SUL       ",
            "	LONTRAS 	",
            "	IBIRAMA	        ",
            "	WITTMARSUN	",
            "	AGROLANDIA	",
            "	POUSO REDONDO	",
            "	RIO DO CAMPO	",
            "	SANTA TEREZINHA	",
            "	VIDAL RAMOS	",
            "	PETROLANDIA	",
            "	JOSE BOATEIUX	",
            "	LAURENTINO	",
            "	RIO DO OESTE	",
            "	TROMBUDO CENTRAL",
            "	PRESIDENTE NEREU",
            "	DONA EMMA	",
            "	ATALANTA	",
            "	MIRIN DOCE	",
            "	TAIO	        ",
            "	ITUPORANGA	",
            "	CHA	        ",
            "	AURORA	        ",
            "	VITOR MEIRELES	",
            "	AGRONOMICA	",
            "	SALETE	        ",
            "	IMBUIA	        ",
            "	VIDAL RAMOS	",
            "	AURORA	        "};

        String[] cidade2 = {
            "	RIO O SUL       ",
            "	LONTRAS 	",
            "	IBIRAMA	        ",
            "	WITTMARSUN	",
            "	AGROLANDIA	",
            "	POUSO REDONDO	",
            "	RIO DO CAMPO	",
            "	SANTA TEREZINHA	",
            "	VIDAL RAMOS	",
            "	PETROLANDIA	",
            "	JOSE BOATEIUX	",
            "	LAURENTINO	",
            "	RIO DO OESTE	",
            "	TROMBUDO CENTRAL",
            "	PRESIDENTE NEREU",
            "	DONA EMMA	",
            "	ATALANTA	",
            "	MIRIN DOCE	",
            "	TAIO	        ",
            "	ITUPORANGA	",
            "	CHA	        ",
            "	AURORA	        ",
            "	VITOR MEIRELES	",
            "	AGRONOMICA	",
            "	SALETE	        ",
            "	IMBUIA	        ",
            "	VIDAL RAMOS	",
            "	AURORA	        "};



        for (linha = 0; linha < 28; linha++) {
            for (coluna = 0; coluna < 28; coluna++) {
                System.out.println("Digite o numero da linha " + linha + " para a coluna " + coluna);
                a[linha][coluna] = 1;
            }
        }

        //Parte que vai mostrar as Cidades na Matriz

        System.out.println("                                       Cidade        KM        Movimento   Pavimentacao   UNI/BI");

            for (linha = 0; linha < 28; linha++) {
                for (coluna = 0; coluna < 28; coluna++) {
                if (coluna==0){
                 System.out.println("            ");   
                }
                System.out.print(a[linha][coluna] +"          ");
                if (linha==28){
               System.out.print("\n"+"   ");
                }
 }
            }
        }
    }