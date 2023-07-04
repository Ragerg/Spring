package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;

public class Program {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
//		Exam exam = (Exam)context.getBean("exam");
		Exam exam = context.getBean("exam", Exam.class);
		
		System.out.printf("total : %d\n", exam.total());
		System.out.printf("average : %.2f\n", exam.avg());
		
		
	}

}
