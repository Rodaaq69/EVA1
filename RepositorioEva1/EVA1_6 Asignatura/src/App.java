import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String clave, nombre, carrera;
        int creditos, horasTeo, horasPrac;
        boolean tipoMat;
        Scanner read = new Scanner(System.in);
        System.out.println("Introduce la clave de la asignatura");
        clave=read.nextLine();
        System.out.println("Introduce tu nombre");
        nombre= read.nextLine();
        System.out.println("Ingresa la carrera");
        carrera= read.nextLine();
        System.out.println("Ingrese sus creditos");
        creditos = read.nextInt();
        System.out.println("Ingrese el total de horas de teoria");
        horasTeo= read.nextInt();
        System.out.println("Ingrese el total de horas de practica");
        horasPrac = read.nextInt();
        System.out.println("Introduce el tipo de materia [True]Generica [False]Especialidad");
        tipoMat = read.nextBoolean();

        System.out.println("Nombre: "+nombre+ "\n Carrera: "+ carrera+ "\n Clave: "+ clave+"\n Creditos:"+ creditos+"\n Horas de Teoria: "+ horasTeo+"\n Horas de Practicas: "+ horasPrac);

        if (tipoMat==true) {
            System.out.println("El tipo de materia es Generica");
        } else { System.out.println("El tipo de materia es Especialidad");
        };
        
    }
}
