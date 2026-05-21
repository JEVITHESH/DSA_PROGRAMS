public class Main
{
	public static void main(String[] args) {
		String word = "AABCCDEEA";
		int [] arr = new int[26];
		for(int i = 0 ; i < word.length(); i++){
		    arr[word.charAt(i)-'A']++; //65(A) - 65(A) = 0 
		}
		for(int i = 0 ; i < 26 ; i++){
		    char inttostr = (char) (i + 'A');//implecity conversion
		    System.out.println(inttostr + " -> "+ arr[i]);
		}
	}
}
