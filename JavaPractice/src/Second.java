import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Second {
	
	public void practice() {
		Pattern pattern = Pattern.compile("Chaitanya", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("surapathi krishna chaitanya");
		boolean matchfinder = matcher.find();
		if(matchfinder)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
	}

}

/* brackets are used to search for a range of characters

	[abc] - any character in the brackets.
	[^abc]- any character not in the brackets.
	[0-9] - any character in the range of the brackets.
	
	n+ - matches any string that contains at least one occurrence of n.
	n* - matches any string that contains at zero or more occurrences of n.
	n? - zero or one occurrence of n.  
*/