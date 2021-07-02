package MyFmaily;

public class MyFamily {
    public static void main(String[] args) {

        //Atributos
        String apellido = "Loya";
        String myName = "Roberto";
        String momName = "Rossy";
        String dadName = "Jose";
        String broName = "Rafael";
        String grandmaName = "Cuquis";
        String auntName = "Paty";
        String familyDog = "Nova";

        //Variables
        int familyMembers = 6;
        int familyPets = 1;
        int myAge = 37;

        // Updating Variables
        int momAge = myAge + 30;
        int broAge = myAge + 10;
        int grandmaAge = momAge + 25;

        //Impresiones
        System.out.println("My name is " + myName + " and I'm " + myAge +" years old.");
        System.out.println("My brother " + broName + " is " + broAge + " years old. ");
        System.out.println("My Mother's age is " + momAge + " while my Grandma is " + grandmaAge + " years old.");
        System.out.println("Finally, we have " + familyPets + " dog in the house. Its name is " + familyDog);
    }
}
