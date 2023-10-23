public class DogWalker {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        int x = 0, y = 0;
        System.out.println("(" + x + "," + y + ")");
        for (int i = 0; i < num; i++) {
            double r = Math.random();
            if (r < 1.0/4.0) y++;
            else if (r < 2.0/4.0) y--;
            else if (r < 3.0/4.0) x++;
            else x--;
            System.out.println("(" + x + "," + y + ")");
        }
        double sqdist = x*x + y*y;
        System.out.println("Squared distance = " + sqdist);
    }
}
