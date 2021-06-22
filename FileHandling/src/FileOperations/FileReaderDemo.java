package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//File reader is the simplest reader and is not recommended as it can read only Character by character
//Total Constuctors-2
//Total Methods-3, fr.read(), fr.read(ch), fr.close()
public class FileReaderDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("fwd.txt");    //Constructor-1 which accepts the file name from which data has to be read
		int i=fr.read();                              //fr.read() gives the ASCII value of character
		while(i!=-1)                                  //Returns -1 when there are no characters in the file
		{
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
		System.out.println();
		
		
		File f=new File("fwd.txt");
		FileReader fr2=new FileReader(f);            //Constructor-2 which accepts the file reference
		char[] ch=new char[(int) f.length()];        //length() returns int/long based on the size. Typecasting should be done
		//char[] ch=new char[25];                    //Will read all the charcters
		//char[] ch=new char[20];                    //Will read only 20 characters 
		System.out.println(f.length());              //21
		fr2.read(ch);                                //Will read the characters in the file till the specified length
		for(char ch1:ch)
	    {
	    	System.out.print(ch1);
	    }
		fr2.close();
	}
}
