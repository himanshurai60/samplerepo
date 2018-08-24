import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterVal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("enter first number:");
			String s=br.readLine();
			int a=Integer.parseInt(s);
			System.out.println("enter second number:");
			s=br.readLine();
			int b=Integer.parseInt(s);
				if(a>b)
				System.out.println("a greater than b");
			else if(a==b)
				System.out.println("a equals b");
			else
				System.out.println("a is less than b");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
