package com.me.maventest.MavenTemp;

public class Add {
	
	private int a; 
	private int b;
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public Add(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Add() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Add [a=" + a + ", b=" + b + "]";
	}
	
	
	
}
