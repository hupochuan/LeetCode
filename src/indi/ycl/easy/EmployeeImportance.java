package indi.ycl.easy;

import java.util.ArrayList;
import java.util.List;

import indi.ycl.model.Employee;

public class EmployeeImportance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int getImportance(List<Employee> employees, int id) {
		int importance=0;
		for (Employee e : employees) {
			if(e.id==id){
				importance+=e.importance;
				for (int i : e.subordinates) {
					importance+=getImportance(employees,i);
					
				}
			}
		}
		return importance;
		
		
	

	}

}
