package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.DisplayExam;

public class Program_note {

	public static void main(String[] args) {

		// spring container 만들기
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		DisplayExam displayExam = context.getBean(DisplayExam.class);

		// setting.xml에 다 옮겨적었음
//		Exam exam = new AiswExam(10, 10, 10);

//		DisplayExam displayExam = new InlineDisplayExam();
//		DisplayExam displayExam = new GridDisplayExam();
//		displayExam.setExam(exam);
		
		displayExam.display();

	}

}
