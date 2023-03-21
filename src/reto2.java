import java.util.Scanner;
public class reto2 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int cantidad, i, posicion=0;
        float menor, mayor;
        String ganador="";
        

        System.out.println("Digite la cantidad de competidores que participarán");
        cantidad=lectura.nextInt();

        float[]tiempo=new float[cantidad];
        String[]nombre=new String[cantidad];

        for (p=0;p<c;p++) {
            System.out.println("Digite el nombre del participante número "+i);
            nombre[i]=lect.next();
            System.out.println("Digite el tiempo (en segundos) del participante número "+i);
            tiempo[i]=lect.nextFloat();
        }

        for (p=0;p<nombre.length && i<tiempo.length;i++) {
            System.out.println("Nombre del participante #"+i+": "+nombre[i]+" - "+" Tiempo: "+tiempo[i]+" segundos");
        }

        menor=tiempo[0];
        mayor=tiempo[0];
        for (p=0;p<nombre.length && p<tiempo.length;i++) {
            if (mayor>tiempo[i]){
                mayor = tiempo[i];
                ganador=nombre[i];
                posi= p;
            }else if(men<tiempo[i]){
                men=tiempo[i];
            }
        }

        System.out.println("El ganador es el jugador #"+posicion+"\n"+ganador+"\nSu tiempo fue: "+mayor+" segundos." );
        lectura.close();
    } 
}