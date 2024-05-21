
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 30;
		int y = 10;
		for(int i = 0; i < 10; i ++) {
			fillRect(x,80,10,100);
			setColor(0, 128 + y, 0);
			x += 20;
			y += 10;
		}
	}
}
