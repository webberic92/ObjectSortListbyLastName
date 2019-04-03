package studentObjSortbyLASTNAME;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pojos.Students;

public class Start {

	public static void main(String[] args) {
	
		//create a new List
		List<Students> studentList = new ArrayList<>();
		 
		//add studentList objects to the list
		studentList.add( new Students("A", "Eric", "A", 1) );
		studentList.add( new Students("B", "Eric", "B",2) );
		studentList.add( new Students("C", "Eric", "C",3) );
		studentList.add( new Students("Z", "Last", "F",4) );

		//Before sorting
		System.out.println("Before Sorting:");
	    	studentList.forEach(System.out ::println);
        System.out.println("");
        
        //Reverses order
		System.out.println("After Sorting:");
        	Collections.sort(studentList, Collections.reverseOrder());
	    studentList.forEach(System.out ::println);
}}
		   
