package com.biz.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.*;

import com.biz.jtest.*;
/*
 * Junit을 이용한 test
 * 
 * Java에서 작성된 클래스의 여러가지 메서드들을 테스트할 때
 * 매개변수와 리턴값, 오류발생 유뮤, 시간의 과도한 소비 등을
 * 일일이 main 메서드를 만들어 테스트하는 것은 매우 어렵다.
 * 
 * 이때, 
 * 매개변수와 리턴값에 대한 리스트(Test case)를 만들어두고
 * Junit의 Test 클래스를 만들어 테스트를 수행하면
 * 
 * 일일이 각 값들을 눈으로 비교하며 트스트 하는 것보다
 * 쉽고, 정확하게 테스트 할 수 있다.
 * 
 * jnuit은 자바에서 아주 오래전부터
 * 테스트 자동화 도구로 사용되고 있다.
 * 
 * HelloTest2 클래스에 testCalc와 testHello 두개의 테스트 method를 모으고
 * 한번의 junit 실행으로 모두 테스트를 수행한다.
 * 
 * Test용 클래스는
 * 테스트하고자 하는 클래스 이름 + Test라는 접미사를 사용한다.
 * 가급적 package를 분리하는 것도 좋고
 * method의 이름은 테스트하고자 하는 method의 접두사로 test를 사용한다.
 * 
 * Junit 4 미만에서는 method 이름의 접두사를 반드시 test로 해야만 한다.
 * Jnuit 4 이상에서는 선택적으로 test 접두사를 사용한다. (아래 method testCalc, testHello)
 * 	하지만 일반적 패턴(관습적)에 따라 test로 시작한다.
 * 
 * 테스트 메서드에는 @Test Annotation을 부착한다.
 * 
 */
public class HelloTest2 {

	// timeout : test를 수행하는데 1000밀리초가 넘으면
	// 이 테스트는 실패한거다
	@Test(timeout=1000)//expected=RuntimeException.class)
	public void testCalc() {
		Hello hello = new Hello();
		
		int num1 = 10;
		
		assertEquals(10, hello.calc(5, 5));
		
		
		
	}

	@Test
	public void testHello() {
		
		Hello hello = new Hello();
		assertEquals("Hello", hello.hello());
	}
	
	@Test
	public void testHello2() {
		Hello hello = new Hello();
		assertNotNull(hello.hello());
		assertEquals("Hello", hello.hello());
		
	}
	
	/*
	 * setupClass 이름은 패턴적(관습)으로 변경되고
	 * @BeforeClass를 부착한다
	 */
	@BeforeClass
	public static void setupClass() {
		/*
		 * 테스트를 수행하기 전에, 대상 클래스에서
		 * 한번 실행해야 할 일들을 명시하는 method(선택적)
		 */
		
	}
	
	@AfterClass
	public static void tearDownClass() {
		/*
		 * 테스트가 끝난 후 대상 클래스에서 
		 * 한번 실행해야 할 일들을 명시
		 * 데이터베이스와 연동할 때 Connection 닫기 등을 수행
		 */
	}
	
	/*
	 * 각 테스트 [메서드]가 수행되기 [전]에 한번 실행
	 * 
	 * jdbc를 사용하는데 DB로그인 정보등을 설정하는 곳
	 */
	@Before
	public void setUp() {
		
	}
	/*
	 * 각 테스트 [메서드]가 수행된 [후] 한번 실행
	 */
	@After
	public void tearDown() {
		
	}
}
