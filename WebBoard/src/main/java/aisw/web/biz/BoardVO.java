package aisw.web.biz;

import java.util.Date;

import org.springframework.stereotype.Service;

public class BoardVO {

	private int b_no;
	private String title;
	private String user_id;
	private String content;
	private Date reg_date;
	private int hit;
	private String image;
	private int seq;
	private String writer;
	private Date regDate;
	
	public BoardVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BoardVO(int b_no, String title, String user_id, String content, Date reg_date, int hit, String image) {
		super();
		this.b_no = b_no;
		this.title = title;
		this.user_id = user_id;
		this.content = content;
		this.reg_date = reg_date;
		this.hit = hit;
		this.image = image;
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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
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

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "BoardVO [b_no=" + b_no + ", title=" + title + ", user_id=" + user_id + ", content=" + content
				+ ", reg_date=" + reg_date + ", hit=" + hit + ", image=" + image + "]";
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
