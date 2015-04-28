import java.io.*

public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
<<<<<<< HEAD
		public void editFile (String) {
			FileInputStream fs;
			int z;
			try{
				fs = new FileInputStream("Source.txt");	
				while((z = fs.read()) != -1){	          
					System.out.print((char) z);      
=======

		public void txtCopy (String a,String b) {
			FileInputStream fs;
			int i;
			try{
				fs = new FileInputStream("Source.txt");	
				System.out.println("檔案的大小為：" + fs.available() + " Bytes");
				System.out.println("檔案的內容為：");
				while((i = fs.read()) != -1){	          
					System.out.print((char) i);      
>>>>>>> 31c0c58e15749a103e8f9c57181ca369d468c690
				}
				fs.close();				
			} catch (IOException e){
				System.out.println(e.toString());
			}
		}
	}
}
<<<<<<< HEAD
=======


	
>>>>>>> 31c0c58e15749a103e8f9c57181ca369d468c690
