import java.io.*;
class DataFromConsole 
{
	public static void main(String[] args)  throws IOException,FileNotFoundException
	{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fw= new FileOutputStream("xyz.txt");
		int i;
System.out.println("Write  date to store in file: \n");

		while(true)
		{
				i=br.read();
				if(i==-1)
					break;
				fw.write(i);
		}
		System.out.println("Data Stored in file...");

System.out.println("Enter a line: ");
String str= br.readLine();
System.out.println("Line entered: "+str);
	}
}
