package edureka3.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWrite2 {

	public static void main(String[] args) throws Exception
	{
	 FileOutputStream fout = new FileOutputStream("src/edureka.txt");
	 //FileOutputStream fout = new FileOutputStream("src/edureka.txt",true);
	 
	 String str = "PG Diploma in Data Science from upGrad and IIIT Bangalore. Admissions Now Open! Experience a cutting-edge curriculum";
	 byte[] b = str.getBytes(); //to convert String to byte[]
	 fout.write(b);
	 
	 System.out.println("File Saved!");
	 FileWriter fout1 = new FileWriter("src/edureka1.txt");
	 fout1.write(str);
	 fout1.close();
	 fout.close();
	}
}