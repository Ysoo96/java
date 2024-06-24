package com.javateam.jse;

public enum Week {

	MONDAY(1),
	TUESDAY(2),
	WEDNESDAY(3);
	
	private final int val;
	
	Week (int val) {
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
	
}
