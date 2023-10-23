/*
 * Write your program inside the main method to build
 * a staicase in a 2D array of characters according
 * to the assignment description
 *
 * To compile:
 *        javac StaircaseBuilder.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class StaircaseBuilder {
    
    public static void main(String[] args) {

        // WRITE YOUR CODE HERE
        int dimension = Integer.parseInt(args[0]);
        int totalBricks = Integer.parseInt(args[1]);
        char[][] characters = new char[dimension][dimension];

        for (int i=0; i < dimension; i++){
            for (int j = dimension -1; j >= 0; j--) {
                if(j>= dimension - 1 - i && totalBricks > 0){
                    characters[j][i] = 'X';
                    totalBricks--;
                } else {
                    characters[j][i] = ' ';
                }
            }
        }
    
        for (int i = 0; i < dimension; i++){
            for (int j = 0; j < dimension; j++){
                System.out.print(characters[i][j]);
            }
            System.out.println();
        }
        System.out.println("Bricks Remaining: " + totalBricks);
    }
}

