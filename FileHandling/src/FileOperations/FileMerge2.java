package FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*File1:		File2:		File1File2:
1111			AAAA		1111
2222			BBBB		AAAA
3333			CCCC		2222
4444			DDDD		BBBB
				EEEE		3333
				FFFF		CCCC
							4444
							DDDD
							EEEE
							FFFF*/

public class FileMerge2 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br1=new BufferedReader(new FileReader("file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("file2.txt"));
		PrintWriter pw=new PrintWriter("file1file2.txt");
		String line1=br1.readLine();
		String line2=br2.readLine();
		
		while(line1!=null||line2!=null)
		{
			if(line1!=null)
			{
				pw.write(line1);
				pw.println();
				line1=br1.readLine();
			}
			
			if(line2!=null)
			{
				pw.write(line2);
				pw.println();
				line2=br2.readLine();
			}
			
		}
		pw.flush();
		pw.close();
		br1.close();
		br2.close();

	}

}
