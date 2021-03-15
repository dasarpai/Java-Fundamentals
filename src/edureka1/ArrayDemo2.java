package edureka1;
import javax.print.attribute.standard.Destination;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] source= {'H','A','P','P','Y','L','E','A','R','N','I','G'};
		char[] destination = new char[7];
		
		System.arraycopy(source,0,destination,1,5);
		//System.out.println(destination);
		System.out.println(new String(destination));
		int flag=1;
		for (int i=0; i<source.length; i++) {
			if (flag==1) {
				for (int j=i+4; i<source.length-4; j++) {
					source[i]=source[j];
					i++;
				}
				System.out.println(source);
			}
		}

	}

}
