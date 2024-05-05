
package interfaces3;

import java.util.Scanner;

 public class TalkAdmin {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
        

        System.out.println("Cual quieres hacer hablar?");
        System.out.println("1: Gato");
        System.out.println("2: Perro");
        System.out.println("3: Reloj Cucu");
        System.out.print("Elija una opción:");
        
        
        int opcion = scanner.nextInt();
             
        switch (opcion) {
            case 1 -> hacerHablar(new Gato());
            case 2 -> hacerHablar(new Perro());
            case 3 -> hacerHablar(new RelojCucu());
            default -> System.out.println("Opción inválida");
        }
    }

    public static void hacerHablar(Hablador sujeto) {
        sujeto.hablar();
    }
}
    