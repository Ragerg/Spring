package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {

		// 모듈을 사용했다
		System.out.println("[" +  method.getName() +"] 앞에서 실행하는 advice입니다~~~^^");
		
	}

}
