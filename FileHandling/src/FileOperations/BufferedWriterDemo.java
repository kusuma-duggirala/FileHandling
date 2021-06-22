package FileOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Same as FileWriter. FileWriter disadvantages can be overcome using BufferedWriter.
//Buffered Writer cannot directly communicate with file. It needs FileWriter object to communicate.
//Total Constructors-2. By default data is overriden.If we want to append the data, We should give append argument as TRUE in FileWriter Constructor
//Total methods-6. One extra method newLine() to over come the line separator issue in FileWriter. 
//write(char), write(char[]), write(String), flush(), close(), newLine()
public class BufferedWriterDemo 
{
	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("bwd.txt");
		BufferedWriter bw=new BufferedWriter(fw);   //Constructor-1 which accepts the FileWriter object
		bw.write('a');
		char[] ch= {'a', 'b', 'c'};
		bw.write(ch);
		bw.newLine();                               //Extra method newLine() to insert newline 
		bw.write("Kusuma");
		bw.flush();
		bw.close();                                 //Closing Buffered Writer object is sufficient which will close File Writer object automatically.
		
		File f=new File("bwd2.txt");
		FileWriter fw2=new FileWriter(f,true);
		BufferedWriter bw2=new BufferedWriter(fw2,10);  //Constructor-2 which accepts FileWriter object and Buffer size as arguments
		bw2.write('a');
		//char[] ch= {'a', 'b', 'c'};
		bw2.write(ch);
		bw2.newLine();                              
		bw2.write("Kusuma");
		bw2.flush();
		bw2.close(); 
		
		//Disadvantages:
		bw2.write(100);                    //Cannot directly print the number-given statement will print Character(ASCII value of 100)
		bw2.write(10.5);                   //Cannot directly write Float value
		bw2.write(true);                   //Cannot directly write Boolean value
		
	}

}
