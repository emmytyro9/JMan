import java.awt.Color;

public class Mover extends Piece{
	/** Constructor: a new WALKER at position (x, y) on Map m
    with color red if c = 0, green if c = 1, and yellow if c = 2. */
	public Mover(int x, int y, int c, Map m){
		super(Piece.WALKER, m); 
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

	/** Constructor: a new J*Man at position (x, y) on Map m
    with color c. Precondition: c is one of
    Color.RED, Color.GREEN, and Color.YELLOW.*/
	public Mover(int x, int y, Color c, Map m){
		super(Piece.WALKER, m);
		if(c.equals(Color.RED) || c.equals(Color.GREEN) || c.equals(Color.YELLOW)) {
			this.setColor(c) ; 
		}
	}

	public void act(){
		if(Piece.rand(0, 2) == 0) {
			if(Piece.rand(0, 3) == 0 && this.getMap().isEmpty(this.getX(), this.getY()+1)) {
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()+1);
			}else if(Piece.rand(0, 3) == 1 && this.getMap().isEmpty(this.getX(), this.getY()-1)) {
				this.getMap().move(this.getX(), this.getY(), this.getX(), this.getY()-1);
			}else if(Piece.rand(0, 3) == 2 && this.getMap().isEmpty(this.getX()-1, this.getY())) {
				this.getMap().move(this.getX(), this.getY(), this.getX()-1, this.getY());
			}else if(Piece.rand(0, 3) == 3 && this.getMap().isEmpty(this.getX()+1, this.getY())) {
				this.getMap().move(this.getX(), this.getY(), this.getX()+1, this.getY());
			}
		}
	}

	/** = representation of this piece */
	public String toString() {
		String color = "";
		return getColorWord() + " Pillar at (" + getX() + ", " + getY() + ")";
	}
}
