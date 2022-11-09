package boardlayer;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1){
			throw new Exception("Error Creating Board: Rows and Columns cannot be zero.");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}
	
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public Piece piece(int row, int column){
		if (!positionExists(row,column)){throw new Exception("Board Exception: Piece Position not Existent");}
		return pieces[row][column];
	}
	public Piece piece(Position position){
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public Piece removePiece(Position position){
		if (!positionExists(position)){
			throw new Exception("Position not available.");
		}
		if (piece(position) == null){
			return null;
		}
		Piece auxPiece = piece(position);
		auxPiece.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return auxPiece;
	}
	public void placePiece(Piece piece, Position position){
		if (thereIsAPiece(position)){throw new Exception("Invalid move, piece position occupied: " + position);}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	private boolean positionExists (int row, int column){
		return row >= 0 && row < rows && column >=0 && column < columns;
	}
	public boolean positionExists(Position position){
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position){
		if (!positionExists(position)){throw new Exception("Board Exception: Piece Position not Existent");}
		return piece(position) != null;
	}
	
}
