
public class Face {
	int x,y,vx,vy;
	public Face(int x,int y,int vx,int vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	
	public void Car(MyFrame frame){
		frame.fillRect(x, y, 30, 15);
		frame.fillRect(x - 15, y + 15, 60, 15);
		frame.fillOval(x -7.5, y + 30, 15, 15);
		frame.fillOval(x + 22.5, y + 30, 15, 15);
	}
	
	public void draw(MyFrame frame) {
		frame.fillOval(x,y,50,100);
		frame.fillOval(x + 100,y,50,100);
		frame.fillRect(x,y + 160,150,10);
	}
	
	public void move() {
		x += vx;
		y += vy;
	}
}
