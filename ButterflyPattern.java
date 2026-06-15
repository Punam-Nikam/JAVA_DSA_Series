public class ButterflyPattern {
    public static void main(String[] args) {
        //part 1
        int n = 4;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //part 2
            for (int col = 1; col <= 2 * (n - row); col++) {
                System.out.print("  ");
            }
            // part 3
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //part invert
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row+1; col++) {
                System.out.print("* ");
            }
            //part 2
            for (int col = 1; col <= 2*(row-1); col++) {
                System.out.print("  ");
            }
            // part 3
            for (int col = 1; col <=n-row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}


        //part 2
//
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=n-row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        //part 3
//
//
//    }
//
