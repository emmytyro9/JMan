import java.awt.Color;

public class Pillar extends Piece {
	/** Constructor: a new J*Man at position (x, y) on Map m
    with color red if c = 0, green if c = 1, and yellow if c = 2. */
	public Pillar(int x, int y, int c, Map m){
		super(Piece.PILLAR, m); 
		this.setX(x) ;
		this.setY(y) ;
		if(c == 0) {
			this.setColor(Color.RED) ;
		}else if(c == 1) {
			this.setColor(Color.GREEN) ; ;
		}else if(c == 2) {
			this.setColor(Color.YELLOW) ; ;
		}
	}

	/** Constructor: a new Pillar at position (x, y) on Map m
    with color c. Precondition: c is one of
    Color.RED, Color.GREEN, and Color.YELLOW.*/
	public Pillar(int x, int y, Color c, Map m){
		super(Piece.PILLAR, m);
		if(c.equals(Color.RED) || c.equals(Color.GREEN) || c.equals(Color.YELLOW)) {
			this.setColor(c) ; 
		}
	}

	/** Pillar should move based on what button is pushed.
    This method is not used. */
	public void act(){
		if(Piece.rand(0, 2) == 0) {
			if(Piece.rand(0, 2) == 0) {
				this.setColor(Color.RED) ;
			}else if(Piece.rand(0, 2) == 1) {
				this.setColor(Color.GREEN) ;
			}else if(Piece.rand(0, 2) == 2) {
				this.setColor(Color.YELLOW) ;
			}
		}
	}

	/** = representation of this piece */
	public String toString() {
		String color = "";
		return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	}
}
