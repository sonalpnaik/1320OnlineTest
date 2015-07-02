
public class Floor {
	int floor_number;
	floor_button button_pressed;
	
	public Floor(int floor_number) {
		super();
		this.floor_number = floor_number;
	}

	public int getFloor_number() {
		return floor_number;
	}

	public void setFloor_number(int floor_number) {
		this.floor_number = floor_number;
	}
	
	public String getPressedButton(){
		if(button_pressed instanceof Floor_up_button)return "up";
		if(button_pressed instanceof Floor_down_button)return "down"; 
		return null;
	}
	
	public void pressUp(){
		button_pressed=new Floor_up_button();
		button_pressed.setPressed(true);
	}
	
	public void pressDown(){
		//System.out.println("000000000000000000000");
		button_pressed=new Floor_down_button();
		button_pressed.setPressed(true);
	}
}
