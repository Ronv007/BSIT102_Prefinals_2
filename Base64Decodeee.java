import java.io.*;
import java.util.*;
import javax.xml.bind.DatatypeConverter;
public class Base64Decodeee {

 public static void main(String[] args)throws Exception{
 	
 	System.out.println("Base64 Decoder");
 	
 	Scanner in = new Scanner(System.in);
 	
 	System.out.print("Please Enter File Name: "); 
    String filename = in.next();
    
    String FileName = filename + ".txt";
    
    RandomAccessFile file = new RandomAccessFile(FileName, "r");
	String input = file.readLine();
	
	System.out.println("");
	System.out.print("Text inside the file: ");
	System.out.println(input);
	System.out.println("");
	System.out.print("Decoded: ");
	
	byte[] decoded = DatatypeConverter.parseBase64Binary(input);
	System.out.println(new String(decoded, "UTF-8"));
 	}
 
    
    
}