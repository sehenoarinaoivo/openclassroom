import java.util.Scanner;

public class Library{

    // public static 
    private static class Livre{
        private String title;
        private String author;
        private int numberOfPages;
        private String publisher;

            //constructeur par défaut...
            public Livre(){
                title="inconnu";
                author="inconnu";
                numberOfPages=0;
                publisher="inconnu";
           }
            //constructeur avec paramètre
            public Livre(String pTitle, String pAuthor, int pNumberOfPages, String pPublisher){
                title = pTitle;
                author = pAuthor;
                numberOfPages = pNumberOfPages;
                publisher = pPublisher;
            }
            //************* ACCESSEURS *************
            public String getTitle(){
                return title;
            }
            public String getAuthor(){
                return author;
            }
            public int getNumberOfPages(){
                return numberOfPages;
            }
            public String getPublisher(){
                return publisher;
            }
            //************* MUTATEUR *************
            public void setTitle(String pTitle){
                title = pTitle;
            }
            public void setAuthor(String pAuthor){
                author = pAuthor;
            }
            public void setNumberOfPages(int pNumberOfPages){
                numberOfPages = pNumberOfPages;
            }
            public void setPublisher(String pPublisher){
                publisher = pPublisher;
            }


}

    public static void main(String[] args){
        Livre booking = new Livre("Coding is Art","James",234,"OC");
        booking.setTitle("Programmer en Java");
       System.out.println(booking.getTitle() + " est le titre du livre ecrit par " + booking.getAuthor() + ", qui compte environ de " + booking.getNumberOfPages() + " pages");
    }


    }