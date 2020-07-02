
package filas;
import java.util.Scanner;
public class FILAS {
static int[][] generaMatriz(int filas, int columnas){
    int[][] Nmatriz=new int[filas][columnas];
    int i,j;
    
        for (i=0; i < Nmatriz.length; i++){
            for(j=0; j < Nmatriz[i].length; j++){
            Nmatriz[i][j]= (int)(Math.random()*10+1);
            }
        }
        
    return Nmatriz;
}
static void muestraMatriz(int[][] Nmatriz){
    int i,j;
    for (i=0; i <Nmatriz.length; i++){
        for (j=0; j < Nmatriz[i].length; j++){
            System.out.printf("%3d", Nmatriz[i][j]);
        }
        System.out.println();
    }
    
}
static int[][] transponer(int[][] Nmatriz){
   int[][] Resul= new int[Nmatriz[0].length][Nmatriz.length];
   int filas, columnas ;
   for(columnas=0; columnas<Nmatriz[0].length; columnas++){ 
        for(filas=0;filas < Nmatriz.length; filas++){
        Resul[columnas][filas]=Nmatriz[filas][columnas];
        
        }
   }
    return Resul;

}
  
    public static void main(String[] args) {
     int [][]Nmatriz;
     int Nfilas, Ncolumnas;
      Scanner leer = new Scanner(System.in);
     
      System.out.println("Programa que crea matriz con numeros aleatoreos del 1 al 10, y posteriormente transpone filas y columnas \n");
      System.out.println("Ingresa el numero de filas:\n");
     Nfilas= leer.nextInt();
      System.out.println("Ingresa el numero de Columnas:\n ");
      Ncolumnas= leer.nextInt();
      
      
     Nmatriz=generaMatriz(Nfilas,Ncolumnas);
     System.out.println("Matriz original: ");
     muestraMatriz(Nmatriz);
     System.out.println();
      System.out.println("Matriz transpuesta: ");
      Nmatriz = transponer(Nmatriz);
      muestraMatriz(Nmatriz);
     
     
        // TODO code application logic here
    }
    
}
