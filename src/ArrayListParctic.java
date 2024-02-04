import java.util.ArrayList;

public class ArrayListParctic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer ArrayList
		ArrayList<Integer> numlist = new ArrayList<Integer>();
		numlist.add(100);
		numlist.add(200);
		numlist.add(300);
		numlist.add(500);
		numlist.add(700);

		
		System.out.println(numlist);
		
		System.out.println("-------------------------------");
		
		//to print data sequentially using for loop 
		
		for(int i=0;i<numlist.size();i++) 
		{
			System.out.println(numlist.get(i) + " is at index "+i );
		}
		
		System.out.println("-------------------------------");
		
		////to print data sequentially using for each loop 
		int k=0;
		for(int num : numlist) 
		{
			System.out.println(num + " is at index " +k);
			k++;
		}
		
		System.out.println("-------------------------------");
		
		//Object ArrayList
		ArrayList<Object> empData = new ArrayList<Object>();
		
		empData.add("Akshay");
		empData.add(28);
		empData.add(true);
		empData.add(60000);
		empData.add('m');
		
		System.out.println(empData);
		
		System.out.println("-------------------------------");
		
		for(int i=0;i<empData.size();i++) 
		{
			System.out.println(empData.get(i)+" is at index "+i);
		}
		
		System.out.println("-------------------------------");
		
		int m=0;
		for(Object data : empData) 
		{
			System.out.println(data + " is at index " +m);
			m++;
		}
		
		//to add data at specific index
		
		System.out.println("-------------------------------");
		empData.add(5, "happy");
		System.out.println(empData);
		System.out.println("-------------------------------");
		
		empData.add(5, "perm");
		System.out.println(empData);
		
		System.out.println("-------------------------------");
		
		//replace data at specific index
		empData.set(5, "not_perm");
		System.out.println(empData);
		
		//to remove data from specifuc index
		System.out.println("-------------------------------");
		empData.remove(5);
		empData.remove(4);
		System.out.println(empData);
	}

}
