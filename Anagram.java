package String.com;

public class Anagram {

	public static void main(String[] args) {
		String s1="the quick brown fox jumps over the lazy dog";
		if(ispanagram(s1))
		{
			System.out.println("panagram");
		}
		else
		{
			System.out.println("not panagram");
		}

	}
	public static boolean ispanagram(String s1)
	{
		s1=s1.toLowerCase();
		String s="abcdefghijklmnopqrstuvwxyz";
		for(char ch:s.toCharArray())
		{
			if(s1.indexOf(ch)==-1) return false;
		}
		return true;
	}

}
