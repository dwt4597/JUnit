package com.biz.jtest;
/*
 * 빌드패스 -> configure Build Path -> add library -> jnit 추가
 */
public class Hello {

	/*
	 * hello 메서드는 외부에서 누군가 호출했을 때
	 * Hello라는 문자열을 리턴 해줄 것이다 라는 보장을 하는
	 * method..
	 * 
	 * 만약 외부에서 호출을 했는데
	 * hello를 리턴하거나 Hello를 리턴하면
	 * 이 method는 잘못 작성된 것이다.
	 */
	public String hello() {
	
		
		
		return "Hello";
	
	}
	
	public int calc(int num1, int num2) {
		
		return num1+num2;
	}
}
