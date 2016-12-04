package com.xebia.service;

import com.xebia.exceptions.RobotException;

public interface Subject {

	public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers() throws RobotException;

}
