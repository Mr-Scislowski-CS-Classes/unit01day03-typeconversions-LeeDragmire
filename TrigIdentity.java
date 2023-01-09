public class TrigIdentity {
    public static void main(String[] args) {
        try {
            Double i1 = Double.parseDouble(args[0]);
            System.out.println(Math.sin(i1) + Math.cos(i1));
        }
        catch (NumberFormatException e) {
            System.out.println("Try again");
        }
    }
}
