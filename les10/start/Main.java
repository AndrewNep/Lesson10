package by.http.les10.start;
import by.http.les10.enthy.Fraction;
import by.http.les10.ligic.FractionLogic;
import by.http.les10.presentation.FractionView;
public class Main {
	public static void main(String[] args) {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 4);

		Fraction f3;

		FractionLogic logic = new FractionLogic();

		f3 = logic.sum(f1, f2);
		
		logic.redouce(f3);

		FractionView view = new FractionView();

		view.printSum(f1, f2, f3);
		
		f3 = logic.substr(f1,f2);
		
		logic.substr(f1,f2);
		
		logic.redouce(f3);
		
		view.printSubstr(f1,f2,f3);
		
		f3 = logic.degree(f1, f2);

		view.printDegree(f1, f2, f3);
		
		f3 = logic.multi(f1, f2);
		
		logic.redouce(f3);
		
		view.printMulti(f1,f2,f3);
		

	}
}
