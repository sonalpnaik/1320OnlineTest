
public class Elevetor_door {
boolean door_open;
	public Elevetor_door() {
		super();
		door_open=false;
	}
	public boolean isDoor_open() {
		return door_open;
	}
	public void setDoor_open(boolean door_open) {
		this.door_open = door_open;
		if(isDoor_open())
			System.out.println("door is open");
		else
			System.out.println("door closed");
	}

}
