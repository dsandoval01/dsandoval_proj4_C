import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class CalcTester{
	public static void main (String [] args){
	
	InfixCalculator CalcTester = new InfixCalculator();
	System.out.println("Welcome to HP-35 Calculator");
	boolean running=true;
	
	while (running) {
		System.out.println("Enter Your Postfix Arithmetic Expression Down Below or Enter quit to Exit");
		Scanner scanner = new Scanner(System.in);
		String aStr = scanner.nextLine();

		ArithmeticApp ap = new ArithmeticApp();
		//System.out.println(ap.buildExpression(aStr));




		StringTokenizer st = new StringTokenizer(aStr);
		Stack<String> stack = new Stack<String>();

		
			System.out.println("The program has ended");
			running = false;if (aStr.compareTo("quit")==0) {
			break;
		}

		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			stack.push(str);

			if (CalcTester.isOperator(str)!= 0) {
				int operator = CalcTester.isOperator(stack.pop());
				Double op2 = Double.parseDouble(stack.pop());

				if (stack.empty() == true){
					System.out.println("Error");
					running = false;
		
				}

				Double op1 = Double.parseDouble(stack.pop());
				double ans = CalcTester.Calculation(op1, op2, operator);
				stack.push(Double.toString(ans));
			}

		
		}
		String finAns = stack.pop();


		if (stack.empty() == false){
			System.out.println("Error");
			running = false;
			break;
		}

		TNode r = ap.buildExpression(aStr);
		//System.out.println(r);
		ap.inOrder(r);
	}
}
}
