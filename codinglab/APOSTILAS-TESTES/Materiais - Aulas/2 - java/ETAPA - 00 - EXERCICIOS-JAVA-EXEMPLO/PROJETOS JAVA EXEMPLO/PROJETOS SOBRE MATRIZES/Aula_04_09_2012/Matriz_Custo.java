/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_09_2012;

/**
 *
 * @author aluno
 */
public class Matriz_Custo {
       
    public static void main(String args[]) {
       int linha = 0, coluna = 0,i = 0;
        int a[][] = new int[30][30];
        int b[]=new int[29];
        int [] kmcidade = {
            10,
            23,
            34,
            43,
            25,
            57,
            31,
            25,
            58,
            69,
            42,
            24,
            47,
            49,
            20,
            24,
            48,
            45,
            67,
            87,
            65,
            45,
            53,
            38,
            53,
            23,
            43,
            14
        };
        String []cidadedois={
            "	RSL",
            "	LON",
            "	IBI",
            "	WIT",
            "	AGR",
            "	PRE",
            "	RCA",
            "	STA",
            "	VRA",
            "	PET",
            "	JBO",
            "	LAU",
            "	ROE",
            "	TRC",
            "	PRN",
            "	DEM",
            "	ATA",
            "	MDO",
            "	TAI",
            "	ITU",
            "	CHA",
            "	AUR",
            "	VME",
            "	AGR",
            "	SAL",
            "	IMB",
            "	VRA",
            "	AUR"};
        String[] cidade = {
"	RIO O SUL       "	,
"	LONTRAS 	"	,
"	IBIRAMA	        "	,
"	WITTMARSUN	"	,
"	AGROLANDIA	"	,
"	POUSO REDONDO	"	,
"	RIO DO CAMPO	"	,
"	SANTA TEREZINHA	"	,
"	VIDAL RAMOS	"	,
"	PETROLANDIA	"	,
"	JOSE BOATEIUX	"	,
"	LAURENTINO	"	,
"	RIO DO OESTE	"	,
"	TROMBUDO CENTRAL"	,
"	PRESIDENTE NEREU"	,
"	DONA EMMA	"	,
"	ATALANTA	"	,
"	MIRIN DOCE	"	,
"	TAIO	        "	,
"	ITUPORANGA	"	,
"	CHA	        "	,
"	AURORA	        "	,
"	VITOR MEIRELES	"	,
"	AGRONOMICA	"	,
"	SALETE	        "	,
"	IMBUIA	        "	,
"	VIDAL RAMOS	"	,
"	AURORA	        "};
for (i = 0; i < 28; i++){
        for (linha = 0; linha < 1; linha++) {
            for (coluna = 0; coluna < 28; coluna++) {
             b[i] = kmcidade[i];
            }
        }
}
        //Parte que vai mostrar as Cidades na Matriz
System.out.println("             ");    
        for (i = 0; i < 28; i++) {
            for (linha = 0; linha < 1; linha++) {
                for (coluna = 0; coluna < 1; coluna++) {
                     if (i==0){
                     System.out.print("                                 ");   
                    } 
                    if (linha == 0) {
                        System.out.print(cidadedois[i]);
                    }
                }
            }
        }
        for (i = 0; i < 28; i++) {
            for (linha = 0; linha < 1; linha++) {
                for (coluna = 0; coluna < 28; coluna++){
                    if ((coluna==0)&(linha==0)){
                     System.out.print("\n" + cidade[i] + "            ");   
                    }                    
                    System.out.print("    " +b[i] + "    ");
                    
                }
                }
            }
        }

    }

    

