package FileOperations;

import java.io.File;
import java.io.IOException;

public class FileBasic 
{

	public static void main(String[] args) throws IOException 
	{
		//Creates file under current working directory
		File f=new File("abc.txt");               //Constructor-1 which accepts the file name 
		System.out.println(f.getCanonicalPath()); //C:\Users\kduggira.ORADEV\eclipse-workspace\Pheonix\abc.txt
		System.out.println(f.getAbsolutePath());  //C:\Users\kduggira.ORADEV\eclipse-workspace\Pheonix\abc.txt
		System.out.println(f.getName());          //abc.txt
		System.out.println(f.exists());           //false
		System.out.println(f.createNewFile());    //first time- true, next time-false
		System.out.println(f.exists());           //true
		System.out.println(f.isFile());           //true
		System.out.println(f.isDirectory());      //false
		System.out.println("********************************************************************");
		
		
		//Creates folder under current working directory
		File f2=new File("Kusuma");               //Constructor-1 which accepts the directory name 
		System.out.println(f2.getCanonicalPath());//C:\Users\kduggira.ORADEV\eclipse-workspace\Pheonix\Kusuma
		System.out.println(f2.exists());          //false
		System.out.println(f2.mkdir());           //first time- true, next time-false
		System.out.println(f2.exists());          //true
		System.out.println(f2.isFile());          //false
		System.out.println(f2.isDirectory());     //true
		System.out.println("********************************************************************");
		
		
		//Creates file under specified directory (Prereq- Directory should exist on the system)
		/*File f3=new File("Kusuma2","xyz.txt");  //Constructor-2 which accepts the Directory name and File name 
		System.out.println(f3.getCanonicalPath());//C:\Users\kduggira.ORADEV\eclipse-workspace\Pheonix\Kusuma2\xyz.txt
		System.out.println(f3.exists());          //false
		System.out.println(f3.createNewFile());   //java.io.IOException: The system cannot find the path specified-Kusuma2 folder is not present in CWD*/
		
		File f4=new File("Kusuma","xyz.txt");
		System.out.println(f4.getCanonicalPath()); //C:\Users\kduggira.ORADEV\eclipse-workspace\Pheonix\Kusuma\xyz.txt
		System.out.println(f4.exists());           //false
		System.out.println(f4.createNewFile());    //first time- true, next time-false
		System.out.println(f4.exists());           //true
		System.out.println(f4.isFile());           //true
		System.out.println(f4.isDirectory());      //false
		
		File f5=new File("C:\\Users\\kduggira.ORADEV","FileDemo.txt");
		System.out.println(f5.getCanonicalPath());  //C:\Users\kduggira.ORADEV\FileDemo.txt
		System.out.println(f5.exists());            //false
		System.out.println(f5.createNewFile());     //first time- true, next time-false
		System.out.println(f5.exists());            //true
		System.out.println(f5.isFile());            //true
		System.out.println(f5.isDirectory());       //false
		System.out.println("********************************************************************");
		
		
		//Creates file under the specified directory reference
		File f6=new File(f2,"pqr.txt");            //Constructor-3 which accepts the Directory reference and File name 
		System.out.println(f6.getCanonicalPath()); //C:\Users\kduggira.ORADEV\eclipse-workspace\Pheonix\Kusuma\pqr.txt
		System.out.println(f6.exists());           //false
		System.out.println(f6.createNewFile());    //first time- true, next time-false
		System.out.println(f6.exists());           //true
		System.out.println(f6.isFile());           //true
		System.out.println(f6.isDirectory());      //false
		
		
	}
}
