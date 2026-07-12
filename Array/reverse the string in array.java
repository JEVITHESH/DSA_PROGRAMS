
public class Main
{
	public static void main(String[] args) {
	   String a = "JEVITHESH";
	   int size = a.length();
	   char[] arr = a.toCharArray();
	   int i = 0 ;
	   int j = size - 1;
	   
	   while(i<j){
	       char tem = arr[i];
	       arr[i] = arr[j];
	       arr[j] = tem;
	       i++;
	       j--;
	   }
	   System.out.println(a);
	   for(char aa : arr){
	       System.out.print(aa);
	   }
	}
}
