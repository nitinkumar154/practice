package com.javat;

public class Dog extends Animal {
	String color= "black";
	
	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a.color);
	}
}
