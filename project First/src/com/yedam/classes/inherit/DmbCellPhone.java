package com.yedam.classes.inherit;

public class DmbCellPhone extends CellPhone { //extends 쓴후 뒤에 부모클래스 이름
	int channel;

	public DmbCellPhone(String model, String color) {
		super(model, color); //super => CellPhone(a, b);
	} 
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); //super => CellPhone(a, b);
		this.channel = channel;
	} 
	
	@Override
	void powerOn() {
		System.out.println("DMB 폰의 전원을 켭니다.");
	}

	@Override
	void powerOff() {
		System.out.println("DMB 폰의 전원을 끕니다.");
	}

	void turnOnDmv() {
		System.out.println("채널: " + channel + "번 방송을 수신.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널: " + channel + "번으로 변경.");
	}
	void turnOffDmb() {
		System.out.println("DMB 수신을 종료.");
	}
	
}
