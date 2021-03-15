package edureka3.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileRead2
{
 public static void main(String[] args)throws Exception
 {
   File file = new File("src/co/edureka/io/java.txt");
   //File file = new File("C:\\projects\\students\\Web.config");
   if(file.exists())
   {	
	FileInputStream fin = new FileInputStream(file);
	/*
	System.out.println("No of bytes to read = "+ fin.available()); //213
	System.out.println(fin.read());
	System.out.println(fin.read());
	System.out.println("No of bytes to read = "+ fin.available());
	*/
	
	/*
	//read file contents byte-by-byte
	int n = fin.read();
	while(n != -1)
	{
	 System.out.print((char)n);
	 n = fin.read();
	 Thread.sleep(150); //150ms
	}
	*/
	/*
	//read file contents completely
	//byte[] b = new byte[fin.available()];
	byte[] b = new byte[(int)file.length()];
	fin.read(b);
	String data = new String(b);
	System.out.println(data);
	*/
	
	//read file contents line-by-line
	Reader source = new InputStreamReader(fin); //to convert byte stream to character stream
	BufferedReader br = new BufferedReader(source);
	String line = br.readLine();
	while(line != null)
	{
	 System.out.println(line);
	 line = br.readLine();
	 Thread.sleep(2000);
	}
	fin.close();
	br.close();
   }
   else
   {
	  System.out.println("The specified file is not available!"); 
   }
 }
}