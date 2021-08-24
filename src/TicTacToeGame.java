import java.util.Scanner;

public class TicTacToeGame{

    //creating empty board
    public static char[] createboard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {     //Ignoring 0th index
            board[i] = scan.next().charAt(0);
        }
        return board;
    }

    // Welcome To tictactoegame
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame");
        createboard();
        if (isSpacefree( char[]board, int index))
        System.out.println("Select the index from 1 to 9");
        int n = scan.nextInt();
        System.out.println(n);
    }
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
        return board[index]==' ';

    }


    public static void chooseusercomputer() {
        int ischeck = 1;
        int emp_check = (int) Match.floor(Math.random() * 10) % 2;
        if (ischeck == emp_check)
            System.out.println("User will play the game");
        else
            System.out.println("Computer will play the game");
    }

    public static void resultdetermination() {
        int istie = 1;
        int iswinner=2;
        int emp_check = (int) Match.floor(Math.random() * 10) % 2;
        if (iswinner == emp_check)
            System.out.println("WIN");
        if (istie== emp_check)
            System.out.println("TIE");
        else
            System.out.println("Please change the turn.");
    }

    public static void computerDetermination(){
        int iscomputer=1;
        int empcheck=(int)Math.floor(Math.random()*10) %2;
        if (iscomputer==empcheck)
            System.out.println("Computer will play the game");
        else
            System.out.println("Computer will take a turn");

    }
}