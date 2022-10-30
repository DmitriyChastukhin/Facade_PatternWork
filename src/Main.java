public class Main {

    public static void main(String[] args) {

        String binNum1 = "1100100";  // 100 в двоичной системе
        String binNum2 = "11001000";  // 200 в двоичной системе
        BinOps binOps = new BinOps();
        System.out.println(binOps.sum(binNum1, binNum2));
        System.out.println(binOps.mult(binNum1, binNum2));


    }
}
