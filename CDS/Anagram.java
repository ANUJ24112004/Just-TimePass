public class Anagram {
    public static void main(String args[]) {
        String A ="EARTH";
        String B ="HEART";
        int x;
        for (int i = 0; i <A.length(); i++) {
            for (int j = 0; j <B.length(); j++) {
                if(A.charAt(i)==B.charAt(j))
                x=1;
            }
        }
        if(x==1){
            System.out.println("it is anagram");
        }
        else
        System.out.println("it is not anagram");
    }
}
