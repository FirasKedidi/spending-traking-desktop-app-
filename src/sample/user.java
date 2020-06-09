package sample;

public class user {
    String nom;
    String prénom;
    String nomUtilisateur;
    String motDePasse;
    user(String n,String p,String nu,String m){
        this.nom=n;
        this.prénom=p;
        this.nomUtilisateur=nu;
        this.motDePasse=m;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }
}
