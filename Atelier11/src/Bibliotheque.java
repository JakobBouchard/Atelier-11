import java.util.HashMap;

public class Bibliotheque {
    private HashMap<String, String> chansons;

    public Bibliotheque() {
        chansons = new HashMap<>();

    }

    public void ajouterChanson(String titre, String artiste) {
        if(chansons.containsKey(titre)) {
            System.out.printf("Avertissement: %s existe déjà dans la bibliothèque.\n", titre);
        } else {
            chansons.put(titre, artiste);
            System.out.printf("Ajout de la chanson %s de %s dans la bibliothèque.\n", titre, artiste);
            }
    }

    public void rechercherArtiste(String titre) {
        if (chansons.containsKey(titre)) {
            System.out.printf("Cette chanson est interprété par %s\n", chansons.get(titre));

        } else {
            System.out.println("Aucun artiste n'interprète cette chanson");
        }

    }

    public void supprimerChanson(String titre) {
        if (chansons.containsKey(titre)) {
            chansons.remove(titre);
            System.out.printf("%s a été supprimé avec succès!\n",titre);
        } else {
            System.out.printf("Suppression impossible! %s est introuvable.\n", titre);
        }
    }

    public void afficherBiblio() {
        System.out.println(chansons.keySet());
    }

    public void compterChansons() {
        if (chansons.isEmpty()) {
            System.out.println("Aucune chanson dans la bibliothèque.");
        } else if (chansons.size() == 1){
            System.out.println("Il y a 1 chanson dans la bibliothèque.");
        } else {
            System.out.printf("Il y a %s chansons dans la bibliothèque.", chansons.size());
        }
    }
}
