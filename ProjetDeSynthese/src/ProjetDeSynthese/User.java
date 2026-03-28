package ProjetDeSynthese;

public abstract class User {
    protected String nom;
    protected String email;
    protected String password;

    public User(String nom, String email, String password) {
        this.nom = nom;
        this.email = email;
        this.password = password;
    }

    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public String getNom() {
        return nom;
    }

    public abstract void menu(); 
}



