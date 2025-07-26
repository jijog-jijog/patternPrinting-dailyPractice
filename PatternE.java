public class PatternE {
    public static void main(String[] args) {
        int n = 5;

        for(int row =0; row <=n; row++){

            int printval = row % 2 == 0 ? 0 : 1;

            for(int col = 0; col < row; col++){

                System.out.print(printval);

                printval = 1 - printval;
            }

            System.out.println();
        }
    }
}
