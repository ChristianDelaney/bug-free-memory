package day4_operator;

public class TypeCasting {

	public static void main(String[] args) {
		
		/*Type casting is when you assign a value of one primitive data type to another type.

In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte*/
		
		int a = 10;
		double b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		long c = 1000000l;
		float g = c;
		
		System.out.println(g);
		
		int valueA = 10;
		byte valueb = (byte)valueA;
		
        System.out.println(valueA);
        System.out.println(valueb);
        
        int valueZ = 300;
        byte valueI = (byte)valueZ;
        
        System.out.println(valueI);
        
        double d = 40000;
        short p = (short)d;
        
        System.out.println(p);
        
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        
        double s = p;
        
        System.out.println(s);
        
        
        
        
        
	}

}
