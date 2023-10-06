package Gestion_compte;

import java.util.Date;

public class Operation extends Compte {
    int numeroOperation;
    private static Date dateOperation;
    private float mont;
    private static String op;
    public Operation(){
    }
    public Operation(int numeroOperation,Date dateOperation,float mont,String op){
        this.numeroOperation=numeroOperation;
        this.dateOperation=dateOperation;
        this.mont=mont;
        this.op=op;
    }

    public Operation(Date date, String retrait, float mont) {

    }

    //getters
    public int getNumeroOperation(){
        return numeroOperation;
    }
    public static Date getDateOperation(){
        return dateOperation;
    }
    public double getMont(){
        return mont;
    }
    public static String getOp(){
        return op;
    }
    public String toString(){
        return "Compte 1"+ "code="+getCode()+"statut="+getStatus()+"operations="+getOperations();
    }
}
