import java.io.*;
class SequenceFileDemo
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream f1= new FileInputStream("abc.txt");
		FileInputStream f2= new FileInputStream("xyz.txt");
		SequenceInputStream sis= new SequenceInputStream(f1,f2);
		int i;
		while((i=sis.read())!= -1)
		{
			System.out.print((char)i);
		}
		sis.close();
	}
}
