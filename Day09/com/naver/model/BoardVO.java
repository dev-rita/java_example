package com.naver.model;//package 예약어로 영문소문자로 도메인명 역순으로 com폴더 하위에 naver폴더 하위에 model폴더가 생성됨.

public class BoardVO {//메인 메소드 안만듦. 데이터 저장빈 클래스.
	
	private String writer;//글쓴이
	private String title;//제목
	private String cont;//내용
	
	//기본생성자 묵시적으로 제공
	
	public String getWriter() {
		return writer;
	}//값 반환 메소드>>getter()메소드라고 통칭.
	public void setWriter(String writer) {
		this.writer = writer;
	}//값 저장 메소드>>setter()메소드라고 통칭.
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	
	public void print() {//public이 없으면 접근 x?
		System.out.println(writer+title+cont);
	}
	
}
