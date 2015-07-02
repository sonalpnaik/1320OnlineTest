
public class Button {
	String button_name;
	boolean pressed;
	
	public boolean isPressed() {
		return pressed;
	}

	public void setPressed(boolean pressed) {
		this.pressed = pressed;
	}

	public Button(String button_name) {
		super();
		this.button_name = button_name;
		pressed=false;
	}
	
	public String getButtonPressed() {
		return button_name;
	}
	
	public void setButtonPressed(String buttonPressed) {
		this.button_name = buttonPressed;
	}

	

}
