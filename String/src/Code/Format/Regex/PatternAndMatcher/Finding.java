package Code.Format.Regex.PatternAndMatcher;

//: strings/Finding.java
import java.util.regex.*;
import static util.Print.*;

public class Finding 
{
	public static void main(String[] args)
	{
		Matcher m = Pattern.compile("\\w+").matcher("Even,ing is full of the linnet's wings");
		while (m.find())
			printnb(m.group() + " ");
		print();
		int i = 0;
		while (m.find(i)) { //argument tells it the character position for the beginning of the search
			printnb(m.group() + " ");
			i++;
		}
	}
} 
