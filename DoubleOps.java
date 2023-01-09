class DoubleOps {
    public static void main(String[] args) {
        try {
            double i1 = Double.parseDouble(args[0]);
            double i2 = Double.parseDouble(args[1]);
            System.out.println(Math.abs(i1));
            System.out.println(Math.pow(i1, 2));
            System.out.println(Math.sqrt(i1));
            System.out.println(Math.random() * i1);
            System.out.println();
            System.out.println(Math.abs(i2));
            System.out.println(Math.pow(i2, 2));
            System.out.println(Math.sqrt(i2));
            System.out.println(Math.random() * i2);
        }
        catch (NumberFormatException e) {
            System.out.println("try again");
        }
    }
}