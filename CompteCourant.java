package Gestion_compte;

public class CompteCourant extends Compte{
    private double decouvert;

    public CompteCourant(int code, double solde, double decouvert) {
        super(code, solde);
        this.decouvert = decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }
}
