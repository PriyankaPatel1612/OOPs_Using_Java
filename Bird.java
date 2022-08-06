//Initializing objects using reference variable

public class Bird {
    
    int age;                     //reference variable
    String colour;               //reference variable
    public static void main(String[] args) {
        
        Bird sparrow = new Bird();
        sparrow.age=7;
        sparrow.colour="brown";

        System.out.println("Sparrow's age - " + sparrow.age+ " Sparrow's colour - " + sparrow.colour);
    }
}
