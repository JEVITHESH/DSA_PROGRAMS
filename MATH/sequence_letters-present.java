import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       int arr[] = new int[26];
       String word;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the word : ");
       word = sc.nextLine();
       word = word.toUpperCase();  
       int len = word.length();
       for(int i = 0 ; i<len ; i++){
           arr[word.charAt(i) -'A']++;
       }
       for(int i = 0 ; i < 26;i++){
           char ch = (char)(i +'A');  
           System.out.println(ch+" -> "+arr[i]);
       }
    }
}
