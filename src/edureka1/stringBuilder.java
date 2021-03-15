package edureka1;

public class stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbl = new StringBuilder("Happy");
		sbl.append("Learning");
		System.out.println(sbl);
		System.out.println(sbl.delete(2, 3));
		System.out.println(sbl.insert(1,"welcome"));
		System.out.println(sbl.reverse());

	}

}
