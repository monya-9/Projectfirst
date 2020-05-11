package com.yedam.classes.statics;

public class Car {
	private int Speed;
	private boolean stop;
	
	void setSpeed(int speed) {
		if(speed < 0)
			this.Speed = 0;
		else
			this.Speed = speed;
	}
	
	int getSpeed() {
		return this.Speed;
		
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.Speed = 0;
	}
}
