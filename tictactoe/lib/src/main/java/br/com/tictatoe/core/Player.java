package br.com.tictatoe.core;

import br.com.tictatoe.ui.UI;

public class Player {

	private String name;
	private Board board;
	private char symbol;

	public Player(String nameString, Board board, char symbol) {
		this.name = nameString;
		this.board = board;
		this.symbol = symbol;
	}

	private Move inputMove() throws InvalidMoveException {
		String moveStr = UI.readInput("Jogador '" + name +"' =>" );
		//Move m = new Move(moveStr);
		return new Move(moveStr);
		
	}
	
	public boolean play() throws InvalidMoveException {
		Move move = inputMove();
		return board.play(this, move);
		
	}

	public String getName() {
		return name;
	}

	public Board getBoard() {
		return board;
	}

	public char getSymbol() {
		return symbol;
	}
	
	
	
}
