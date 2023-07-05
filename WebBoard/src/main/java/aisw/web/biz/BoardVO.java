package aisw.web.biz;

import java.util.Date;

public class BoardVO {

	private int b_no;
	private String title;
	private String writer;
	private String content;
	private Date reg_date;

	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int b_no, String title, String writer, String content, Date reg_date) {
		super();
		this.b_no = b_no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.reg_date = reg_date;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getReg_date() {
		return reg_date;
	}

	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}

	@Override
	public String toString() {
		return "BoardVO [b_no=" + b_no + ", title=" + title + ", writer=" + writer + ", content=" + content
				+ ", reg_date=" + reg_date + "]";
	}

}
