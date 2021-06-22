package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Same as FileReader. FileReader disadvantages can be overcome using BufferedReader
//BufferedReader cannot directly communicate with file. It needs FileReader object to communicate
//Total Constructors-2
//Total Methods-4. One extra method readLine() to read the entire line in file which is not present in the FileReader
//read(char), read(char[]), close(), readLine()
public class BufferedReaderDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("bwd.txt");
		BufferedReader br=new BufferedReader(fr);    //Constructor-1 which accepts the FileReader object
		String line=br.readLine();                   //Extra method which reads entire line
		while(line!=null)                            //Returns NULL when no lines present in the file.
		{
			System.out.println(line);
			line=br.readLine();                     
		}
		br.close();
		
		
		File f=new File("bwd2.txt");
		FileReader fr2=new FileReader(f);
		BufferedReader br2=new BufferedReader(fr2,10);  //Constructor-2 which accepts the FileReader object, Buffer Size
		String line2=br2.readLine(); 
		while(line2!=null)
		{
			System.out.println(line2);
			line2=br2.readLine();                     
		}
		br2.close();
		
	}

}
