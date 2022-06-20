package com.assessment;

public class CeilingFan {
	
	//enums for fan directions
	public enum Direction {
		FORWARD,BACKWARD;
	}

	//Speed 0 indicates "OFF" state
	private int speed = 0;
	
	//Default Direction of fan is "FORWARD"
	private Direction direction = Direction.FORWARD;
	
	public int getSpeed() {
		return speed;
	}

	public Direction getDirection() {
		return direction;
	}
	
	//method to increase the speed
	public void pullFanSpeedCord() {
		
		if (speed == 3) {
			//set speed to 0("OFF" state when cord is pulled at speed = 3)
			speed = 0;
		} else {
			speed++;
		}
	}
	
	//method to reverse direction
	public void reverseFanDirection() {
		direction = (direction == Direction.FORWARD) ? Direction.BACKWARD : Direction.FORWARD;
	}
	
}
