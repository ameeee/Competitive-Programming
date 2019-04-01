import java.util.Scanner;
import java.util.Stack;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < input; i++) {
			String p = "";
			String m = "";

			while (true) {
				m = scan.nextLine();
				if (m.equals("")) {
					break;
				} else {
					p = p + m;
				}

			}
			System.out.println(postfix(p));

		}
	}

	static boolean isoperator(char s) {
		if (s == '*' || s == '/' || s == '+' || s == '-') {
			return true;
		}
		return false;
	}

	public static String postfix(String n) {
		String po = "";
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < n.length(); i++) {
			char x = n.charAt(i);

			if (!isoperator(x) && x != '(' && x != ')') {
				po = po + x;
			}

			else if (x == '(') {
				s.push(x);

			}

			else if (x == ')') {

				while (!s.isEmpty()) {
					char m = s.pop();
					if (m != '(') {

						po = po + m;
					}
				}
			}

			else if (isoperator(x)) {
				if (!s.isEmpty() && greaterpriority(s.peek(), x)
						&& s.peek() != '(') {
					po = po + s.pop();

				}
				s.push(x);

			}

		}
		while (!s.isEmpty()) {
			char m = s.pop();
			if (m != '(') {
				po = po + m;
			}

		}
		return po;
	}

	static boolean greaterpriority(char s, char x) {
		if (x == '*' || x == '/') {
			return false;
		}
		return true;
	}
}
