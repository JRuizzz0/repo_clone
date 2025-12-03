import java.util.Scanner;

public class Personaje {
    private String nom;
    private static int dinero;
    private static final Scanner sc = new Scanner(System.in);
    public Personaje(String nom, int dinero) {
        this.nom = nom;
        this.dinero = dinero;
    }
    public void mostrarInfo() {
        System.out.println(nom + " tiene " + dinero + "$.");
    }
    public static void main(String[] args) {
        Personaje jugador = new Personaje("Trevor", 500);
        jugador.mostrarInfo();
        jugador.gastarDinero(jugador);
    }
    public void gastarDinero(Personaje jugador) {

        System.out.println("Cuanto dinero te quieres gastar en ropa: ");
        int cantidad = sc.nextInt();
        if (cantidad < jugador.dinero) {
            int dinerototal = dinero - cantidad;
            System.out.println("Trevor se ha gastado " + cantidad + "$, le quedan " + dinerototal + "$");
        }else  {
            System.out.println("No puedes gastarte más de "+ dinero + "$");
        }





    }


}