package Gestion_compte;

public class TestApp {
    public static void main(String[] args) throws Exception {
        CompteEpargne c1 = new CompteEpargne(1,1000,2);
        CompteEpargne c2 = new CompteEpargne(2,3000,2);
        c1.Transfer(c2,4000);

        c1.verser(3000);
        c1.verser(4000);



        System.out.println("Solde="+c1.getSolde());
        System.out.println("Solde="+c2.getSolde());
//        try {
//            // Appel de la méthode retire
//            Compte.retirer(50.0f);
//        } catch (soldeNegatifException e) {
//            // Gérer l'exception soldNegatifException ici
//            System.out.println("Erreur : " + e.getMessage());
//        } catch (soldeInsuffisantException e) {
//            // Gérer l'exception soldeInsuffisantException ici
//            System.out.println("Erreur : " + e.getMessage());
//        }


    }
}
