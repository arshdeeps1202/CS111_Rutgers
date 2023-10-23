public class Palindrome{
    public static void main(String[] args) {
       int m1 = Integer.parseInt(args[0]);
       int m2 = Integer.parseInt(args[1]);
       int m3 = Integer.parseInt(args[2]);
       int m4 = Integer.parseInt(args[3]);
       int m5 = Integer.parseInt(args[4]);
       int m6 = Integer.parseInt(args[5]);
       
       boolean checkP = (m1 == m6) & (m2 == m5) & (m3 == m4);
       System.out.println(checkP);

    }
}