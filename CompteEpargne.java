package Gestion_compte;

public class CompteEpargne extends Compte{
    private double taux;
    public CompteEpargne(int code, double solde, double taux) {
        super(code, solde);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }
}
