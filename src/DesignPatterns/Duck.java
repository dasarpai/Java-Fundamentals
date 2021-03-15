package DesignPatterns;

public class Duck {
	public interface IFlyBehaviour {
		public static void fly(){}
	}
	public interface IQuackBehaviour {
		public static void quack() {}
	}
	public interface IDisplayBehaviour {
		public static void display() {}
	}
	public interface IEatBehaviour {
		public static void eat() {}
	}
	
	IFlyBehaviour fb;
	IQuackBehaviour qb;
	IDisplayBehaviour db;
	IEatBehaviour eb;
	
	//public Duck() {}
	
	public Duck(IFlyBehaviour fb, IQuackBehaviour qb, IDisplayBehaviour db, IEatBehaviour eb ){
		this.fb = fb;
		this.qb = qb;
		this.db = db;
		this.eb = eb;
	}
	
	public void fly() {
		
		
	}
	public void quack() {
		
	}
	public void display() {
		
	}
	public void eat() {
		
		
	}
	
	
	public class MountainDuck extends Duck{
		IFlyBehaviour fb;
		IQuackBehaviour qb;
		IDisplayBehaviour db;
		IEatBehaviour eb;
		
		public MountainDuck(String name){	
			super(IFlyBehaviour new fb, new qb,new db,new eb);
			
			System.out.println("I am "+name);			
		}
		
	}
}
