package FileOperations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
//Output=Input-Delete
public class FileMerge4 
{

	public static void main(String[] args) throws IOException 
	{
		PrintWriter pw=new PrintWriter("output1.txt");
		BufferedReader br1=new BufferedReader(new FileReader("input.txt"));
		//BufferedReader br2=new BufferedReader(new FileReader("delete.txt"));
		String line1=br1.readLine();
		//String line2=br2.readLine();
		
		while(line1!=null)
		{
			boolean available=false;
			BufferedReader br2=new BufferedReader(new FileReader("delete.txt"));
			String line2=br2.readLine();
			System.out.println("Line1: "+line1);
			while(line2!=null)
			{
				System.out.println("Line2: "+line2);
				if(line1.equals(line2))
				{
					available=true;
					break;
				}
				line2=br2.readLine();
				System.out.println("Line2 After: "+line2);
			}
			if(available==false)
			{
				pw.write(line1);
				pw.println();
			}
			line1=br1.readLine();
			System.out.println("Line1 After: "+line1);
			
		}
		pw.flush();
		pw.close();

	}

}
