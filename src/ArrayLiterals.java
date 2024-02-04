import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//Integer values
		int nums[] = {10,20,30,40,10,1};
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println("----------------------");
		
		for(int k=0;k<nums.length;k++) {
			System.out.println(nums[k]);
		}
		
		System.out.println("----------------------");
		
		for(int num: nums) 
		{
			System.out.println(num);
		}
		
		System.out.println("----------------------");
		//String values
		String products[] = {"Mackbook","imac","canon","iphone"};
		
		System.out.println(Arrays.toString(products));
		
		System.out.println("----------------------");
		
		for(int k=0; k<products.length;k++) 
		{
			System.out.println(products[k]);
		}
		
		System.out.println("----------------------");
		
		for(String product:products) 
		{
			System.out.println(product);
		}
		System.out.println("----------------------");
		
		//print products in reverse order using indexing
		
		for(int i=products.length-1;i>=0;i--) 
		{
			System.out.println(products[i]);
		}
		
		System.out.println("----------------------");
		
		//print products in reverse order using for each loop
		int count=products.length-1;
		for(String product:products) 
		{
			System.out.println(products[count]);
			count--;
		}
		System.out.println("----------------------");
		
		Object datas[] = {"Akshay",27,76.5,'m',true};
		
		System.out.println(Arrays.toString(datas));
		
		System.out.println("----------------------");
		
		for(int i=0;i<datas.length;i++) 
		{
			System.out.println(datas[i]);
		}
		
		System.out.println("----------------------");
		
		for(Object data:datas) 
		{
			System.out.println(data);
		}
		
		System.out.println("----------------------");
		
		for(int i=datas.length-1;i>=0;i--) 
		{
			System.out.println(datas[i]);
		}
		
		//Assignment
		
		char alphas[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x'
				,'y','z'};
		
		for(int i=0;i<alphas.length;i++) 
		{
			System.out.println(alphas[i]);
		}
		
		System.out.println("----------------------");
		
		//print reverse
		
		for(int i=alphas.length-1;i>=0;i--) 
		{
			System.out.println(alphas[i]);
		}
		
		System.out.println("----------------------");
		
		for(char alpha:alphas) 
		{
			System.out.println(alpha);
		}
		
		System.out.println("----------------------");
		
		char bigAlphas[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x'
				,'y','z'};
		
		for(int i=0;i<bigAlphas.length;i++) 
		{
			bigAlphas[i] = Character.toUpperCase(bigAlphas[i]);
		}
		
		System.out.println(Arrays.toString(bigAlphas));
		
		System.out.println("----------------------");
		
		for(int i=bigAlphas.length-1;i>=0;i--) 
		{
			bigAlphas[i] = Character.toUpperCase(bigAlphas[i]);
			System.out.println(bigAlphas[i]);
		}
		
		System.out.println("----------------------");
		
		int numbers[] = {0,1,2,3,4,5,6,7,8,9};
		
		for(int i=0;i<numbers.length;i++) 
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("----------------------");
		
		//print in reverse
		
		for(int i=numbers.length-1;i>=0;i--) 
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("----------------------");
		
		for(int number : numbers) 
		{
			System.out.println(number);
		}
		
		
		
		
	}

}
