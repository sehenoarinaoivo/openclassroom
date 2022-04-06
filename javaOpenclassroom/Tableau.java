import java.util.Scanner;

public class Tableau {
    public static void main(String args[]){
    char tableauCaractere[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};  //Tableau contenant lettre 
    String[] tableauString = {"Leva","Koto","Lita","Bema"};         //Tableau String 
    String[][] tableauDeuxDim = {{"Rano","Vary","Sotro","Vilany"},{"Angady","Famaky","Antsy","Lefona"}};
    int[] tableauInt = {2,3,21,64,36,31,46,12};                     //Tableau contenant entier naturel
    int i = 0;
    char reponse = ' ',carac = ' ';
    Scanner sc = new Scanner(System.in);
    do {//Boucle principale
        
        do {//On répète cette boucle tant que l'utilisateur n'a pas rentré une lettre figurant dans le tableau
        i = 0;
        System.out.println("Rentrez une lettre en minuscule, SVP ");
        carac = sc.nextLine().charAt(0);

        //Boucle de recherche dans le tableau
        //while(i < tableauCaractere.length && carac !=tableauCaractere[i])
        i++;
            //Si i < 7 c'est que la boucle n'a pas dépassé le nombre de cases du tableau
            if (i < tableauCaractere.length)
            System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");
            else //Sinon
            System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");
        
        }while(i >= tableauCaractere.length);

    //Tant que la lettre de l'utilisateur ne correspond pas à une lettre du tableau

        do{
        System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
        reponse = sc.nextLine().charAt(0);
        }while(reponse != 'N' && reponse != 'O');

    }while (reponse == 'O');
    String chaine = "chaine";
    int longueur = 0;
    double x = 0.0;
    x=Math.random();
    longueur = chaine.length();
    System.out.println("Au revoir  ! Chiffre aletaoir est " + x);

    parcourirTableau(tableauString);

    toString(tableauString);

    parcourirTableau(tableauInt);

    parcourirTableau(tableauDeuxDim);
    }
    //Methode Pemet de parcourir un tableau String
    static void parcourirTableau(String[] tabBis)
    {
    for(String str : tabBis)
    System.out.println(str);
    }

    //Methode Permet d'arrondir un double String
    public static double arrondi(double A, int B) {
    return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10,
    B);
    }

    //Methode 
    static String toString(String[] tab)
    {
    System.out.println("Méthode toString() !\n----------");
    String retour = "";
    for(String str : tab)
    retour += str + "\n";
    return retour;
    }

    //Methode pour parcourir un tableau de entier
    static void parcourirTableau(int[] tab)
    {
    for(int str : tab)
    System.out.println(str);
    }

    //Methode qui permet de parcourir tableau a deux dimensions...
    static void parcourirTableau(String[][] tab)
    {
    for(String tab2[] : tab)
    {
    for(String str : tab2)
    System.out.println(str);
    }

    }
}