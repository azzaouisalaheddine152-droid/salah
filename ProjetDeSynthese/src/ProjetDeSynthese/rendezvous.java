package ProjetDeSynthese;

public class rendezvous {
	    private int id;
	    private String date;
	    private String statut;

	    private service service;
	    private Client client;
	    private Employe employe;

	    public rendezvous(int id, String date, service service, Client client, Employe employe) {
	        this.id = id;
	        this.date = date;
	        this.service = service;
	        this.client = client;
	        this.employe = employe;
	        this.statut = "En attente";
	    }

	    public void afficher() {
	        System.out.println("===== RDV =====");
	        System.out.println("Date: " + date);
	        System.out.println("Client: " + client.getNom());
	        System.out.println("Employe: " + employe.getNom());
	        System.out.println("Service: " + service.getNom());
	        System.out.println("Statut: " + statut);
	    }

}
