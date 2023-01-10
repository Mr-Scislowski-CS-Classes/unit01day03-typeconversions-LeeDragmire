public class Quadratic {
    public static void main(String[] args) {
        try {
            double a = Integer.parseInt(args[0]);
            double b = Integer.parseInt(args[1]);
            double c = Integer.parseInt(args[2]);
            double d = -b / (2*a);
            double e = Math.sqrt(Math.pow(b, 2) - (4*a*c)) / (2*a);
            System.out.println();
            System.out.println(d + e);
            System.out.println(d - e);
            System.out.println();
            System.out.println(d);
            System.out.println(e);
        }
        catch (NumberFormatException e) {
            System.out.println("try again");
        }
    }
}
