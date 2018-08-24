import java.util.Arrays;

public class DemoArrayOperations {
	
	public static void main(String[] args)
	{
		int[] numbers= {123,34,55,65,43,55,67,89,90};
	//	Arrays.fill(numbers, 0);
		//for (int num : numbers) {
			//System.out.println(num);
		//}
		Arrays.fill(numbers, 1,3,100);
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println("-----------------");
		int[] arr_copy=Arrays.copyOf(numbers, 5);
		for(int num:arr_copy) {
			System.out.println(num);
		}
	}

}
