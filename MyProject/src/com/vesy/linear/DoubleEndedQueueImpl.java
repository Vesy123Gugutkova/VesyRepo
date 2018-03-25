package com.vesy.linear;

import java.util.ArrayList;
import java.util.List;

public class DoubleEndedQueueImpl {
	
	private List<Integer> deque = new ArrayList<Integer>();
	
	public void insertFront(int item){
        //add element at the beginning of the queue
        System.out.println("adding at front: "+item);
        deque.add(0,item);
        System.out.println(deque);
    }

}
