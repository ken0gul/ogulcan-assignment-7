package com.coderscampus.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> yourList = new CustomArrayList<>();

		yourList.add("Sam");
		yourList.add("Maggie");
		yourList.add(0, "Kebo");
		yourList.remove(0);
		System.out.println(yourList);
		System.out.println(yourList.get(0));
		System.out.println(yourList.getSize());

	}

}
