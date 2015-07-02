import java.util.ArrayList;


public class Elevetor_controller {
	ArrayList<Floor> Floor_list=new ArrayList<Floor>();
	int number_of_floors;
	Elevetor elevetor;
	
	public Elevetor_controller(){
		number_of_floors=5;
		for(int i=0;i<number_of_floors;i++){
			Floor_list.add(new Floor(i));
		}
		elevetor=new Elevetor(Floor_list.get(0), number_of_floors);
	}

	public boolean requestFrom(int req_floor,String s) {
		Floor requested_floor=Floor_list.get(req_floor);
		if(s.equals("up"))
			requested_floor.pressUp();
		else
			requested_floor.pressDown();
		System.out.println(requested_floor.getPressedButton());
		
		return move_To_Req_floor(requested_floor);
	}

	private boolean move_To_Req_floor(Floor requested_floor) {
		
		if(!elevetor.isDoorOpen()){
				Floor current_floor=elevetor.getCurrentFloor();
				 if(requested_floor.getPressedButton().equals(elevetor.getCurrent_state()) || elevetor.getCurrent_state().equals("idle")){
					moveLogic(current_floor,requested_floor);
					current_floor=elevetor.getCurrentFloor();
					if(current_floor.equals(requested_floor)){
						//System.out.println("elevetor is on "+current_floor.getFloor_number() +"floor");
						elevetor.open_door();
						return true;
					}	
			}
				 
		}
		return false;
	}
	
	public void setElevetorFloor(int n) {
		elevetor.setCurrentFloor(Floor_list.get(n));
	}

	public void MoveTofloor() {
		Floor current_floor=elevetor.currentFloor;
		Floor requested_floor=Floor_list.get(elevetor.getPannelButton());
		moveLogic(current_floor,requested_floor);
		elevetor.open_door();
	}

	public void pressPanelButton(int i) {
		elevetor.pressPannelButton(i);
		elevetor.close_door();
	}
	
	private void moveLogic(Floor current_floor, Floor requested_floor) {
		if(current_floor.getFloor_number()<= requested_floor.getFloor_number()){
			while(current_floor.getFloor_number()<requested_floor.getFloor_number()){
				elevetor.goUp();
				elevetor.setCurrentFloor(Floor_list.get(current_floor.getFloor_number()+1));
				 current_floor=elevetor.getCurrentFloor();
			}
		}
		else{
			while(current_floor.getFloor_number()> requested_floor.getFloor_number()){
				elevetor.goDown();
				elevetor.setCurrentFloor(Floor_list.get(current_floor.getFloor_number()-1));
				current_floor=elevetor.getCurrentFloor();
			}
		}
	}

}
