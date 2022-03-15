package com;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> listOfNum = new ArrayList<>();
listOfNum.add(1);listOfNum.add(2);listOfNum.add(3);listOfNum.add(4);listOfNum.add(5);
listOfNum.add(6);listOfNum.add(7);listOfNum.add(8);listOfNum.add(9);listOfNum.add(10);

	//listOfNum.stream().forEach(v->System.out.print(" "+v));
//listOfNum.stream().filter(v->v%2==0).forEach(v->System.out.println(" "+v));
//listOfNum.stream().map(v->v+100).forEach(v->System.out.println(v));
//boolean res1 = listOfNum.stream().allMatch(v->v>5);
//System.out.println(res1);
//boolean res1 = listOfNum.stream().anyMatch(v->v>5);
//System.out.println(res1);

	}

}
