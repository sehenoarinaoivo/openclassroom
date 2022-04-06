public class NotionMehode{

    public static class Ville {
        //Variables publiques qui comptent les instances
        public static int nbreInstances = 0;
        //Variable privée qui comptera aussi les instances
        private static int nbreInstancesBis = 0;
        private String nomVille;
        private String nomPays;
        private int nbreHabitants;
        private char categorie;


        //Constructeur par défaut
        public Ville(){
            System.out.println("Création d'une ville !");
            //On incrémente nos variables à chaque appel aux constructeurs
            nbreInstances++;
            nbreInstancesBis++;
            nomVille = "Inconnu";
            nomPays = "Inconnu";
            nbreHabitants = 0;
            this.setCategorie();
        }

        //Constructeur avec paramètres
        //J'ai ajouté un « p » en première lettre des paramètres.
        //Ce n'est pas une convention, mais ça peut être un bon moyen de les repérer.
        public Ville(String pNom, int pNbre, String pPays) {
            System.out.println("Création d'une ville avec des paramètres !");
            //On incrémente nos variables à chaque appel aux constructeurs
            nbreInstances++;
            nbreInstancesBis++;
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
        public int getNombreHabitants() {
            return nbreHabitants;
        }
        //Retourne la catégorie de la ville
        public char getCategorie() {
            return categorie;
        }

        //************* MUTATEURS *************
        //Définit le nom de la ville
        public void setNom(String pNom) {
            nomVille = pNom;
        }
        //Définit le nom du pays
        public void setNomPays(String pPays) {
            nomPays = pPays;
        }
        //Définit le nombre d'habitants
        public void setNombreHabitants(int nbre) {
            nbreHabitants = nbre;
            this.setCategorie();
        }
        //Définit la catégorie de la ville
        private void setCategorie() {
            int bornesSuperieures[] = {0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000};
            char categories[] = {'?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
            int i = 0;
            while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
            i++;
            this.categorie = categories[i];
        }

        //Retourne la description de la ville
        public String decrisToi(){
            return "\t"+this.nomVille+" est une ville de "+this.nomPays+ ", elle comporte : "+this.nbreHabitants+" habitant(s) => elle est donc de catégorie : "+this.categorie;
        }
        //Retourne une chaîne de caractères selon le résultat de la comparaison
        public String comparer(Ville v1){
            String str = new String();
            if(v1.getNombreHabitants() > this.nbreHabitants)
            return v1.getNom()+" est une ville plus peuplée que "+this.nomVille;
            else
            return this.nomVille+" est une ville plus peuplée que "+v1.getNom();
            //return str;
        }

        public static int getNombreInstancesBis() {
            return nbreInstancesBis;
        }
            //Le reste du code est le même qu'avant
        

    }

    public static void main(String[] args){

    Ville ville1 = new Ville("San Francisco",34534534,"USA");
    Ville ville2 = new Ville("San Diego", 332455, "USA");

        //Avoir le categorie sur le console
        System.out.println(ville1.categorie);

        //Utilisation de la methode decrisToi()
        System.out.println(ville1.decrisToi());

        //Utilisation de la methode comparer()
        System.out.println(ville1.comparer(ville2));
        
        Ville v = new Ville();
        System.out.println("\nLe nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

        Ville v1 = new Ville("Marseille", 1236, "France");
        System.out.println("\nLe nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

       Ville v2 = new Ville("Rio", 321654, "Brésil");
        System.out.println("\nLe nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis()); 

    }
}