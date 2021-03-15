package edureka1;

public class student {
	static String college="Vedanta School";
	String name;
	int id;
	int clas;
	int hindi;
	int english;
	int physics;
	int chemistry;
	int maths;
	
	static void college_name(){
		college= "Mimamsa School";
		
	}
	student(String namea, int ida, int agea, int clasa,int hindia, 
			int englisha, int physicsa, int chemistrya, int mathsa) {
		name = namea;
		id = ida;
		clas = clasa;
		hindi=hindia;
		english=englisha;
		physics=physicsa;
		chemistry=chemistrya;
		maths=mathsa;	
	}
	
	//Constructor overloading
	student(int ida, int agea, int clasa,int hindia, 
			int englisha, int physicsa, int chemistrya, int mathsa) {
		id = ida;
		clas = clasa;
		hindi=hindia;
		english=englisha;
		physics=physicsa;
		chemistry=chemistrya;
		maths=mathsa;	
	}
	
	student(){
		this("Surya",1000,1,33,33,33,33,33,33);
	}
	
	
	
	student(String namea,int ida){
		this.name=namea;
		this.id=ida;
	}

	float avg(){
		return ( hindi+ english+ physics+ chemistry+maths)/5;
	}
	boolean result() {
		if (avg()>33.0) {
			return true;
		}
		else {
			return false;
		}
		
		}
}
	
