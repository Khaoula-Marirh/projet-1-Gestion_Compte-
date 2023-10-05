package Gestion_compte;

public class TestApp {
    public static void main(String[] args) throws Exception {
        Compte c1 =new Compte(5000,1000.50);
        Compte c2 =new Compte(5000,123.45);
        c1.Transfer(c2,4000);

        System.out.println(c1.RstSolde());
        System.out.println(c2.RstSolde());
        try {
            // Appel de la méthode retirer
            Compte.retirer(50.0f);
        } catch (soldeNegatifException e) {
            // Gérer l'exception soldNegatifException ici
            System.out.println("Erreur : " + e.getMessage());
        } catch (soldeInsuffisantException e) {
            // Gérer l'exception soldeInsuffisantException ici
            System.out.println("Erreur : " + e.getMessage());
        }


    }
}
