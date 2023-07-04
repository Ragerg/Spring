package spring.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.hello.ui.HelloWorldEu;
import spring.hello.ui.HelloWorldFr;
import spring.hello.ui.HelloWorldKo;

public class ProgramHello {
	
	public static void main(String[] args) {
		
//		HelloWorldEu helloWorld = new HelloWorldEu();
//		HelloWorldKo helloWorld = new HelloWorldKo();
//		HelloWorldFr helloWorld = new HelloWorldFr();
		
		// spring container 만들기
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/hello/setting.xml");
		HelloWorld helloWorld = context.getBean(HelloWorld.class);
		
		helloWorld.sayHello();
		
	}

}
