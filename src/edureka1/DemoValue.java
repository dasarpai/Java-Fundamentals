package edureka1;

public class DemoValue {
	int data=50;
	int operation(int data) {
		data= data*2/6;
		return data;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoValue d = new DemoValue();
		System.out.println(d.data);
		System.out.println(d.operation(200));
		System.out.println(d.data);

	}

}
