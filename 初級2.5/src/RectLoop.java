
public class RectLoop extends MyFrame{
	public void run() {
		setColor(0,128,0);
		int x = 5;
		for(int i = 0; i < 10; i ++) {
			fillRect(x,x,x + 5,x + 5);
			x = x + x + 5;
		}
	}
}
