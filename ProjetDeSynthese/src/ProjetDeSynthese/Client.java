package ProjetDeSynthese;
import java.util.Scanner;

class Client extends User {

    public Client(String nom, String email, String password) {
        super(nom, email, password);
    }

    public void creerRendezVous(Scanner sc, Employe e) {
        System.out.print("Date RDV: ");
        String date = sc.nextLine();

        System.out.print("Service: ");
        String nomService = sc.nextLine();

        service s = new service(1, nomService, 50);

        rendezvous rdv = new rendezvous(1, date, s, this, e);
        rdv.afficher();
    }
jhlhlhlhljb
    @Override
    public void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Menu Client ===");
        System.out.println("1. Prendre RDV");

        int choix = sc.nextInt();
        sc.nextLine();

        if (choix == 1) {
        	
            Employe e = new Employe("Omar", "omar@mail.com", "123");
            creerRendezVous(sc, e);
            
        }
    }
}	

