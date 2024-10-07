import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cachorro c = new Cachorro("Lucas", "Golden", "pata", "late");
        Gato g = new Gato("Tijuca", "Albino", "pata", "mia");

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Informações de Cachorro:");
        System.out.println("Nome: " + c.getNome());
        System.out.println("Raça: " + c.getRaca());
        System.out.println("Locomoção: " + c.getLocomocao());
        System.out.println("Late: " + c.getLate());

        System.out.println("Informações de Gato:");
        System.out.println("Nome: " + g.getNome());
        System.out.println("Raça: " + g.getRaca());
        System.out.println("Locomoção: " + g.getLocomocao());
        System.out.println("Mia: " + g.getMia());






    }


}