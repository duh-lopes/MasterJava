package br.com.tictatoe.core;

import br.com.tictatoe.Constants;
import br.com.tictatoe.ui.UI;

public class Board {

	private char[][] matrix;

	public Board() {
		matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
		clear();

	}

	public void clear() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = ' ';
			}
		}
	}

	public void print() {

		UI.printNewLine();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));

				if (j < matrix[i].length - 1) {
					UI.printTextWithNoNewLine(" | ");
				}
			}

			UI.printNewLine();

			if (i < matrix.length - 1) {
				UI.printText("----------");
			}
		}
	}

	public boolean isFull() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

	public boolean play(Player player, Move move) throws InvalidMoveException {
		int i = move.getI();
		int j = move.getJ();

		if (i < 0 || j < 0 || i >= Constants.BOARD_SIZE || j >= Constants.BOARD_SIZE) {
			throw new InvalidMoveException("O intervalo da jogada é invalido!");
		}

		if (matrix[i][j] != ' ') {
			throw new InvalidMoveException("Essa jogada ja foi realizada!");
		}

		// TODO validar os movimentos

		matrix[i][j] = player.getSymbol();

		return checkRows(player) || checkCols(player) || checkDiagonal1(player) || checkDiagonal2(player);

		// TODO Checar se o jogador ganhou.

	}

	private boolean checkRows(Player player) {
		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			if (checkRow(i, player)) {
				return true;
			}
		}
		return false;
	}

	private boolean checkRow(int i, Player player) {
		char symbol = player.getSymbol();

		for (int j = 0; j < Constants.BOARD_SIZE; j++) {
			if (matrix[i][j] != symbol) {
				return false;
			}
		}

		return true;
	}

	private boolean checkCols(Player player) {
		char symbol = player.getSymbol();

		for (int j = 0; j < Constants.BOARD_SIZE; j++) {
			if (checkCol(j, player)) {
				return true;
			}
		}

		return false;
	}

	private boolean checkCol(int j, Player player) {
		char symbol = player.getSymbol();

		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			if (matrix[i][j] != symbol) {
				return false;
			}
		}

		return true;
	}

	private boolean checkDiagonal1(Player player) {
		char symbol = player.getSymbol();

		for (int i = 0; i < Constants.BOARD_SIZE; i++) {
			if (matrix[i][i] != symbol) {
				return false;
			}
		}
		return true;
	}

	private boolean checkDiagonal2(Player player) {
		char symbol = player.getSymbol();
		int lastLine = Constants.BOARD_SIZE - 1;

		for (int i = lastLine, j = 0; i >= 0; i--) {
			if (matrix[i][j] != symbol) {
				return false;
			}
		}
		return true;
	}

}