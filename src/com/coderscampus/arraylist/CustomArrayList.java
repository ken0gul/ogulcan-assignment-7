package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	Object[] myArrayList = new Object[items.length];
	int counter = 0;
	@Override
	public boolean add(T item) {
		// TODO Auto-generated method stub
		counter++;
		if(counter == items.length) {
			int newSize = (items.length) *2;
			items = Arrays.copyOf(items, newSize);
		}
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				items[i] = item;
				break;
			}
			
		}
		
		for(Object x : items) {
			if(x != null) {
			myArrayList = Arrays.copyOf(items, counter);
			
			}
		}
		return true;
	}

	@Override
	public int getSize() {
		return myArrayList.length;
	}

	@Override
	public T get(int index) {
		for (int i = 0; i < myArrayList.length;) {
			return (T) myArrayList[index];
		}
		return null;
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(myArrayList) + ", getSize()=" + getSize() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

}
