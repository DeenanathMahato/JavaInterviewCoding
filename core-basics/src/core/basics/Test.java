package core.basics;

public class Test {

	public static void main(String[] args) {
		System.out.println(~4);
		
		int a,b,c,d;
		a=b=c=d=20;
		a+=b-=c*=d/=2;
		System.out.println(a + "--" + b + "--" + c + "--" + d);//-160, -180 200, 10
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.SIZE);
		
		byte bit = 127;
		bit += 3; //type casting takes care by compiler internally
		System.out.println(bit);
		
		byte num = 127;
		//num = num + 3; it will give compile time error like possible loss of precision
		num = (byte) (num + 3);
		System.out.println(num);
		
	}
}
