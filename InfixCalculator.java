import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;


public class InfixCalculator{
    public int isOperator(String str){
        if (str.compareTo("+")==0)
			return 1;
		if (str.compareTo("-")==0)
			return 2;
		if (str.compareTo("*")==0)
			return 3;
		if (str.compareTo("/")==0)
			return 4;
		return 0;
	}

	public double Calculation(double x, double y, int calc){
		if (calc == 1){
			return x + y;}
		if (calc == 2){
			return x - y;}
		if (calc == 3){
			return x * y;}
		if (calc == 4){
			double ans1 = (double)x / y;
			return ans1;}
		return 0;
}
}