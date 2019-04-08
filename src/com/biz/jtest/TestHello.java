package com.biz.jtest;

public class TestHello {
	public static void main(String[] args) {
		
		// Hello 클래스를 테스트하기 위해서
		// Hello 클래스를 hello 객체로 생성하고
		Hello hello = new Hello();

		// hello 객체의 hello() 메서드를 호출한 후
		// return 값을 str 문자열 변수에 받고
		String str = hello.hello();
		
		// str 문자열 변수의 내용을 콘솔에 표시해서
		// 정상적인가를 테스트
		System.out.println(str);
		
		int ret = hello.calc(10, 20);
		System.out.printf(" %d + %d = %d", 10,20,ret);
	}
}
