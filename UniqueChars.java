/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String end = "";
        String help = "";
        for(int i=0; i<s.length(); i++){
            if (help.indexOf(s.charAt(i))==-1) {
                if (s.charAt(i)==' ') {
                    end+=s.charAt(i);
                } else{
                    end+=s.charAt(i);
                    help+=s.charAt(i);
                }
            }
        }
        return end;
    }
}
