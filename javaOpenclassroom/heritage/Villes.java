import java.util.Scanner; 

public class Villes{

    public static class Ville {
        protected String nomVille;
        protected int nbreHabitants;
        protected String nomPays;
        protected char categorie;

        //Constructeur par défaut
        public Ville(){
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nbreHabitants = 0;
        nomPays = "Inconnu";
        this.setCategorie();
        }
        //Constructeur avec paramètres
        //J'ai ajouté un « p » en première lettre des paramètres.
        //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
        public Ville(String pNom, int pNbre, String pPays){
            System.out.println("Création d'une ville avec des paramètres !");
                nomVille = pNom;
                nomPays = pPays;
                nbreHabitants = pNbre;
                this.setCategorie();
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
        public char getCategorie(){
            return categorie;
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
            this.setCategorie();
        }
        //Retourne la description de la ville
        public String decrisToi(){
            return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
        }
        //Definir le categorie de la ville//
        private void setCategorie() {
            int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
            char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
            int i = 0;
            while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
            i++;
            this.categorie = categories[i];
            }
        }
        public static class Capitale extends Ville {
            public Capitale(){
                this.nomVille = "toto";
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
    
        Capitale cap = new Capitale();
        System.out.println(cap.decrisToi());
    }
}
