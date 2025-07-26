public class PatternK {
    public static void main(String[] args) {
         int n = 5;

         for(int row = 1; row <= n*2-1; row++){


            {
                int spcval = row <= n ? (n-row) : row - n;

                for(int spc = 1; spc <= spcval; spc++){

                System.out.print(" ");
           }

           int colval = row <= n ? row : (n*2)-row;

            for(int col =1; col <= colval; col++){
                System.out.print("*");
            }

            }

            System.out.println();
            
             
         }
    }
}
