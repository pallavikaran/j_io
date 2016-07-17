import java.io.*;
	
		class DataToFile 
	{
	public static void main(String[] args)  throws IOException,FileNotFoundException
	{
		File f= new File("MyData.txt");
		FileOutputStream fos= new FileOutputStream(f);
			DataOutputStream dos= new DataOutputStream(fos);
			int roll=102;
			String name="Sunil";
			double score=87.79;
			dos.writeInt(roll);
			dos.writeUTF(name);
			dos.writeDouble(score);
			dos.close();
		///////////////////////////////////////////////////////////////////////////////////
		FileInputStream fis= new FileInputStream(f);
			DataInputStream dis= new DataInputStream(fis);
		int r=dis.readInt();
		String str1= dis.readUTF();
		double d=dis.readDouble();


		System.out.println("Roll= "+r+"\nName="+str1+"\nScore="+d);
	}
}
