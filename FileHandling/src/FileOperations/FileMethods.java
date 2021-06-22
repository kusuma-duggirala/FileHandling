package FileOperations;

import java.io.File;
import java.io.IOException;

//List method lists all the folders and files present in the given directory
public class FileMethods 
{
	public static void main(String[] args) throws IOException 
	{
		int counter=0;
		File f=new File("C:\\Users\\kduggira.ORADEV");
		String[] folderList=f.list();
		System.out.println(folderList.length); //52- 17 files, 35 folders
		for(String s:folderList)
		{
			File f2=new File(f,s);
			if(f2.isFile())
			{
				counter++;
				System.out.println(s);
				System.out.println(f2.getCanonicalPath());
			}
			
		}
		System.out.println(counter); //17
		

	}

}
