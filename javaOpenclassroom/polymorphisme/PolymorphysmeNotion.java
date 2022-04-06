public class PolymorphysmeNotion {

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
        public String toString(){
        return "\t"+this.nomVille+" est une ville de "+this.nomPays+", elle comporte : "+this.nbreHabitants+" => elle est donc de catégorie : "+this.categorie;
        }

    }
    public static class Capitale extends Ville {
        private String monument;
        //Constructeur par défaut
        public Capitale(){
        //Ce mot clé appelle le constructeur de la classe mère
        super();
        monument = "aucun";
        }
        //Constructeur d'initialisation de capitale
        public Capitale(String nom, int hab, String pays, String monument){
        super(nom, hab, pays);
        this.monument = monument;
        }

        /**
        * @return le nom du monument
        */
        public String getMonument() {
        return monument;
        }
            //Définit le nom du monument
            public void setMonument(String monument) {
            this.monument = monument;
            }

            public String decrisToi(){
            String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";
            System.out.println("Invocation de super.decrisToi()");
            return str;
            }

            public String toString(){
            String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
            return str;
            }
       
    }
    public static void main(String[] args){

        //Définition d'un tableau de villes null
        Ville[] tableau = new Ville[6];
        //Définition d'un tableau de noms de villes et un autre de nombres d'habitants
        String[] tab = {"Marseille", "lille", "caen", "lyon", "paris","nantes"};
        int[] tab2 = {123456, 78456, 654987, 75832165, 1594, 213};
        //Les trois premiers éléments du tableau seront des villes,
        //et le reste, des capitales

        for(int i = 0; i < 6; i++){
            if (i <3){
            Ville V = new Ville(tab[i], tab2[i], "france");
            tableau[i] = V;
            }
            else{
            Capitale C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
            tableau[i] = C;
            }
        }
        //Il ne nous reste plus qu'à décrire tout notre tableau !
        for(Ville V : tableau){
            System.out.println(V.decrisToi()+"\n");
        }
        //Il ne nous reste plus qu'à décrire tout notre tableau !
        for(Object obj : tableau){
            System.out.println(obj.toString()+"\n");
        }

    }
}