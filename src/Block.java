import java.awt.Color;

public class Block extends Piece{
	
	/** Constructor: a new Block at position (x, y) on Map m */
   public Block(int x, int y, Map m){
       super(Piece.BLOCK, m); 
       this.setX(x) ;
       this.setY(y) ;
       this.setColor(Color.WHITE);
   }
   
   /** Block should move based on what button is pushed.
    This method is not used. */
   public void act(){
       return;
   }
   
   /** = representation of this piece */
   public String toString() {
       String color = "";
       return getColorWord() + " Block at (" + getX() + ", " + getY() + ")";
   }
}
