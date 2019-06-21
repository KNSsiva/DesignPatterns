package com.adapt;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen p=new PenAdapter();
		
		AssignmentWork aw=new AssignmentWork();
		aw.setP(p);
		aw.writeAssignment("not going to write Assignments");
		
	}

}
