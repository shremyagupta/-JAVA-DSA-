/*
class Pattern {
    public static int[][] hollow_rectangle( int totRows, int  totCols){
        int[][] res = new int[totCols][totRows];
        for(int i = 1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1) {
                    res[i][j] = '*';
                }
                else if(j==1) {
                    res[i][j] = '*';
                }
                else if(i==totRows)v{
                    res[i][j] = '*';
                }
                else if (j==totCols) {
                    res[i][j] = '*';
                }
            }
        }
        return res;

    }
    public static void main(String[] args){
      hollow_rectangle(4,5 );
    }
}
    

*/
/* 
class Pattern {
    public static int[][] hollow_rectangle(int totRows, int totCols) {
        int[][] res = new int[totRows][totCols]; // 0-based indexing
        
        for (int i = 0; i < totRows; i++) { // Start from 0
            for (int j = 0; j < totCols; j++) { // Start from 0
                // Check for boundary conditions
                if (i == 0 || i == totRows - 1 || j == 0 || j == totCols - 1) {
                    res[i][j] = 1; // Use 1 instead of '*' as it's an integer array
                } else {
                    res[i][j] = 0; // Optional: Fill inner cells with 0
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] rectangle = hollow_rectangle(4, 5);
        
        // Print the 2D array
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
    public class Pattern{
        public static void hollow_rectangle(int totRows, int totCols){
            for(int i = 1; i<=totRows; i++)
            {
                for( int j = 1; j<= totCols; j++){
                    if(i==1 || i == totRows || j==1 || j == totCols ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }


                System.out.println();
            }
        }
        public static void main(String[] args) {
            hollow_rectangle(4, 5);
        }
    }
        */
/* 
*/
public class Pattern {
    public static void invert_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
// [] aa => aa.length-1;
// int x = nums.length-1;
    }

    public static void main(String[] args) {
        invert_pyramid(5);
    }
}
