
import java.util.*;
import java.lang.Math.*;

public class LineComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		double result = lineLength(x1, y1, x2, y2);
		System.out.println("Length of the line: " + result);
	}

	public static double lineLength(int x1, int y1, int x2, int y2) {

		double res = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return res;
	}

}
