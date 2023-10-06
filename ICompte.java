package Gestion_compte;

import java.util.ArrayList;

public interface ICompte {
    void Retrait(float mont);
    void verser(float mont);
    double solde();
    ArrayList<Operation> Operation();
}
