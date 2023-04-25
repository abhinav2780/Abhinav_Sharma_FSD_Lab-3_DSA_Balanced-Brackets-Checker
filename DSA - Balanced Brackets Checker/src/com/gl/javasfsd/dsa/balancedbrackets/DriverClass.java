package com.gl.javasfsd.dsa.balancedbrackets;

public class DriverClass {

	public static void main(String[] args) {

		String expression = "([[{}]])";
		BalancedBracketsChecker checker = new BalancedBracketsChecker(expression);

		// Program checked for both Sample inputs
		// ([[{}]]) and ([[{}]]))

		boolean result = checker.check();
		if (result) {
			System.out.printf("The entered string %s has Balanced Brackets", expression);
		} else {
			System.out.printf("The entered string %s do not contain Balanced Brackets", expression);
		}

	}

}
