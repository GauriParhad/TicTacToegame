public class TicTacToeGame {
    import java.util.Scanner;


    //creating empty board
    public static char[] createboard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {     //Ignoring 0th index
            board[i] = ' ';
        }
        return board;
    }

    // Welcome To tictactoegame
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame");
        createboard();
        if (isSpacefree( char[] board, int index))
        System.out.println("Select the index from 1 to 9");
     else
        System.out.println("Space is full");
    }


    //Creating method for playercomputer
    //Giving the inputs X or O

    public static void playercomputer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Two choices to play");
        System.out.println("O: Play");
        System.out.println("X: No Play");
        System.out.println("Enter the choice O or X");
        char ch = scan.next().charAt(0);
        switch (ch) {
            case 'O':
                System.out.println("congratulations ypu can play the game.");
                break;
            case 'O':
                System.out.println("Sorry, you cannot play the game.");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }


    public static int showboard(()
    {
        System.out.println("|---|---|---|");
        System.out.println("|"+board[1]+"|"+board[2]"|"+board[3]+"|");
        System.out.println("|------------");
        System.out.println("|"+board[4]+"|"+board[5]"|"+board[6]+"|");
        System.out.println("|------------");
        System.out.println("|"+board[7]+"|"+board[8]"|"+board[9]+"|");
        System.out.println("|---|---|---|");
        
    }


    public static boolean isSpacefree(char[]board,int index)
    {
        return board[index]=' ';

    }

}