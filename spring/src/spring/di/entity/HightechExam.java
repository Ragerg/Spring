package spring.di.entity;

public class HightechExam implements Exam {

	private int kor;
	private int eng;
	private int math;
	private int com;

	@Override
	public int total() {
		// TODO Auto-generated method stub
		int result = kor + eng + math + com;
		return result;
	}

	@Override
	public float avg() {
		// TODO Auto-generated method stub
		float result = (float) (total() / 4);
		return result;
	}

	public HightechExam() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HightechExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	@Override
	public String toString() {
		return "HightechExam [kor=" + kor + ", eng=" + eng + ", math=" + math + ", com=" + com + "]";
	}


	

}