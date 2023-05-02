public class MatrixAdd {
    
    public static void main(String args[]){

        int m1[][] = {{1,22,44},{2,21,11},{11,41,6}};
        int m2[][] = {{12,13,3},{1,51,45},{18,14,5}};
        int am[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                am[i][j] = m1[i][j] + m2[i][j];
                System.out.print(am[i][j] + " ");
            }
            System.out.println();
        }
    }
}

