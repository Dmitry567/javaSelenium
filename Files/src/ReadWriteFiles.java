import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteFiles
{
	public static void main(String[] args) throws FileNotFoundException
	{
// read from a file
		File readFile = new File("readFile.txt");
		Scanner scanFile = new Scanner(readFile);
		while(scanFile.hasNext())
			System.out.println(scanFile.nextLine());
		scanFile.close();
		
//write into a file
		
		File writeFile = new File("writeFile.txt");
		PrintWriter printFile = new PrintWriter("writeFile");
		printFile.println("My first string");
		printFile.println("My second string");
		printFile.println("My third string");
		printFile.close();
			
	}
	
}
