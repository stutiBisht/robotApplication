package com.xebia.service;

import com.xebia.exceptions.RobotException;

public interface Observer {

	public void switchOnChestLedLight() throws RobotException;
	public void switchOnHeadRedLight() throws RobotException;
}
