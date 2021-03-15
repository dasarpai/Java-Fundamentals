package edureka2;
class Employee4 
{
  int empno;
  String name;
  float sal;
  
  Employee4()    
  {
    System.out.println("****");
    empno = 101;
    name = "Sunil";
    sal = 25000f;
  }
  void getDetails()
  {
     System.out.println(empno+" | "+name+" | "+sal);
  }
}

class  ConstructorTest
{
  public static void main(String[] args) 
  { 

     Employee4 emp1 = new Employee4();
     Employee4 emp2 = new Employee4();
     Employee4 emp3 = new Employee4();

      emp1.getDetails();
      emp2.getDetails();
      emp3.getDetails();      	
  }
}