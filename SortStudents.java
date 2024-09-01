package test;

import java.util.*;

public class SortStudents {
	public static void main(String args[]) {
// creating object of ArrayList class  
		ArrayList<String> list = new ArrayList<String>();
// adding elements to the ArrayList   
		list.add("Jaya");
		list.add("Vishnu");
		list.add("Meenakshi");
		list.add("Srihari");
		list.add("Vasudev");
		list.add("Punitha");
		list.add("Beena");
		list.add("Ramesh");
// printing the unsorted ArrayList   
		System.out.println("Before Sorting: " + list);
// Sorting ArrayList in ascending Order   
		Collections.sort(list);
// printing the sorted ArrayList   
		System.out.println("After Sorting: " + list);
	}
}