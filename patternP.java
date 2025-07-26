public class patternP {
    public static void main(String[] args) {
        int n = 5;

        for(int i=0; i<n*2; i++){
            {
                int spcval = i <n ? i : (n*2)-i;
                for(int spc = 0; spc<=spcval; spc++){
                    System.out.print(" ");
                }

                   int colval = i<n ? n-i : i-n;
                    for(int col=0; col<=colval; col++){
                        System.out.print("*"+ " ");
                    }
            }
            System.out.println();
        }
    }
}
