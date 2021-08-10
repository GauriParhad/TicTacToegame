public class TicTacToeGame {

    //creating empty board
    public static char[] createboard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {     //Ignoring 0th// index
            board[i] = ' ';
        }
        return board;
    }

    // Welcome To tictactoegame
    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToeGame");
        createboard();
    }
}
