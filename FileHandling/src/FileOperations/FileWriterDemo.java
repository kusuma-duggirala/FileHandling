package FileOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//FileWriter is not recommended as to give line separator we have to pass '\n' which is not recognized as new line in all the systems.
//Total Constructors-4. All the constructors will create a new file if the given file is not available. By default, file contents are overriden.
//Total Methods-5. write(char), write(char[]), write(String), flush(), close().
public class FileWriterDemo 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("fwd.txt");    //Constructor-1 which accepts file name
        fw.write(100);                                //Write(int ch)- Writes the ASCII character of 100
        fw.write('k');
        char[] ch= {'a','b','c'};
        fw.write(ch);                                 //Write(Char[] ch)- writes multiple characters
        fw.write("Kusuma");                           //Write(String) - Writes given string 
        fw.write('\n');
        fw.write("Duggirala"); 
        fw.flush();                                   //Ensures all the data is written properly into file
        fw.close();                                   //Close is mandatory without which data is not written in the file

	
	    File f =new File("fwd.txt");
	    FileWriter fw2=new FileWriter(f,true);        //Constructor-2 which accepts file reference. Giving append=true will not override the file
	    fw2.write('d');
	    fw2.write("Kusuma");
	    fw2.write('\n');
	    fw2.flush();
	    fw2.close();
	    
	    System.out.println(f.length());               //Calculates the no.of characters in file
	    //f.delete();                                   //Deletes the file
	 }

}
