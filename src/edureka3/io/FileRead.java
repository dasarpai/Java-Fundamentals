package edureka3.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileRead 
{
 public static void main(String[] args) throws Exception
 {
  File file = new File("D:\\18-DS\\Java\\eclipse-workspace\\NITR\\src\\edureka3\\io\\java.txt");
  //File file = new File("src/co/edureka/io/edureka.txt");
  if(file.exists())
  {
	FileInputStream fin = new FileInputStream(file);  
	
	/*
	System.out.println("No of bytes to be read = "+ fin.available());
	System.out.println(fin.read());
	System.out.println(fin.read());
	System.out.println("No of bytes to be read = "+ fin.available());
	*/
	
	//////////////////read file contents byte-by-byte
	/*
	int n = fin.read();
	while(n != -1)
	{
     System.out.print((char)n);
     n = fin.read();
     Thread.sleep(300);
	}
	*/
	
	/////////////////////read file contents completely
	/*
	byte[] b = new byte[fin.available()];
	//byte[] b = new byte[10];
	fin.read(b);
	String s = new String(b);
	System.out.println(s);
	*/
	
	/////////////////read file contents line-by-line
	InputStreamReader source = new InputStreamReader(fin); //to convert byte stream to character stream
	BufferedReader br= new BufferedReader(source);
	String line = br.readLine();
	while(line != null)
	{
	 System.out.println(line);
	 Thread.sleep(2000);
	 line = br.readLine();
	}
	
	source.close();
	fin.close();
	br.close();
  }
  else
  {
	System.out.println("File is not available to read!");  
  }
 }
}
