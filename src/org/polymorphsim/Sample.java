package org.polymorphsim;

public class Sample {

	// Arguments depends on dataType count or number
	private void empInfo(String name, int age, char gender, float salary) {
		System.out.println("Employee info: " + name +'\t'+ age +'\n'+ gender +'\t'+ salary);
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.empInfo("ram", 26, 'n', 23425.1231f);

	}

}
