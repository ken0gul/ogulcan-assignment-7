package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> yourList = new CustomArrayList<>();
		
		yourList.add("John");
		yourList.add("Sam");
		yourList.add("Maggie");
		yourList.add("Tom");
		yourList.add("Tony");
		yourList.add("Margaret");
		yourList.add("John");
		yourList.add("Sam");
		yourList.add("Maggie");
		yourList.add("John");
		yourList.add("Sam");
		yourList.add("Maggie");
		yourList.add("John");
		yourList.add("Sam");
		yourList.add("Maggie");
		yourList.add("John");
		yourList.add("Sam");
		yourList.add("Maggie");
		yourList.add("John");
		yourList.add("Sam");
		yourList.add("Maggie");
		yourList.add("John");
		yourList.add("Sam");
		yourList.add("Maggie");
		System.out.println(yourList);
		System.out.println(yourList.get(5));
		System.out.println(yourList.getSize());

	}

}
