package app;

import boardgame.Position;
import chess.ChessMatch;

public class AppXadrez {

	public static void main(String[] args) {
		System.out.println("tst");
		Position pos = new Position(3,5);
		System.out.println(pos);
		//Board board = new Board(8,8);
		ChessMatch chessMatch = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
	}

}
