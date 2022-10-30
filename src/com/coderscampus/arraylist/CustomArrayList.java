package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int currentSize = 0;

	@Override
	public boolean add(T item) {

		// TODO Auto-generated method stub
		if (currentSize == items.length) {
			int newSize = (items.length) * 2;
			items = Arrays.copyOf(items, newSize);
		}
		items[currentSize] = item;
		currentSize++;

		for (Object x : items) {

			if (x != null) {
				items = Arrays.copyOf(items, currentSize);

			}
		}
		return true;
	}

	@Override
	public int getSize() {
		return currentSize;
	}

	@Override
	public T get(int index) {
		if(items[index] == null) {
			throw new IndexOutOfBoundsException();
			
			}
			return (T) items[index];
	}

	@Override
	public String toString() {
		return "CustomArrayList [items=" + Arrays.toString(items) + ", getSize()=" + getSize() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if(index > 0 && items[index-1] == null) 
			 {
			throw new IndexOutOfBoundsException();
		}
		//items[index] == null && index != 0 
			
		
			
				
 		// First add the item at the end of the array
		add(item);
		// Then create a temporary array with the original arrays' length.
		Object[] tempArr = new Object[items.length];

		for (int i = 0; i < index; i++) {

			tempArr[i] = items[i];
		}
		tempArr[index] = item;
		for (int i = index + 1; i < items.length; i++)
			tempArr[i] = items[i - 1];

		items = Arrays.copyOf(tempArr, tempArr.length);
			

		return true;
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {

		Object removedItem = null;
		Object[] tempArr = new Object[items.length - 1];
		int tempArrIteration = 0;
		for (int i = 0; i < items.length; i++) {

			if (i == index) {
				removedItem = items[i];
				continue;
			}

			tempArr[tempArrIteration++] = items[i];
		}

		items = Arrays.copyOf(tempArr, tempArr.length);
		currentSize--;
		return (T) removedItem;
	}

}
