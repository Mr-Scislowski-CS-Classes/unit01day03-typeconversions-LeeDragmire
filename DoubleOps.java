class DoubleOps {
    public static void main(String[] args) {
        try {
            double i1 = Double.parseDouble(args[0]);
            double i2 = Double.parseDouble(args[1]);
            System.out.println("args 1 abs = " + Math.abs(i1));
            System.out.println("args 1 squared - " + Math.pow(i1, 2));
            System.out.println("args 1 sqare root = " + Math.sqrt(i1));
            System.out.println("math.random * args 1 = " + Math.random() * i1);
            System.out.println();
            System.out.println("args 2 abs = " + Math.abs(i2));
            System.out.println("args 2 squared - " + Math.pow(i2, 2));
            System.out.println("args 2 sqare root = " + Math.sqrt(i2));
            System.out.println("math.random * args 2 = " + Math.random() * i2);
        }
        catch (NumberFormatException e) {
            System.out.println("try again");
        }
    }
}