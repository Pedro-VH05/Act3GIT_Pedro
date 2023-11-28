package entornos.egit;
import java.util.Random;
public class Tarea3GIT {

  public static void main(String[] args) {
    
    System.out.println("NÚMEROS ALEATORIOS TAREA EGIT");
    System.out.println("-----------------------------");
    
    Random generadorNumeros = new Random();
    for (int i = 0; i <= 20; i++) {
      double numeroAleatorio = (generadorNumeros.nextDouble() * 10) + 1;
      System.out.println(numeroAleatorio);
    }
    
  }

}
