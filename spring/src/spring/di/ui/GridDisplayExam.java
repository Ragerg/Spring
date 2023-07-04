package spring.di.ui;

import spring.di.entity.Exam;

public class GridDisplayExam implements DisplayExam {

	private Exam exam;

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void display() {
		System.out.println("--------------------------------");
		System.out.printf("total   | %5d \nAverage | %.2f \n", exam.total(), exam.avg());
		System.out.println("--------------------------------");
	}

}