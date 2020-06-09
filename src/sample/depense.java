package sample;

public class depense {
    private String categorie;
    private double montant;
    private String date;
    depense(){

    }
    public depense(String c,double m,String d){
        this.categorie=c;
        this.montant=m;
        this.date=d;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
