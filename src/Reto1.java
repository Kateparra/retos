import java.util.Scanner;
public class reto1 {
    public static void main(String[] args) {
        Scanner lect=new Scanner(System.in);
        int cantidad, i;
        float promedio;
        float suma=0;
        String materia;

        System.out.println("Ingrese la asignatura de la que evaluará las notas");
        materia=lect.nextLine();
        System.out.println("Digite la cantidad de notas a evaluar");
        cantidad=lect.nextInt();

        float [] vector=new float[c];
        for (i=0;i<cantidad;i++){
        System.out.println("Digite la nota "+p);
        vector[i]=lect.nextFloat(); 
        suma=suma+vector[i];
        }

        promedio=suma/cantidad;
        
        if (promedio<30) {
            System.out.println("La asignatura es: "+materia);
            System.out.println("Su promedio de notas es: "+promedio+", usted ha reprobado."); 
        } else if (promedio<40) {
            System.out.println("La asignatura es: "+materia);
            System.out.println("Su promedio de notas es: "+promedio+", usted ha pasado raspando."); 
        } else if (promedio>40){
            System.out.println("La asignatura es: "+materia);
            System.out.println("Su promedio de notas es: "+promedio+", usted ha aprobado con buenos resultados."); 
        } else {
            System.out.println("Ha ocurrido un error");
        }

        lectura.close();
    } 
}
