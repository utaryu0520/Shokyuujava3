
public class DisplayFaceObject  extends MyFrame{
	public void run() {
		Face[] faces = new Face[5];
	    faces[0] = new Face(50,50,1,0);
	    faces[1] = new Face(110,110,2,0);
		faces[2] = new Face(160,160,3,0);
		faces[3] = new Face(220,220,4,0);
		faces[4] = new Face(280,280,5,0);
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
