public class NumericalPatterns
{
    public static void main(String[] args) {
        int n=5;

//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }

        //pattern 2
        int count=1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
