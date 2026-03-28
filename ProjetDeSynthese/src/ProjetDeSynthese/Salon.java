package ProjetDeSynthese;

public class Salon {
	
	    private String nom;
	    private String adresse;
	    private String licenceId;

	    public Salon(String nom, String adresse, String licenceId) {
	        this.nom = nom;
	        this.adresse = adresse;
	        this.licenceId = licenceId;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getLicenceId() {
	        return licenceId;
	    }

	    public boolean isLicenceValide() {
	        return licenceId != null && !licenceId.isEmpty();
	    }
	}
