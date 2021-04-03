package by.http.les10.ligic;

import by.http.les10.enthy.Fraction;

public class FractionLogic {
	public Fraction sum(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;

		newNum = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f2.getDenominator();
		newDen = f1.getDenominator() * f2.getDenominator();

		Fraction rezult = new Fraction(newNum, newDen);

		return rezult;
	}
	public Fraction multi(Fraction f1,Fraction f2) {
		return new Fraction(f1.getNumerator() * f2.getNumerator(),f1.getDenominator() * f2.getDenominator());
	}
	public Fraction degree(Fraction f1,Fraction f2) {
		return new Fraction(f1.getNumerator() / f2.getDenominator(),f1.getDenominator() / f2.getNumerator());
	}
	public Fraction substr(Fraction f1,Fraction f2) {
		return new Fraction(f1.getNumerator() * f2.getDenominator() - f1.getDenominator() * f2.getDenominator(),
			f1.getDenominator() * f2.getDenominator());
	}
	public void redouce(Fraction f) {
		int nod;

		if (f.getNumerator() > f.getDenominator()) {
			nod = f.getDenominator();
		} else {
			nod = f.getNumerator();
		}

		int numerator = f.getNumerator();
		int denominator = f.getDenominator();

		while (!((numerator % nod == 0) && (denominator % nod == 0))) {
			nod--;
		}

		f.setNumerator(numerator / nod);
		f.setDenominator(denominator / nod);
	}
}
	


