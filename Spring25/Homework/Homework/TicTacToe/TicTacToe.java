import java.util.Scanner;

/**
 * TicTacToe class implements a two-player Tic Tac Toe game on a 3x3 board.
 * The game alternates between players 'X' and 'O', asking for user input at each turn.
 * After each move, the board is checked for a win or a draw.
 */
public class TicTacToe {
    
    private char[][] board;      // 3x3 board representation -is this not correct? not running 5/30/2025
    private char currentPlayer;  // Tracks the current player: either 'X' or 'O'
    
    /**
     * Constructor initializes the game board and sets the starting player.
     */
    public TicTacToe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();
    }
    
    /**
     * Initializes the board by filling each cell with a placeholder ('-') to indicate an empty spot.
     * Renamed after refactoring some code into the printBoard method after game failed to update. 
     * Although maybe I could've kept them both in the same method. 6/5/2025
     */
    public void initializeBoard() {    
            for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }
    
    /**
     * Prints the current state of the board to the console. Added after no update to gameboard.
     */
    public void printBoard() {
        System.out.println("\nCurrent Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    /**
     * Checks if the board is completely filled.
     * @return true if there are no empty spaces, false otherwise.
     */
    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Determines whether the current player has won the game.
     * @return true if the current player has any winning combination.
     */
    public boolean checkForWin() {
        return (checkRows() || checkColumns() || checkDiagonals());
    }
    
    /**
     * Helper method that checks all rows for a win. -Test completed
     */
    private boolean checkRows() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && 
                board[i][1] == currentPlayer && 
                board[i][2] == currentPlayer) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Helper method that checks all columns for a win. -Test completed
     */
    private boolean checkColumns() {
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == currentPlayer && 
                board[1][j] == currentPlayer &&
                board[2][j] == currentPlayer) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Helper method that checks both diagonals for a win.
     */
    private boolean checkDiagonals() {
        // Check the primary diagonal -Test completed
        if (board[0][0] == currentPlayer && 
            board[1][1] == currentPlayer && 
            board[2][2] == currentPlayer) {
            return true;
        }
        // Check the secondary diagonal -Test completed
        if (board[0][2] == currentPlayer && 
            board[1][1] == currentPlayer && 
            board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }
    
    /**
     * Switches the turn from the current player to the other player.
     * Test completed
     */
    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    
    /**
     * Issue flags line 132 as break in the code after the main method was missing when inputting values. Fixed-format expected is int space int. (1 1, or 2 3, etc.)
     * Attempts to mark the given board cell with the current player's symbol. 
     * @param row The row index chosen by the player (0-2).
     * @param col The column index chosen by the player (0-2).
     * @return true if the move is valid and successful, false if the cell is already occupied or out-of-bounds.
     */
    public boolean placeMark(int row, int col) {
        // Validate that the requested cell is within the board limits and is empty
        if (row >= 0 && row < 3 && col >= 0 && col < 3) {
            if (board[row][col] == '-') {
                board[row][col] = currentPlayer;
                return true;
            }
        }
        return false; // invalid move
    }
    
    /**
     * Main game loop that continues until a win or draw is detected.
     */
    public void play() {
        Scanner scanner = new Scanner(System.in);
        boolean gameEnded = false;
        while (!gameEnded) {
            printBoard();
            System.out.println("\nPlayer " + currentPlayer + "'s turn.");
            System.out.print("Enter your move (row [1-3] and column [1-3]): ");
            
            // Obtain move coordinates from the player. We subtract 1 to adjust for zero-based indexing.
            int row = scanner.nextInt() - 1;
            int col = scanner.nextInt() - 1;
            
            // Validate the move
            if (!placeMark(row, col)) {
                System.out.println("Invalid move. Cell already occupied or out of bounds. Try again.");
                continue; // Ask the same player for a new move
            }
            
            // Check if the move wins the game
            if (checkForWin()) {
                printBoard();
                System.out.println("\nPlayer " + currentPlayer + " wins!");
                gameEnded = true;
            } 
            // Check if the board is full, implying a draw
            else if (isBoardFull()) {
                printBoard();
                System.out.println("\nThe game is a draw.");
                gameEnded = true;
            } 
            else {
                // Continue game, switch to other player
                changePlayer();
            }
        }
        scanner.close();
    }
    
    /**
     * Main method to start the game was missing. This main call fixed issue from 5/30/2025
     */
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}
//This was a tough assignment, but I learned a lot about how to implement a game in Java. Wish I didnt make so many easy mistakes, but I am glad I got it working in the end.