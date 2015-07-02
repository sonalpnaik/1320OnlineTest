

public class Elevetor {
	Floor currentFloor;
	Elevetor_door doorOpen;
	Pannel button_pannel;
	String current_state;
		
	public Elevetor(Floor currentFloor,int n) {
		super();
		this.currentFloor = currentFloor;
		this.doorOpen = new Elevetor_door();
		this.button_pannel = new Pannel(n);
		this.current_state = "idle";
	}
	
	public Pannel getButton_pannel() {
		return button_pannel;
	}

	public void setButton_pannel(Pannel button_pannel) {
		this.button_pannel = button_pannel;
	}

	public String getCurrent_state() {
		return current_state;
	}

	public void setCurrent_state(String current_state) {
		this.current_state = current_state;
	}

	public void goUp(){
			int curentIndex=currentFloor.getFloor_number();
			current_state="up";
			System.out.println("Elevetor is moving up ");
		
	}
	
	public void goDown(){
			int curentIndex=currentFloor.getFloor_number();
			current_state="down";
			System.out.println("Elevetor is moving down ");
		
	}
	
	public Floor getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(Floor currentFloor) {
		this.currentFloor = currentFloor;
		System.out.println("Elevetor is now at "+currentFloor.getFloor_number()+" floor");
	}
	
	public void pressPannelButton(int n){
		button_pannel.setButton(n);
	}
	
	public int getPannelButton(){
		return button_pannel.getPressd_button();
	}
	public void open_door(){
		current_state="idle";
		doorOpen.setDoor_open(true);
	}
	public void close_door(){
		doorOpen.setDoor_open(false);
	}
	public boolean isDoorOpen(){
		return doorOpen.isDoor_open();
	}
}
