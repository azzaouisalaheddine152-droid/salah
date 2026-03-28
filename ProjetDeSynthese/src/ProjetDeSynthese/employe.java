package ProjetDeSynthese;
import java.util.Scanner;

class Employe extends User {

    public Employe(String nom, String email, String password) {
        super(nom, email, password);
    }

    public void voirPlanning() {
        System.out.println("Planning des rendez-vous...");
    }

    public void terminerRdv() {
        System.out.println("Rendez-vous terminé");
    }

    @Override
    public void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Employe ===");
        System.out.println("1. Voir planning");
        System.out.println("2. Terminer RDV");

        int choix = sc.nextInt();

        if (choix == 1) voirPlanning();
        else if (choix == 2) terminerRdv();
    }
}