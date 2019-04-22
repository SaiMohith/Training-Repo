package com.sparity.exceptions;

//one try block and multiple catch blocks 
public class TryWithMultipleCatches {
	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 10;
			int c = a / b;
			System.out.println(c);
			int[] arr = { 1, 2, 3, 4, 5 };
			arr[2] = 12;
			for(int a1:arr){
				System.out.println(a1);
			}
			String s = "asdf";
			System.out.println(s.length());
			@SuppressWarnings("unused")
			int i=Integer.parseInt(s);
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.out.println("Check Array Size " + ai);
		} catch (ArithmeticException ae) {
			System.out.println("Change b value " + ae);
		} catch (NullPointerException np) {
			System.out.println("String is Empty " + np);
		} catch (NumberFormatException nfe) { 
			System.out.println("Given data is Number format");
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("finlly block");
		}
	}

}
