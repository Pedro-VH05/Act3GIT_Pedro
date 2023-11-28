package entornos.egit;
import java.util.Random;
import java.util.Scanner;
public class Tarea3GIT {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("NÚMEROS ALEATORIOS TAREA EGIT");
    System.out.println("-----------------------------");
    System.out.println("Escribe el intervalo inicial de números: ");
    int primerIntervalo = Integer.parseInt(sc.nextLine());
    System.out.println("Escribe el intervalo final de números: ");
    int segundoIntervalo = Integer.parseInt(sc.nextLine());
    System.out.println("Escribe un número que esté dentro de los intervalos de números: ");
    int numeroDentroIntervalo = Integer.parseInt(sc.nextLine());
    
    Random generadorNumeros = new Random();
    for (int i = 0; i <= segundoIntervalo; i+= 7) {
      double numeroAleatorio = (generadorNumeros.nextDouble() * (segundoIntervalo - primerIntervalo)) + primerIntervalo;
      System.out.println(numeroAleatorio);
    }
    
    if ((primerIntervalo <= numeroDentroIntervalo) && (numeroDentroIntervalo <= segundoIntervalo)) {
      System.out.println("El número " + numeroDentroIntervalo + " está dentro del intervalo");
    } else {
      System.out.println("El número " + numeroDentroIntervalo + " no está dentro del intervalo");
    }
    
  }

}
