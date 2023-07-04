package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.DisplayExam;

public class Program {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		DisplayExam displayExam = context.getBean("displayExam", DisplayExam.class);

		displayExam.display();

	}

}
