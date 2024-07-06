class Demo1{
    String name;
    int age;
    int emp_id;
    String address;

    Demo1(String Name,int Age,int Emp_id,String Address){
        this.name = Name;
        this.age = Age;
        this.emp_id = Emp_id;
        this.address = Address;
}
    Demo1(String Name, int Emp_id){
        this.name = Name;
        this.emp_id = Emp_id;
}
  Demo1(String Name, int Emp_id,String Address){
       this.name = Name;
       this.emp_id = Emp_id;
       this.address = Address;
  }

}

public class Emp {

    public static void main(String[] args) {
        
        Demo1 d1 = new Demo1("vaishnavi", 22,231,"kolhar");
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.emp_id);
        System.out.println(d1.address);


        Demo1 d2 = new Demo1("pooja",776);
        System.out.println(d2.name);
        System.out.println(d2.emp_id);


        Demo1 d3 = new Demo1("Geeta",564,"loni");
        System.out.println(d3.name);
        System.out.println(d3.emp_id);
        System.out.println(d3.address);
 }
    
}
