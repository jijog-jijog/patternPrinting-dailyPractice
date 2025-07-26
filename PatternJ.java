

public class PatternJ {
   public static void main(String[] args) {
    
    int n = 5;
    int rowval = n*2-1;

    for(int row = 1; row<= rowval; row++){

        int rowval1 = row <= 5 ? row :  rowval-row+1;

        for(int col = 0; col < rowval1; col++){
            
            System.out.print("*");
        }
        System.out.println();
    }
   }
}
