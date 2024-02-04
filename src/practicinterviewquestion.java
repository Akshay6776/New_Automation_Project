import java.util.ArrayList;
import java.util.List;

public class practicinterviewquestion {

	public static void main(String[] args) {


		String name = "1331";
		
		String[] nameList = name.split("");
		//System.out.println(nameList.length);
		
		List<String> reverseList = new ArrayList<String>();
		
		for(int i=nameList.length-1;i>=0;i--) 
		{
			reverseList.add(nameList[i]);
		}
		
		//System.out.println(reverseList);
		
		String reverseName = String.join("", reverseList);
		System.out.println(name);
		System.out.println(reverseName);
		
		if(name.equalsIgnoreCase(reverseName)) 
		{
			System.out.println("this is Palindrom");
		}
		else 
		{
			System.out.println("this is not Palindrom");
		}
		
		
		String str = "he wats up";
		
		str.rev
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
