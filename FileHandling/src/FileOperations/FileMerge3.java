package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//Program which merges all the contents under FileMerge3 folder into output.txt file
//FileMerge3 Folder: Input1.txt, Input2.txt, Input3.txt, Input4.txt

public class FileMerge3 
{

	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw=new PrintWriter("output.txt");
		File f=new File("FileMerge3");
		String[] s=f.list();
		for(String s1:s)
		{
			System.out.println(s1);
			/*File f1=new File(f,s1);
			BufferedReader br=new BufferedReader(new FileReader(f1));*/
			BufferedReader br=new BufferedReader(new FileReader("FileMerge3\\"+s1));
			String line=br.readLine();
			while(line!=null)
			{
				pw.write(line);
				pw.println();
				line=br.readLine();
			}
			
		}
		pw.flush();
		pw.close();
		

	}

}
