package com.xebia.service;

import com.xebia.exceptions.RobotException;
import com.xebia.model.BarCodeEnum;
import com.xebia.model.Robot;

public interface RobotService {
	
	public void walk(Robot robot, double kmtoWalk) throws RobotException;
	public void carryWeight(Robot robot, int weightToCarry) throws RobotException;
	public void sacnBarCode(BarCodeEnum barCodeEnum) throws RobotException;
	public void walikngWhileCarryingWeight(Robot robot,int weightToCarry, int kilometreToWalk) throws RobotException;
	

}
