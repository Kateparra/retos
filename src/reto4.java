import java.util.Scanner;
public class reto4 {
    public static void main(String[] args) {
        Scanner lect=new Scanner (System.in);
        int[][] matriz;
        int fila1, columna,i=4, fila2, columna1;
        matriz=new int[4][4];
        matriz[0][0]=1;
        matriz[0][1]=3;
        matriz[0][2]=3;
        matriz[0][3]=6;
       
        matriz[1][0]=1;
        matriz[1][1]=8;
        matriz[1][2]=4;
        matriz[1][3]=6;
       
        matriz[2][0]=10;
        matriz[2][1]=8;
        matriz[2][2]=4;
        matriz[2][3]=9;
       
        matriz[3][0]=10;
        matriz[3][1]=2;
        matriz[3][2]=2;
        matriz[3][3]=9;

        System.out.println("podrá jugar a Concentrate, tendrá que encontrar las parejas");

        do{
        System.out.println("Intento #"+(4-i));
        System.out.println("Ingrese el valor de la Fila (0-3)");
        fila1=lect.nextInt();
        System.out.println("Ingrese el valor de la Columna (0-3)");
        columna=lect.nextInt();
        System.out.println("Ha salido: "+matriz[fila1][columna]);

        System.out.println(" podrá ingresar su siguiente posición");
        System.out.println("Ingrese el valor de la Fila (0-3)");
        fila2=lect.nextInt();
        System.out.println("Ingrese el valor de la Columna (0-3)");
        columna1=lect.nextInt();
        System.out.println("Ha salido: "+matriz[fila2][columna1]);
        
            if (matriz[fila1][columna]== matriz[0][0] && matriz[fila2][columna1]== matriz[1][0] || 
                matriz[fila2][columna1]== matriz[0][0]  && matriz[fila1][columna]== matriz[1][0]  ) {
                
                System.out.println("Felicidades, ha encontrado las parejas");
                System.out.println("Las parejas eran:");
                System.out.println("");
        
                for (int fila=0;fila<4;fila++) {
                    for (int columna=0;columna<4;columna++) {
                        System.out.print(matriz[fila][columna]+"\t");
                    }
                    System.out.println("|");
                }
        
                System.out.println("");
                return;
                
            } else if (matriz[fila1][column]== matriz[0][1] && matriz[fila2][column1]== matriz[0][2] || 
                    matriz[fila2][column1]== matriz[0][1] && matriz[fila1][column]== matriz[0][2]) { 
                    System.out.println("Felicidades, ha encontrado las parejas");
                    System.out.println("Las parejas eran:");
                    System.out.println("");
            
                    for (int fila=0;fila<4;fila++) {
                        for (int columna=0;columna<4;columna++) {
                            System.out.print(matriz[fila][columna]+"\t");
                        }
                        System.out.println("|");
                    }
            
                    System.out.println("");
                    return;
        
            } else if (matriz[fila1][column]== matriz[0][3] && matriz[fila2][column1]== matriz[1][3] || 
                    matriz[fila2][column1]== matriz[0][3]  && matriz[fila1][column]== matriz[1][3]){
                    System.out.println("Felicidades, ha encontrado las parejas");
                    System.out.println("Las parejas eran:");
                    System.out.println("");
            
                    for (int fila=0;fila<4;fila++) {
                        for (int columna=0;columna<4;columna++) {
                            System.out.print(matriz[fila][columna]+"\t");
                        }
                        System.out.println("|");
                    }
            
                    System.out.println("");
                    return;
                
            } else if (matriz[fila1][column]== matriz[1][1] && matriz[fila2][column1]== matriz[2][1] || 
                    matriz[fila2][column1]== matriz[1][1] && matriz[fila1][column]== matriz[2][1] ){
                    System.out.println("Felicidades, ha encontrado las parejas");
                    System.out.println("Las parejas eran:");
                    System.out.println("");
            
                    for (int fila=0;fila<4;fila++) {
                        for (int columna=0;columna<4;columna++) {
                            System.out.print(matriz[fila][columna]+"\t");
                        }
                        System.out.println("|");
                    }
            
                    System.out.println("");
                    return;

            } else if ((matriz[fila1][column]== matriz[1][2]) && (matriz[fila2][column1]== matriz[2][2]) || 
                    matriz[fila2][column1]== matriz[1][2] && matriz[fila1][column]== matriz[2][2]){
                    System.out.println("Felicidades, ha encontrado las parejas");
                    System.out.println("Las parejas eran:");
                    System.out.println("");
            
                    for (int fila=0;fila<4;fila++) {
                        for (int columna=0;columna<4;columna++) {
                            System.out.print(matriz[fila][columna]+"\t");
                        }
                        System.out.println("|");
                    }
            
                    System.out.println("");
                    return;

            } else if ((matriz[fila1][column]== matriz[2][0]) && (matriz[fila2][column1]== matriz[3][0] ) ||
                    matriz[fila2][column1]== matriz[2][0] && matriz[fila1][column]== matriz[3][0] ){        
                    System.out.println("Felicidades, ha encontrado las parejas");
                    System.out.println("Las parejas eran:");
                    System.out.println("");
            
                    for (int fila=0;fila<4;fila++) {
                        for (int columna=0;columna<4;columna++) {
                            System.out.print(matriz[fila][columna]+"\t");
                        }
                        System.out.println("|");
                    }
            
                    System.out.println("");
                    return;
    
            } else if ((matriz[fila1][column]== matriz[2][3]) && (matriz[fila2][column1]== matriz[3][3]) || 
                    matriz[fila2][column1]== matriz[2][3] && matriz[fila1][column]== matriz[3][3]){
                    System.out.println("Felicidades, ha encontrado las parejas");
                    System.out.println("Las parejas eran:");
                    System.out.println("");
            
                    for (int fila=0;fila<4;fila++) {
                        for (int columna=0;columna<4;columna++) {
                            System.out.print(matriz[fila][columna]+"\t");
                        }
                        System.out.println("|");
                    }
            
                    System.out.println("");
                    return;

            } else if ((matriz[fila1][column]== matriz[3][1]) && (matriz[fila2][column1]== matriz[3][2] ) ||
                    matriz[fila2][column1]== matriz[3][1] && matriz[fila1][column]== matriz[3][2] ){    
                    System.out.println("Felicidades, ha encontrado las parejas");
                    System.out.println("Las parejas eran:");
                    System.out.println("");
            
                    for (int fila=0;fila<4;fila++) {
                        for (int columna=0;columna<4;columna++) {
                            System.out.print(matriz[fila][columna]+"\t");
                        }
                        System.out.println("|");
                    }
            
                    System.out.println("");
                    return;
         
            } else {
                System.out.println("Has fallado");
                
            }
            i--;
        }while(i>0);

        System.out.println("Agotaste tus intentos");
        System.out.println("Las parejas eran:");
        System.out.println("");

        for (int fila=0;fila<4;fila++) {
            for (int columna=0;columna<3;columna++) {
                System.out.print(matriz[fila][columna]+"\t");
            }
            System.out.println("|");
        }

        System.out.println("");
        lect.close();
    } 
}
