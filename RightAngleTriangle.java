public class RightAngleTriangle
{
    public static void main(String[] args) {

//        int n=5;
//
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern 4

//            int n=5;
//
//            for(int row=1;row<=n;row++){
//                for(int col=1;col<=n-row;col++){
//                    System.out.print(" ");
//                }
//                for(int col=1;col<=n;col++){
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

        // triangle
            int n=6;

            for(int row=1;row<=n;row++){
                for(int col=1;col<=n-row;col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }

