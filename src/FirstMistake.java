
public class FirstMistake {

	public static void main(String[] args) {
		FirstMistake fm = new FirstMistake();
	}
	
	public FirstMistake() {
		//Declare some rectangles to compare
		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(3, 4);
		Rectangle r3 = new Rectangle(2, 6);
		Rectangle r4 = new Rectangle(4, 3);

		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));
		System.out.println(r1.equals(r4));
	}
	
	//A rectangle CLASS with height and width properties and constructor and EQUALS methods
	public class Rectangle {
		public int h, w;
		
		public Rectangle(int height, int width) {
			h = height;
			w = width;
		}
		
		public boolean equals(Object r) {
		    if (r == this) {
		        return true;
		      }
		      if (!(r instanceof Rectangle)) {
		        return false;
		      }

		      Rectangle rect = (Rectangle)r;
		      if (this.h == rect.h && this.w == rect.w) {
		    	  return true;
		      }
		      return false;
		}
	}
}
