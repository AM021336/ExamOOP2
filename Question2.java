import java.io.*;
import java.util.*;

public class Question2{
	public static void main(String[] args) throws IOException {
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
	}

	public static void editFile (String a) {
		FileInputStream fs;
		int z;
		try{
			fs = new FileInputStream("Source.txt");	
			while((z = fs.read()) != -1){	          
				System.out.print((char) z); 
			}
		} catch (IOException e){
			System.out.println(e.toString());
		}
	}  

	public static void txtCopy (String a,String b) {
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

	public static void updateFile(String file) throws IOException {
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
	
		FileWriter fw = new FileWriter("a.txt");
		BufferedWriter bw = new BufferedWriter(fw);
	
		String a="";
		String temp="";
		String[] temp2;
	
		while((a=br.readLine())!=null){
			temp += a+" ";
		}

		temp2 = temp.split(" ");

		for(int i=0;i<temp2.length;i++){
				bw.write(temp2[i]);
				bw.newLine();
		}
		bw.close();		
	}
}