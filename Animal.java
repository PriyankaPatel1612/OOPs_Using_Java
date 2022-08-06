public class Animal {

    String animal;

    Animal(String animal){
        this.animal = animal;
    }

    public static void main(String[] args) {
        Animal buzo;                                   //object declaration
        buzo = new Animal("buzo");             //object created
        buzo.run();                                   //calling method
        buzo.eat();

        Animal lion;
        lion = new Animal("lion");
        lion.run();

        Birds sparrow = new Birds();
        sparrow.fly("sparrow");
    }

    void run(){           
        System.out.println(animal + " is running");
    }

    void eat(){
        System.out.println(animal + " is eating");
    }
    
}

class Birds{

    void fly(String bird){
        System.out.println(bird + " is flying");
    }
}