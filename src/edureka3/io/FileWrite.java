package edureka3.io;

import java.io.FileOutputStream;
import java.util.Date;

public class FileWrite 
{
 public static void main(String[] args) throws Exception 
 {
  //FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
  //FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt",true);//appending mode
	Date d = new Date();
	String fname=d.getDate()+"-"+d.getMonth()+"-"+(d.getYear()+1900);
	
    FileOutputStream fout = new FileOutputStream("src/co/edureka/io/"+fname);
  String str = "edureka is into online trainings @ "+d.toString();
  byte[] b = str.getBytes();//to convert string to byte[]
  fout.write(b);
  System.out.println("file created");
  fout.close();
 }
}
