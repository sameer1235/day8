package day8;

final class sample{
	final void sum(){
		int a=10,b=2,c;
		c=a+b;
		System.out.println("sum of a and b : "+c);
	}
}
class s{
	final void s1(){
		System.out.println("This is a final method");

	}
	void s2(){
		System.out.println("This is not a final method");

	}
}

public class Finalkeywrd extends s {
	final int a=20;
	final void s3(){
		// a=10;
		System.out.println("The A contains the value :"+a);

	}
	
	@Override
	void s2(){
		System.out.println("This is not a final method overrides in child class");
	}
	// void s1(){}
	public static void main(String[] args) {
		Finalkeywrd obj = new Finalkeywrd();
		s s1=new s();
		obj.s3();
		obj.s1();
		obj.s2();
		s1.s2();

	}

}
