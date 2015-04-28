import java.io.*

public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");

		public void txtCopy (String a,String b) {
			FileInputStream fs;
			int i;
			try{
				fs = new FileInputStream("Source.txt");	
				System.out.println("檔案的大小為：" + fs.available() + " Bytes");
				System.out.println("檔案的內容為：");
				while((i = fs.read()) != -1){	          
					System.out.print((char) i);      
				}
				fs.close();				
			} catch (IOException e){
				System.out.println(e.toString());
			}
		}
	}
}


	
