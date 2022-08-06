//Initializing objects using methods

public class Human {
    
    int age;
    String gender;
    String human;

    Human(String human){
      this.human=human;
    }
   public static void main(String[] args) {
    
      Human Ram = new Human("Ram");
      Ram.inIt(14,"Male" );
      Ram.display();
      Human Rekha = new Human("Rekha");
      Rekha.inIt(12,"Female" );
      Rekha.display();
      

   }

   void inIt(int A, String G){
      age=A;
      gender=G;
   }

   void display(){
      System.out.println(human + "'s age is " + age);
   }
}
