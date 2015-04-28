public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
		public void editFile (String) {
			FileInputStream fs;
			int z;
			try{
				fs = new FileInputStream("Source.txt");	
				while((z = fs.read()) != -1){	          
					System.out.print((char) z);      
				}
				fs.close();				
			} catch (IOException e){
				System.out.println(e.toString());
			}
		}
	}
}
