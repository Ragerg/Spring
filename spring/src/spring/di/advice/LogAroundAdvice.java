package spring.di.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		// 부가업무(시간측정)
		long start = System.currentTimeMillis();

		// 주업무 부르기
		Object result = invocation.proceed();
		
		// 부가업무(시간측정)
		long end = System.currentTimeMillis();

		String message = (end - start) + "ms 걸렸습니다.";
		System.out.println(message);	
		
		return result;
	}
	
	

}
