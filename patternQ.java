public class patternQ {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0; i<n; i++){
            {
                for(int spc=0; spc<(n-i); spc++){
                    System.out.print(" ");

                }
    
                for(int col=0; col<=((i+(i-1))); col++){
                    if(col==(n-i)+1 ||  col==(n+i)-3 || col==n) {
                         System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    
                   
                }
            }
            System.out.println();
        }

    }

    
}
