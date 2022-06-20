package com.assessment;

public class AssessmentStarter {

	public static void main(String[] args) {
		
		CeilingFan ceilingFan = new CeilingFan();
		ceilingFan.pullFanSpeedCord();
		ceilingFan.reverseFanDirection();
		ceilingFan.pullFanSpeedCord();
		ceilingFan.pullFanSpeedCord();
		ceilingFan.reverseFanDirection();
		System.out.println(ceilingFan.getSpeed());
		System.out.println(ceilingFan.getDirection());
	}

}
