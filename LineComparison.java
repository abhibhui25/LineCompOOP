import java.util.*;
import java.lang.Math.*;

public class LineComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter end points of first line in the format (x1,y1),(x2,y2)");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		double res1 = lineLength(x1, y1, x2, y2);
		System.out.println("Length of the first line: " + res1);

		System.out.println("Enter end points of second line in the format (x1,y1),(x2,y2)");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		double res2 = lineLength(x3, y3, x4, y4);
		System.out.println("Length of the second line: " + res2);
		String p = String.valueOf(res1);
		String q = String.valueOf(res2);

		if (p.equals(q))
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

	public static double lineLength(int x1, int y1, int x2, int y2) {

		double res = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return res;
	}
}