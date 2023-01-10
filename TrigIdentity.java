public class TrigIdentity {
    public static void main(String[] args) {
        try {
            Double i1 = Double.parseDouble(args[0]);
            System.out.println(Math.pow(Math.sin(i1), 2) + Math.pow(Math.cos(i1), 2));
        }
        catch (NumberFormatException e) {
            System.out.println("Try again");
        }
    }
}
