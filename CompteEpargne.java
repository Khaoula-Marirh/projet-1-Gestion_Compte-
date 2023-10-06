package Gestion_compte;

import java.util.Date;

public class CompteEpargne extends Compte{
    private double taux;
    public CompteEpargne(int code, double solde, double taux) {
        super(code, solde,CStatuts.CREATED);
        this.taux = taux;
    }

    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux){
        this.taux= taux;
    }
    public double getSolde(){
        return super.getSolde();
    }

    public void lesInterets() {
        double interets = super.getSolde() * (1+taux/100);

        int n=0;
        getOperations().add(new Versement(n++,new Date(),interets));
    }
    public void Transfer(CompteEpargne c2,int i){

    }


    }
