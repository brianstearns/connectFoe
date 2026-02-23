package src;

public class Game {
    public static void main(String[] args) {
        Board board = new Board(5);
        board.makeMove(0, 0, 'X');
        board.makeMove(1, 1, 'O');
    }
}
