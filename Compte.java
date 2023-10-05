package Gestion_compte;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;




public class Compte {
    private int code;
    private int nomberCom;
    private static double solde;
    private CStatuts status;
    private static ArrayList<Operation> Operations;
    //constructeur avec parametre
    public Compte(int code,double solde,CStatuts status,int nomberCom ,ArrayList<Operation> Operations){
        this.code=++nomberCom;
        this.solde=0;
        this.status=CStatuts.CREATED;
        this.nomberCom=nomberCom;
        this.Operations = new ArrayList<>();
    }
    //constructeur sans parametre
    public Compte(){
    }

    public Compte(int code, double solde) {
        this.code=++nomberCom;
        this.solde=solde;
    }

    //getters setters
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code=code;
    }
    public double getSolde(){
        return solde;
    }
    public void setSolde(double solde){
        this.solde=solde;
    }
    public CStatuts getStatus(){
        return status;
    }
    public void setStatus(CStatuts status){
        this.status=status;
    }
    public List<Operation> getOperations(){
        return Operations;
    }
    public void setOperations(List<Operation> Operations){
        this.Operations= (ArrayList<Operation>) Operations;
    }
    //
    public void addOperation(Operation Operation){
        Operations.add(Operation);
    }

    public void verser (float mont){
        if(mont>0){
            solde += mont;
            Operations.add(new Operation(new Date(),"verser",mont));
        }
    }

    public static void retirer(float mont) throws soldeInsuffisantException, soldeNegatifException {
        if(mont>=0){
            throw new soldeInsuffisantException("Votre solde insuffisant");
        }
        if (mont<0){
            throw new soldeNegatifException("Le montant negatif");
        }
        solde = solde - mont;
        Operations.add(new Operation(new Date(),"retrait",mont));

    }
    //méthode publique qui afficher le reste du solde
    public String RstSolde() {
        return ("solde=" + solde);
    }
    //
    public void Transfer(Compte c2, int i){
        for (Operation op : Operations) {
            System.out.println(" " + op.getNumeroOperation()+" "+Operation.getDateOperation() +" "+ Operation.getOp()+" "+ op.getMont());
        }
    }


}
