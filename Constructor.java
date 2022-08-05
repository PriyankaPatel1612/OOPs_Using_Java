

class Constructor{

    int empId;         //instance variable
    String empName;

    Constructor(int id, String name)          //parameterized constructer
    {

        this.empId=id;
        this.empName=name;

    }
    public static void main(String[] args) {
        
     Constructor obj1 = new Constructor(1,"priyanka");          //created object for initializing
     Constructor obj2 = new Constructor(2,"pratham" );

     System.out.println(obj1.empId +" " + obj1.empName);
     System.out.println(obj2.empId +" " + obj2.empName);
    }

    
}