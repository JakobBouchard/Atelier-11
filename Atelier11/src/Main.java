public class Main {

    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque();

        bibliotheque.ajouterChanson("A lot", "21 Savage");
        bibliotheque.ajouterChanson("Jersey", "Future");
        bibliotheque.ajouterChanson("Red sky", "21 Savage");
        bibliotheque.ajouterChanson("Life is good", "Future");
        bibliotheque.ajouterChanson("My eyes", "Travis Scott");
        bibliotheque.ajouterChanson("Escape Plan", "Travis Scott");
        bibliotheque.ajouterChanson("A lot", "21 Savage");
        bibliotheque.rechercherArtiste("Jersey");
        bibliotheque.rechercherArtiste("Yo");
        bibliotheque.supprimerChanson("Escape Plan");
        bibliotheque.afficherBiblio();
    }
}
