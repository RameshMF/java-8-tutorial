package com.ramesh.java8.defaultstaticinterfacemethods.interfaces;

public interface Alarm {
	default String turnAlarmOn() {
		return "Turning the alarm on.";
	}

	default String turnAlarmOff() {
		return "Turning the alarm off.";
	}
}
