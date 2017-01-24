import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {
	public static void main(String[] a) {

		DataInputStream d = new DataInputStream(System.in); 
		System.out.println("Enter two numbers to mutiply");
		int x=0,y=0;
		try {
			x = d.readInt();
			y = d.readInt();
			System.out.println(x);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Mutiplication of "+x+" and "+y+" is "+(x*y));
	}
}
