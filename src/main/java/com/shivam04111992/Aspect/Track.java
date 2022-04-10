package com.shivam04111992.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Track {
	@Pointcut("execution(* Operation.m*(..))")
	public void j() {
	}

	@Before("j()")
	public void myadvice(JoinPoint jp) {
		System.out.println("additional concern");
	}
}
