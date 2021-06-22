package FileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Doubt 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new FileReader("doubt.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("doubt.txt"));
		StringBuilder sb=new StringBuilder();
		String line=br.readLine(); 
		String s="";
		//String s2="";
		while(line!=null)
		{
			/*sb.append(line);
			line=br.readLine();*/
			/*//line=line.replace("Kusuma", "Boby");
			bw.write(line.replace("Kusuma", "Boby"));
			bw.flush();
			//bw.close();
*/			
		s=s+line+System.lineSeparator();
		line=br.readLine();
		}
		System.out.println(s);
		String s2=s.replaceAll("Kusuma", "Boby");
		/*s=sb.toString();
		System.out.println("Before"+s);*/
		/*if(s.contains("Kusuma"))
		{
			s2=s.replace("Kusuma", "Boby");
			s=s2;
		}*/
		//System.out.println("After"+s);
		bw.write(s2);
		bw.flush();
		bw.close();
	}

}
