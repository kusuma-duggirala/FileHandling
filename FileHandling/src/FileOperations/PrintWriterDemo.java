package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//PrintWriter is the most enhanced writer. Any type of data can be inserted into file using PrintWriter.Whatever operations we could not perform  with BufferedWriter can be done using PrintWriter
//Using Buffered Writer, We can't directly write an int, float or boolean values. We can write them only in the form of Strings using BufferedWriter.
//Eg: bw.write(100)=d, bw.write("100")=100; bw.write("10.5")= 10.5, bw.write("true")= true
//We can also use BufferedWriter methods - write(int ch), write(char[] ch), write(String s), flush(), close() with PrintWriter
//BufferedWriter method newLine is not applicable for PrintWriter. println should be used
//PrintWriter can directly communicate with the file. Also it can communicate with file via FileWriter
//Total Constructors-2
public class PrintWriterDemo 
{

	public static void main(String[] args) throws IOException 
	{
		/*FileWriter fw=new FileWriter("pwd.txt");
		PrintWriter pw=new PrintWriter(fw);*/
		PrintWriter pw=new PrintWriter("pwd.txt");      //Constructor-1 which accepts the file name 
		pw.write(100);
		char[] ch= {'a','b','c'};
		pw.write(ch);
		pw.write("Kusuma");
		//pw.newLine();      -------------------------- Not Applicable
		pw.print(10);                                   //Int
		pw.print(22.3);                                 //Float
		pw.print(1000000000);                           //Long
		pw.print(1234567698.98);                        //Double
		pw.print('a');                                  //Char
		pw.print(ch);                                   //Char Array
		pw.print("ABCD");                               //String
		pw.flush();
		pw.close();
		
		
		
		
		File f=new File("pwd2.txt");
		PrintWriter pw2=new PrintWriter(f);              //Constructor-2 which accepts the file reference
		pw2.println(10);                                   //Int
		pw2.println(22.3);                                 //Float
		pw2.println(1000000000);                           //Long
		pw2.println(1234567698.98);                        //Double
		pw2.println('a');                                  //Char
		pw2.println(ch);                                   //Char Array
		pw2.println("ABC");                               //String
		pw2.flush();
		pw2.close();
	}

}
