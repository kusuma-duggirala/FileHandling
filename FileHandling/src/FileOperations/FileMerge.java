package FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*File1:			File2:			File1File2:
	1111			AAAA			1111
	2222			BBBB			2222
	3333			CCCC			3333
	4444			DDDD			4444
					EEEE			AAAA
					FFFF			BBBB
									CCCC
									DDDD
									EEEE
									FFFF*/
public class FileMerge 
{
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new FileReader("file1.txt"));
		PrintWriter pw=new PrintWriter("file1file2.txt");
		String line=br.readLine();
		while(line!=null)
		{
			pw.write(line);
			pw.println();
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("file2.txt"));
		line=br.readLine();
		while(line!=null)
		{
			pw.write(line);
			pw.println();
			line=br.readLine();
		}
		pw.flush();
		pw.close();
		br.close();

	}

}
