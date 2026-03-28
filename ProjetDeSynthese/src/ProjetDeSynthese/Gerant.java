package ProjetDeSynthese;


public class Gerant extends User {
    private Salon salon;

    public Gerant(String nom, String email, String password, Salon salon) {
        super(nom, email, password);
        this.salon = salon;
    }

    public Salon getSalon() {
        return salon;
    }

    @Override
    public void menu() {
        if (salon != null && salon.isLicenceValide()) {
            System.out.println("=== Menu Gerant ===");
            System.out.println("Salon: " + salon.getNom());
            System.out.println("Licence: " + salon.getLicenceId());
            System.out.println("1. Gérer services");
            System.out.println("2. Voir rendez-vous");
        } else {
            System.out.println("❌ Licence invalide ou salon non autorisé");
        }
    }
}