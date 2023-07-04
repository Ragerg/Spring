package spring.di.ui;

import spring.di.entity.Exam;

public class InlineDisplayExam implements DisplayExam {

	private Exam exam;

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void display() {
		System.out.printf("total : %d  Average : %.2f \n", exam.total(), exam.avg());
	}

}