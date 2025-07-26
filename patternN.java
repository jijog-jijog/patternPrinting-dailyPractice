public class patternN {
    public static void main(String[] args) {
        
        int n = 10;

        for(int row = 1; row < (n*2); row++){

            { int spclen = row < n ? (n-row) : (row -n);

            for(int spc = 1; spc <= spclen; spc++){
                System.out.print(" " + " ");
            }

            int collen = row < n ? (row*2)-1 : 4 * n - 2 * row - 1;

            for(int col = 1; col <= collen; col++){
                System.out.print("*" + " ");
            }
        }

        System.out.println();
           

        }
    }
}
