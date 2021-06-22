package FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//Remove duplicates from input file
public class FileMerge5 
{

	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw=new PrintWriter("output2.txt");
		BufferedReader br1=new BufferedReader(new FileReader("input2.txt"));
		String line1=br1.readLine();
		while(line1!=null)
		{
			//System.out.println("Line1: "+line1);
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("output2.txt"));
			String line2=br2.readLine();
			//System.out.println("Line2: "+line2);
			while(line2!=null)
			{
				if(line1.equals(line2))
				{
					available=true;
					break;
				}
				line2=br2.readLine();
			}
			if(available==false)
			{
				pw.print(line1);
				pw.println();
				pw.flush();
			}
			line1=br1.readLine();
		}
		//pw.flush();
		pw.close();

	}

}
