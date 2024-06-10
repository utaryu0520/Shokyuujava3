
public class Car2 extends MyFrame{
	public void run(int x, int y,int vx, int vy){
		Face[] faces = new Face[2];
		faces[0] = new Face(50,50,1,0);
	    faces[1] = new Face(250,110,-1,0);
	    for(int i = 0; i < 30; i++) {
			clear();
			for(int j = 0; j < faces.length; j++) {
				faces[j].Car(this);
				faces[j].move();
			}
			sleep(0.1);
	    }
	}
}
