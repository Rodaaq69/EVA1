import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int age=0;
        String name;
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        name=read.nextLine();
        System.out.println("Ahora ingresa tu edad");
        age=read.nextInt();
        System.out.print("Hola "+ name+ ", tu edad es "+ age);
    }
}
