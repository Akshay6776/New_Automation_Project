import java.util.HashSet;
import java.util.Set;

public class interviewquestion {

	public static void main(String[] args) {
		
		
		String word = "dell";
		
		String[] cha = word.split("");

		Set<String> hash_set = new HashSet<String>();
		
		for(String c: cha) 
		{
			hash_set.add(c);
		}
		
		System.out.println(hash_set);
		
		String joined = String.join("", hash_set);
		
		System.out.println(joined);
		
		
		
		
		
		
		
		
		
		
		
	}

}
