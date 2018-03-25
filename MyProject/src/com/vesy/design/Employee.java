package com.vesy.design;

public class Employee {
	
	int rank;
	boolean free;
	
	Employee (int rank) {
		this.rank = rank;
	}
	
	void recieveCall (Call call) {}
	void callHandeled (Call call) {}
	
	void canNotHandleCall (Call call) {
		call.rank = rank ++;
		free = true;
	}

}
