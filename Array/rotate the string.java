class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) { // check the lrngth for both s and goal 
            return false;
        }

        int n = s.length();

        for (int i = 0; i < n; i++) {

            if (s.equals(goal)) {
                return true;
            }

            char[] arr = s.toCharArray(); // create the array and store the string into array

            char temp = arr[0];

            for (int j = 1; j < n; j++) {
                arr[j - 1] = arr[j];
            }

            arr[n - 1] = temp;

            s = new String(arr);//array to string
        }

        return false;
    }
}
