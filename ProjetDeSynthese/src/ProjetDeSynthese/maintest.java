package ProjetDeSynthese ;
import java.util.Scanner;

public class maintest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOGIN ===");
        System.out.println("1. Client");
        System.out.println("2. Employe");
        System.out.println("3. Gerant");
        System.out.println("4. Admin");

        int choix = sc.nextInt();
        sc.nextLine();

        System.out.print("Nom: ");
        String nom = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        User user = null;

        switch (choix) {

            case 1:
                user = new Client(nom, email, password);
                break;

            case 2:
                user = new Employe(nom, email, password);
                break;

            case 3:
                System.out.print("Nom du salon: ");
                String nomSalon = sc.nextLine();

                System.out.print("Adresse: ");
                String adresse = sc.nextLine();

                System.out.print("Licence ID: ");
                String licence = sc.nextLine();

                Salon salon = new Salon(nomSalon, adresse, licence);

                user = new Gerant(nom, email, password, salon);
                break;

            case 4:
                user = new admin(nom, email, password);
                break;

            default:
                System.out.println("Choix invalide ");
                return;
        }

        System.out.println("\nBienvenue " + user.getNom() );

        user.menu();

        sc.close();
    }
}