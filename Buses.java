public class Buses {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num < 0) {
            System.out.println("ERROR");
            return;
        }

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += num % 10;
            num /= 10;
        }
        
        if (sum % 2 == 0) {
            System.out.println("LX");
        } else {
            System.out.println("H");
        }
    }
}
