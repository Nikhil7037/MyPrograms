package test;

public class LeetCodeProblem125 {
	public static void main(String args[])
	{
		String s="A man, a plan, a canal: Panama";
		//String a[]=s.split("\\s");
		s = s.replaceAll(",", "[.]").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        String result = sb.reverse().toString();
        //return s.equals(result);
        System.out.println(result);
        
	}

}
