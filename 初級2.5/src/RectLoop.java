
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 100;
		int y = 50;
		int z = 30;
		for(int i = 0; i < 10; i ++) {
			fillRect(z,40,10,x);
			fillRect(z,240 - y,10,y);
		    x -= 10;
		    y += 10;
		    z += 30;
		}
	}
}
