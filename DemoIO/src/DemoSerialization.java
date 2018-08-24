import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student(12,300,"abcd");
		
		
		try {
			FileOutputStream fo=new FileOutputStream("student.txt");
			ObjectOutputStream oo=new ObjectOutputStream(fo);
			oo.writeObject(student);
			oo.close();
			fo.close();
			
			System.out.println("operation completed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
