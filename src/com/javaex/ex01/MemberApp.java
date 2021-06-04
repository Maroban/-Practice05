package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member("jws", "정우성", 50000);
		Member yjs = new Member("yjs", "유재석", 30000);
		Member lhr = new Member("lhr", "이효리", 40000);
		
		jws.showInfo();
		yjs.showInfo();
		lhr.showInfo();
		
		
	}

}
