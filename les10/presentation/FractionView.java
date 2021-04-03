package by.http.les10.presentation;

import by.http.les10.enthy.Fraction;


public class FractionView {
	public void printSum(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " + " + f2.getNumerator() + "/"
				+ f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
	}
		
	public void printSubstr(Fraction f1, Fraction f2, Fraction f3) {
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " - " + f2.getNumerator() + "/"
				+ f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
	}
	public void printDegree(Fraction f1,Fraction f2, Fraction f3) {
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " : " + f2.getNumerator() + "/"
				+ f2.getDenominator() + " = " + f3.getNumerator() + "/" + f3.getDenominator());
	}
	public void printMulti(Fraction f1,Fraction f2, Fraction f3) {
		System.out.println(f1.getNumerator() + "/" + f1.getDenominator() + " * " + f2.getNumerator() + "/" + f2.getDenominator() + " = "
				+ f3.getNumerator() + "/" + f3.getDenominator());
	}
}
