import java.io.*;
import java.util.Date;
class ObjectFromFile 
{
	public static void main(String[] args) throws IOException,FileNotFoundException,ClassNotFoundException
	{
		//File f1=;
		//FileInputStream fis= ;
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream( new File("objdata")));

		String str=(String)ois.readObject();
		Date d=(Date)ois.readObject();
		MyData md1=(MyData)ois.readObject();
	System.out.println("String="+str);
	System.out.println(d);
	md1.showData();
	

		//System.out.println("Object Saved");
	}
}
