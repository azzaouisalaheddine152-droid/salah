package ProjetDeSynthese;
import java.util.Scanner;

public class admin extends User {

    public admin(String nom, String email, String password) {
        super(nom, email, password);
    }

    @Override
    public void menu() {
        System.out.println("=== Menu Admin ===");
        System.out.println("1. Gérer les utilisateurs");
        System.out.println("2. Valider les salons");
    }
}