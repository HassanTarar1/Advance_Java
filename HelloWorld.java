import edu.duke.*;

public class HelloWorld {
	private  int x;
	private int y;
	public  HelloWorld(int startx, int startY){
		x=startx;
		y=startY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	public double distance(HelloWorld otherpt){
		int dx= x - otherpt.getX();
		int dy= y- otherpt.getY();
		return Math.sqrt(dx * dx + dy * dy);
	}
	public static void main (String [] args) {

		HelloWorld h= new HelloWorld(3,4);
		HelloWorld t= new HelloWorld(6,8);
		System.out.println(h.distance(t));



//		FileResource res = new FileResource("hello_unicode.txt");
//		res.write("hassan ijaz Tarar");
//		for (String line : res.lines()) {
//			System.out.println(line);
//		}
	}
}
