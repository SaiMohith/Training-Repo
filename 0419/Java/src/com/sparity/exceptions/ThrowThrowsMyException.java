package com.sparity.exceptions;
/* throw keyword is used to explicit throws user defined exceptions
 * */
class Demo{
	void m1() throws MyException {
		int a=12;
		int b=0;
		System.out.println(a+" "+b);
		throw new MyException("123456152");
		}
}
public class ThrowThrowsMyException extends Demo{
void m1() throws MyException  {
	super.m1();
		int a=121;
		int b=10;
		System.out.println(a+" "+b);
		throw new MyException();
		}
public static void main(String[] args) throws MyException   {
	ThrowThrowsMyException t=new ThrowThrowsMyException();
	t.m1();
	}
}
