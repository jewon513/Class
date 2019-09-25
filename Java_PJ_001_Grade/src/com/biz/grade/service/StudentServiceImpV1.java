package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.model.StudentVO;

public class StudentServiceImpV1 implements StudentService {

	private Scanner scan;
	private List<StudentVO> studentList;
	
	public StudentServiceImpV1() {
		studentList = new ArrayList<StudentVO>();
		scan = new Scanner(System.in);
	}
	
	@Override
	public void input(int count) {
		for (int i = 0 ; i<count ; i++) {
			
			System.out.print("이름을 입력하세요 >>");
			String strName = scan.nextLine();
			
			System.out.print("주소을 입력하세요 >>");
			String strAddr = scan.nextLine();
			
			System.out.print("전화번호를 입력하세요 >>");
			String strTel = scan.nextLine();
			
			System.out.print("학과를 입력하세요 >>");
			String strDept = scan.nextLine();

			System.out.print("학년을 입력하세요 >>");
			String strGrade =scan.nextLine();
			int intGrade=Integer.valueOf(strGrade);
			
			StudentVO vo = new StudentVO();
			
			vo.setStrNum(String.format("%04d", i+1));
			vo.setStrName(strName);
			vo.setIntGrade(intGrade);
			vo.setStrTel(strTel);
			vo.setStrAddr(strAddr);
			vo.setStrDept(strDept);
			
			
			studentList.add(vo);
			
		}
			
	}

	@Override
	public void list() {
		
		System.out.println("===========================================");
		System.out.println("학생명부");
		System.out.println("===========================================");
		System.out.println("학번\t이름\t학년\t전화번호\t주소");
		System.out.println("===========================================");
		
		for (StudentVO vo : studentList) {
			System.out.printf("%s\t%s\t%d\t%s\t%s\n",
					vo.getStrNum(),
					vo.getStrName(),
					vo.getIntGrade(),
					vo.getStrTel(),
					vo.getStrAddr())
					;
		}
		
		System.out.println("===========================================");
	}
	
	public List<StudentVO> getList() {
		return studentList;
	}


}
