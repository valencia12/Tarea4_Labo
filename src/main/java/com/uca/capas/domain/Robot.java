package com.uca.capas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	@AssertTrue(message = "UPS eres un robot, por favor dar click en regresar")
	private boolean soyRobot;

	public boolean isSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	

}
