package com.coderscampus.arraylisttest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

public class CustomArrayListTest {

	public CustomList<Object> sut;

	@BeforeEach
	void setup() {
		sut = new CustomArrayList<>();
	}

	@Test
	void should_add_item_to_array() {
		assertTrue(sut.add(12));
	}

	@Test
	void should_add_item_at_index_given() {

		sut.add("Sam");

		sut.add("Jacob");

		assertTrue(sut.add(1, "John"));

	}

	@Test
	void should_raise_indexoutofbounds_exception() {
		sut.add("Jonathan");
		sut.add("Dean");
		Exception exception = assertThrows(IndexOutOfBoundsException.class, () -> sut.add(3, "Alex"), "Given index is null");
	}
	
	@Test
	void should_get_the_size_of_array() {
		sut.add("Maggie");
		sut.add(0, "John");
		assertEquals(2, sut.getSize());
	}
	
	@Test
	void should_get_the_item_at_given_index() {
		sut.add("John");
		sut.add("Ryan");
		sut.add(1, "Chris");
		
		assertEquals("Chris", sut.get(1));
	}
	
	
	@Test
	void should_remove_item_at_given_index_and_return_the_item() {
		sut.add("John");
		sut.add("Maggie");
		sut.add("Adam");
		assertEquals("Adam", sut.remove(2));
	}
	
	@Test
	void should_decrement_currentSize_when_removed_item() {
		sut.add("John");
		sut.add("Maggie");
		sut.add("Adam");
		sut.remove(0);
		assertEquals(2,  sut.getSize());
	}
	
	@Test
	void should_add_multiple_items_at_once () {
		sut.add(0, "Sam");
		sut.add(1, "Danny");
		sut.add(2, "Astrid");
		
		assertEquals(3, sut.getSize());
	}
	
	
	@Test
	void should_throw_out_of_bounds() {
		
		Exception exception = assertThrows(IndexOutOfBoundsException.class	, () -> sut.get(1), "Throw ArrayIndexOutOfBoundsException");
	}
 	
	
	
	
	
	
	
	
	
	

}
