import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader reader=new FileReader("abc.txt");
			byte valu=0;
			do {
				int data=reader.read();
				System.out.print((char)data);
				valu=(byte)data;
				
			}while(valu!=-1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
