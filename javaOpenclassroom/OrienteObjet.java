import java.util.Scanner; 

public class OrienteObjet {

    public static class Ville {
        private String nomVille;
        private int nbreHabitants;
        private String nomPays;

        //Constructeur par défaut
        public Ville(){
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nbreHabitants = 0;
        nomPays = "Inconnu";
        }
        //Constructeur avec paramètres
        //J'ai ajouté un « p » en première lettre des paramètres.
        //Ce n'est pas une convention, mais ça peut être un bon moyen dE les repérer.
        public Ville(String pNom, int pNbre, String pPays){
            System.out.println("Création d'une ville avec des paramètres !");
                nomVille = pNom;
                nomPays = pPays;
                nbreHabitants = pNbre;
        }

        //************* ACCESSEURS *************
        //Retourne le nom de la ville
        public String getNom(){
        return nomVille;
        }
        //Retourne le nom du pays
        public String getNomPays(){
        return nomPays;
        }
        // Retourne le nombre d'habitants
        public int getNombreHabitants(){
        return nbreHabitants;
        }

        //************* MUTATEURS *************
        //Définit le nom de la ville
        public void setNom(String pNom){
        nomVille = pNom;
        }
        //Définit le nom du pays
        public void setNomPays(String pPays){
        nomPays = pPays;
        }
        //Définit le nombre d'habitants
        public void setNombreHabitants(int nbre){
        nbreHabitants = nbre;
        }
      }

    public static void main(String[] args) {
        Ville ville1 = new Ville("Mandritsara",103244,"Mada");
        System.out.println("Nom:" + ville1.nomVille + "\nPays: " + ville1.nomPays + "\nHabitant: "+ ville1.nbreHabitants);

        Ville ville2 = new Ville("Marseille", 123456789, "Russie");
        ville2.nomPays = "France";
        System.out.println(ville2.nomPays);

    System.out.println("\n ville 1 = "+ville1.getNom()+" ville de "+ville1.getNombreHabitants()+ " habitants se situant en "+ville1.getNomPays());
    
    System.out.println("\n ville 2 = "+ville2.getNom()+" ville de "+ville2.getNombreHabitants()+ " habitants se situant en "+ville2.getNomPays());

    Ville ville3 = new Ville("Manille",3453563,"Philipine");
    
    System.out.println(" \n v2 = "+ville3.getNom()+" ville de "+ville3.getNombreHabitants()+ " habitants se situant en "+ville3.getNomPays()+"\n\n");
    
    /*Nous allons interchanger les Villes v1 et v2 tout ça par l'intermédiaire d'un autre objet Ville. */
    Ville temp = new Ville();
        temp = ville1;
        ville1 = ville2;
        ville2 = temp;   
    System.out.println("ville1 = "+ville1.getNom()+ " ville de "+ ville1.getNombreHabitants() + " habitants se situant en "+ville1.getNomPays());
    System.out.println("\nville2 = "+ville2.getNom()+ " ville de "+ ville2.getNombreHabitants() + " habitant se situant en " + ville1.getNomPays()+"\n\n");
    

    /*Nous allons maintenant interchanger leurs noms cette fois par le biais de leurs mutateurs.*/
        ville1.setNom("Hong Kong"); ville1.setNomPays("Chine");
        ville2.setNom("Djibouti");  ville2.setNomPays("Djibouti");
        ville3.setNom("Rio"); ville3.setNomPays("Bresil");

    System.out.println(" ville1 = "+ville1.getNom()+" ville de "+ville1.getNombreHabitants()+ " habitants se situant en "+ville1.getNomPays());
    System.out.println("\n ville2 = "+ville2.getNom()+" ville de "+ville2.getNombreHabitants()+ " habitants se situant en "+ville2.getNomPays()+"");
    System.out.println("\n ville3 = "+ville3.getNom()+" ville de "+ville3.getNombreHabitants()+ " habitants se situant en "+ville3.getNomPays()+"\n\n");
   
    }

}
