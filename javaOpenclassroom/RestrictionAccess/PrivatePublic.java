public class PrivatePublic {

    public static String power = "Double.infinity";
    
    private static class PrivateClass {
        int internalProperty = 0; // assigne automatiquement package-private par défaut
        boolean defaultProperty = true; // assigne automatiquement package-private 
        public boolean publicProperty = true; // convertit automatiquement en package-private 
        private String fileprivateProperty = "Hello!"; //disponible seulement pour la classe
        private void privateMethod() {
        }
    }


    public static void main(String[] args){
        System.out.println(PrivatePublic.power);

        // PrivateClass a = new PrivateClass(); // Erreur
         PrivateClass b = new PrivateClass(); // Ok
         PrivateClass c = new PrivateClass(); // Ok

        int[] myArray = new int[]{7,2,4};

        for (int i=0; i<myArray.length; i++) {

            System.out.println(myArray[i]);

        }
    }

}