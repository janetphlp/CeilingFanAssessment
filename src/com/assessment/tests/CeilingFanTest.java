package com.assessment.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.assessment.CeilingFan;
import com.assessment.CeilingFan.Direction;

class CeilingFanTest {

	private CeilingFan ceilingFan;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ceilingFan = new CeilingFan();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSpeedIncreaseInForwardDirection() {
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
		
		ceilingFan.pullFanSpeedCord();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
	}
	
	@Test
	void testSpeedIncreaseInBackwardDirection() {
		ceilingFan.reverseFanDirection();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.BACKWARD, ceilingFan.getDirection());
		
		ceilingFan.pullFanSpeedCord();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.BACKWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.BACKWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.BACKWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.BACKWARD, ceilingFan.getDirection());
	}
	
	@Test
	void testSpeedIncreaseInForwardAndBackwardDirection() {
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
		
		ceilingFan.pullFanSpeedCord();
		ceilingFan.reverseFanDirection();
		assertEquals(1, ceilingFan.getSpeed());
		assertEquals(Direction.BACKWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(2, ceilingFan.getSpeed());
		assertEquals(Direction.BACKWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		ceilingFan.reverseFanDirection();
		assertEquals(3, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());

		ceilingFan.pullFanSpeedCord();
		assertEquals(0, ceilingFan.getSpeed());
		assertEquals(Direction.FORWARD, ceilingFan.getDirection());
	}

}
