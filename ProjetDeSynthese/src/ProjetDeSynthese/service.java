package ProjetDeSynthese;

public class service {
	private int id;
    private String nom;
    private double prix;

    public service(int id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }
}
