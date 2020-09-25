package aop002;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.JoinPoint;

@Aspect
public class MyAspect {
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 화인: 문을 개방하라");
	}
	
	@After("execution(* runSomething())")
	public void after(JoinPoint joinPoint) {
		System.out.println("발 닦고 잔다.");
	}
}
