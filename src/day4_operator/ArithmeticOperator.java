package day4_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
	// +, -, *, /, %, ++, --	
		
		
int a = 10;
int b = 20;

System.out.println(a + b);

System.out.println(b-a);

System.out.println(a * b);

System.out.println(b / a);

double result = (double) a / b ;

System.out.println(result);


double valueA = a;

double valueB = b;

double result2 = valueA / valueB;

System.out.println(result2);


// ++ increment 

int valueC = 1;
System.out.println(valueC);

valueC = valueC +1;
valueC = valueC +1;
System.out.println(valueC);

valueC++;

System.out.println(valueC);
valueC++;
valueC++;
valueC++;
valueC++;
System.out.println(valueC); // 8


// -- decrement

valueC--;
valueC--;
System.out.println(valueC);
valueC--;
valueC--;
valueC--;
valueC--;
valueC--;
valueC--;
System.out.println(valueC);


// % modulus operator
int A = 10;
int B = 3;

System.out.println(A/B);

System.out.println(A%B);

System.out.println(10%4);


System.out.println(10%5);


















	}

}
