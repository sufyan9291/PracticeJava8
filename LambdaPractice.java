package com.mypack;

import java.util.function.Predicate;

public class LambdaPractice {
	public static void main(String[] args) {
		Predicate<Integer> p = (n) -> true;
		System.out.println(p.test(5));
	}
}
