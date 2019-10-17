import java.util.*;
import java.io.*;
import java.lang.*;
import javax.xml.bind.DatatypeConverter;
public class Base64 {
    
    public static void main(String[] args)throws Exception {
    	
    	Scanner scan = new Scanner(System.in);
    	ArrayList<String> words = new ArrayList<String>();
		String wor = "";
		
    	System.out.println("Array List Maker");
    	System.out.println("Enter ':q' to stop the program");
    	System.out.println("---------------------------------");
    	
    	while(!wor.equals(":q")){
    	System.out.print("Please enter a string to add in the array: ");
    	wor = scan.next();
    	words.add(wor);
    	System.out.println("Array list: " + words);
    
    		}
    	System.out.println("Program Succesfully stopped, do you want to save the file or not?   Y=1 N=0");
    	int yes;
    	yes = scan.nextInt();
    	if(yes>2){
    		System.out.print("Invalid value, please try again");
    		}
    	switch(yes){
    		case 1:
    			System.out.println("Saving....");
    			System.out.print("Enter the desired name of your file: ");
    			String filename = scan.next();
   				filename = filename + ".txt";
   				File input = new File(filename);
   				input.createNewFile();
   				FileWriter write = new FileWriter(filename);
   				String[] str = GetStringArray(words); 
   				String output = Arrays.toString(str);
				byte[] message = output.getBytes("UTF-8");
				String encoded = DatatypeConverter.printBase64Binary(message);
   				write.write(encoded);
   				write.flush();
    			break;
    		case 0:
    			System.out.print("Did not save, Please restart program if you wish to use it again.");
    			break;	
    		}
    		
    }
    
	public static String[] GetStringArray(ArrayList<String> arr) 
    { 
  
         
        String str[] = new String[arr.size()]; 
  
      
        for (int j = 0; j < arr.size(); j++) { 
  
           
            str[j] = arr.get(j); 
        } 
  
        return str; 
    } 
}
