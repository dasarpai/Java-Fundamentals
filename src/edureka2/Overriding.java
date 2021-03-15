package edureka2;
class Employee1 
{
  int empno;
  String name;
  float sal;

  Employee1(){} 
  
  Employee1(int a, String b, float c)
  {
   empno = a;
   name = b;
   sal = c;
  }

  //@Override
  public String toString(){
   return "Employee["+this.empno+" | "+this.name+" | "+this.sal+"]";
  }
}

class Overriding
{
  public static void main(String[] args) 
  { 
     Employee1 emp = new Employee1(101,"Sunil",123.45f);
	 System.out.println(emp); //toString()
  }
}