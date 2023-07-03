package org.polymorphsim;

public class GreensBank extends AxisBank {

	@Override
	public void currentAcc() {
		System.out.println("10%");
	}
	
	@Override
	public void savingsAcc() {
		System.out.println("12%");
	}
	
	public void jointAcc(int no) {
		System.out.println(no);
	}
	
	public static void main(String[] args) {
		GreensBank g = new GreensBank();
		g.currentAcc();
		g.savingsAcc();
		g.jointAcc(23);
	}
}
