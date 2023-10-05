package Gestion_compte;
import java.util.Date;
public class Retrait extends Operation{
    private static int count = 0;

    public Retrait(Date dateOperation, float mont,int numeroOperation) {
        super(dateOperation, String.valueOf(mont),numeroOperation);
        count++;
        this.numeroOperation = count;
    }
}

