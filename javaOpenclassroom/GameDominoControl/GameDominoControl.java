package GameDomino;

import java.util.Scanner;

public class GameDominoControl {
    public static Scanner sc = new Scanner(System.in);
    public static class Gamer{
        //public int idGamer=0;
        public String nomJoueur="jouer";
        public String statusJoueur="N";
        public int sommePari=0;
        public int nbrInstance;
        
        public Gamer(){         //Constructeur d'objet Gamer...
            //System.out.println(" ");
            //idGamer=sc.nextInt();
            System.out.println("Creation de joueur \n Somme initial");
            sommePari;
            nomJoueur
            ;
            statusJoueur;
            nbrInstance++;
        }
        public Gamer(int sommePari, String nomJoueur, String statusJoueur){
            //idGamer=0;
            sommePari=0;
            nomJoueur="inconnu";
            statusJoueur="N";
            nbrInstance++;
        }

        //********* ACCESSEURS *******/
        //public int getIdGamer(){
        //    return idGamer;     //Return la valeur id de joueur
        //}
        
        public String getStatusJoueur(){
            return statusJoueur;    //Return la valeur d status de joueur
        }
        public int getSommePari(){  //Return la valeur de somme pari de joueur
            return sommePari;
        }
        public String getNomJoueur(){
            return nomJoueur;       //Return la valeur d nom joueur
        }

        //********* MUTATEUR *******/
        //public void setIdGamer(int pIdGamer){
        //    idGamer = pIdGamer;
        //}
        public void setStatusJoueur(String pStatusJoueur){
            statusJoueur = pStatusJoueur;
        }


        //******* METHODES *******/
        public void setSommePari(){     //Somme Pari depend de statusJoueur
            int somme=0;

                if(statusJoueur=="N"){
                    sommePari+=0;

                } else if(statusJoueur=="V"){
                            System.out.println("combien de somme il a gagnE:");
                            somme = sc.nextInt();
                            sommePari += somme;

                        } else if(statusJoueur=="D"){
                            System.out.println("combien de somme il a perdu:");
                                somme = sc.nextInt();
                                if(somme<0){
                                    sommePari+=somme;
                                } else if(somme>=0){
                                    sommePari-=somme;
                                }

                            }
            
        }

        public String decritoi(){
            return this.nomJoueur+ " avec somme de " + this.sommePari +"\n";
        }
        
    
    }

    public static void main(String[] args){
        
        int nombreJoueur= 5;

        while(nombreJoueur==5){
            System.out.println("entrer le nombre de joueur");
            nombreJoueur = sc.nextInt();
            //instanciation de nombre de joueur
                if(nombreJoueur==2){  
                    Gamer gamer1 = new Gamer();
                    Gamer gamer2 = new Gamer();
                    
                    Gamer[] listgamer = {gamer1,gamer2};

                     for(int i = 0; i < listgamer.length; i++){
                        System.out.println(listgamer[i].decritoi()) ;
                    } 
                }
                    else if(nombreJoueur==3){
                    Gamer gamer1 = new Gamer();
                    Gamer gamer2 = new Gamer();
                    Gamer gamer3 = new Gamer();

                    Gamer[] listgamer1 = {gamer1, gamer2, gamer3};

                     for(int i = 0; i < listgamer1.length; i++){
                        System.out.println(listgamer1[i].decritoi()) ;
                        }
                    }
                        else if(nombreJoueur==4){
                        Gamer gamer1 = new Gamer();
                        Gamer gamer2 = new Gamer();
                        Gamer gamer3 = new Gamer();
                        Gamer gamer4 = new Gamer();

                        Gamer[] listgamer2 = {gamer1, gamer2, gamer3, gamer4};

                         for(int i = 0; i < listgamer2.length; i++){
                            System.out.println(listgamer2[i].decritoi()) ;
                            }
                        }
                            else{
                                nombreJoueur = 5;
                            }
        }

        //for(int i = 0; i < listgamer.length; i++){
        //   System.out.println(listgamer[i].decritoi()) ;
        //}           
    }
}

