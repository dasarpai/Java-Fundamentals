package edureka3.io;

import java.io.FileWriter;

public class FileWrite1 {

	public static void main(String[] args) throws Exception{
		FileWriter fw =new FileWriter("d:/Java-66/test.txt");
		String data = "This is an excel file";
		fw.write(data);
		System.out.println("Excel file created");
		fw.close();	
	}	
}
