public class patternI {
    public static void main(String[] args) {

        int n = 5;
        
        for(int row = 0; row<n; row++ ){

            int count = 1;

            for(int col = 0; col < n-row; col++){

                System.out.print(count + " ");

                count = count + 1;
            }

            System.out.println();

        }
    }
}
