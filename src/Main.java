import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Scanner dato = new Scanner (System.in);
        Scanner dato1 = new Scanner (System.in);
        do{
        System.out.println("¿Que dia es hoy?");
        String dia = dato.next();
        switch (dia.toUpperCase()){
            case "LUNES" : System.out.println("Mañana es Martes");
            break;
            case "MARTES" : System.out.println("Mañana es Miercoles");
            break;
            case "MIERCOLES" : System.out.println("Mañana es Jueves");
            break;
            case "JUEVES" : System.out.println("Mañana es Viernes");
            break;
            case "VIERNES" : System.out.println("Mañana es Sabado");
            break;
            case "SABADO" : System.out.println("Mañana es Domingo");
            break;
            case "DOMINGO" : System.out.println("Mañana es Lunes");
            break;
            default :
                a=1;
                System.out.println("Ingrese un dia valido");
            break;

        }}while(a==1);
do{
        System.out.println("¿Eres estudiante o profesor?");
        String rol = dato1.next();
        switch (rol.toUpperCase()) {
            case "ESTUDIANTE" -> System.out.println("Listo para aprender");
            case "PROFESOR" -> System.out.println("Listo para enseñar");
            default -> {
                a=2;
                System.out.println("Ingresa una palabra valida");
            }

        }}while(a==2);




    }
}