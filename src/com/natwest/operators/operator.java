package com.natwest.operators;

public class operator {

	public static void main(String[] args) {
		System.out.println("Java Calculation's Below");
		System.out.println("Adding Numbers - " + addition(10,1));
		System.out.println("Multiplying Numbers - " + multiply(10,2));
		System.out.println("Subtracting Numbers - " + Subtraction(10,2));
		System.out.println("Dividing Numbers - " + division(100,3));
	}
		// TODO Auto-generated method stub
	
	public static int addition(int number1, int number2) {	
		int ans = number1 + number2; 
		return ans;
		}
	
	public static int multiply(int number1, int number2) {
		int ans = number1 * number2;
		return ans;}
	
	public static int Subtraction(int number1, int number2) {
		int ans = number1 - number2;
		return ans;}
	
	public static double division(double number1, double number2) {
		double ans = number1 / number2;
		return ans; }
	

}
