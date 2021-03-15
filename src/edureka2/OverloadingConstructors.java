package edureka2;
class Employee3 
{
  int empno;
  String name;
  float sal;
  
  //Constructors
  Employee3(){}
  
  Employee3(int empno)
  {
	  this.empno=empno;
  }
  
  Employee3(int empno, String name)
  {
	   this.empno = empno;
	   this.name = name;
  }
  
  Employee3(int empno, String name, float sal)
  {
   this(empno, name); //constructor chaining
   /*
   this.empno = empno;
   this.name = name;
   */
   this.sal = sal;
  }
  
  void setDetails(int empno) {
	  this.empno=empno;
  }
  void getDetails()
  {
     System.out.println(this.empno+" | "+this.name+" | "+this.sal);
  }
}

class OverloadingConstructors
{
  public static void main(String[] args) 
  { 

     Employee3 emp1 = new Employee3();
     Employee3 emp2 = new Employee3(101,"Sunil");
     Employee3 emp3 = new Employee3(102,"Naveen",2500f);

      emp1.getDetails();
      emp2.getDetails();
      emp3.getDetails();      	
  }
}