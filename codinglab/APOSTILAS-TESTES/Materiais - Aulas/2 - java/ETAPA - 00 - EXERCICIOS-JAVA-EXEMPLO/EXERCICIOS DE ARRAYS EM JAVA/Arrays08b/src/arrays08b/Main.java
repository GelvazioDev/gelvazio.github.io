package arrays08b;

/**
 *
 * @author geo
 * /*
 * Utilizando dois lacos for, imprima todos os elementos do seguinte array:
 *
 * int array1[][] = {{1,6,7},{2,5,1,0},{2,4,1,2,1}};
 */
public class Main {
    public static void main(String[] args) {
        int array[][] = {{1,6,7},{2,5,1,0},{2,4,1,2,1}};
        for (int i = 0; i < array.length; i++) {
            for (int j=0;j<array[i].length;j++){
                System.out.println(array [i] [j]);
            }
            
        }



      
    }

}
