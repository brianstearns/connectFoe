package src;

public class Board {
    int rows;
    char[][] boardArray;

    public Board(int rows) {
        fillBoard(rows);
    }


    public void fillBoard(int rows) {
        this.rows = rows;
        boardArray = new char[rows][rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < rows; j++) {
                boardArray[i][j] = '-';
            }
        }
    }

    public Board() {
        this(3);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < rows; j++) {
                sb.append(boardArray[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public char[][] getBoardArray() {
        return boardArray;
    }

    public void makeMove(int row, int col, char player) {
        if (row >= 0 && row < rows && col >= 0 && col < rows && boardArray[row][col] == '-') {
            boardArray[row][col] = player;
        } else {
            System.out.println("Invalid move. Try again.");
        }
        System.out.println(this);
    }
}
