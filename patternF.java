public class patternF {
    public static void main(String[] args) {
        
        int n = 5;

        int count = 1;
        for(int row = 0; row < n; row++){

            
            for(int col = 0; col <= row; col++){

                System.out.print(count + " ");

                count = count + 1;
            }

            System.out.println();
        }
    }
}
