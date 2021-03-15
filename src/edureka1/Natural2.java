package edureka1;

public class Natural2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNatural();
	}
	static void PrintNatural()
		{
			int i=1;
			System.out.println("First 10 Natural Numbers are");
			while (i<=10) {
				if (i==10)
					System.out.print(i);
				else {
					System.out.print(i+",");
				}
				i++;
			}
			
		}

}
