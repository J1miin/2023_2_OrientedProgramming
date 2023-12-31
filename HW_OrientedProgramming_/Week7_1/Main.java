package studentInfo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int iTotalStudentNum;
		int iStudentCnt; //학생숫자를 카운트하는 변수
		
		Student studentArray[]; //학생정보를 담을 객체 배열 선언
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 학생 수를 입력하세요: ");
		iTotalStudentNum=scanner.nextInt();
		
		studentArray=new Student[iTotalStudentNum];//입력받은 학생 숫자만큼의 객체배열 생
		//main 클래스에도 기본 생성자가 있어야 하는지 >> NO 
		
		for (int i=0;i<iTotalStudentNum;++i) {
			studentArray[i]=new Student(); //객체 배열 안의 객체 생성해주는게 진짜 진짜 중요하다!!
			iStudentCnt=i+1;
			
			System.out.print("학생 "+iStudentCnt+"의 이름을 입력하시오. : ");
			studentArray[i].getName(scanner.next()); //이름을 전달합니다. 
			
			System.out.print("학생 "+iStudentCnt+"의 학번을 입력하시오. : ");
			studentArray[i].getID(scanner.nextInt()); //학번을 전달합니다.
			
			System.out.print("학생 "+iStudentCnt+"의 학점을 입력하시오. : ");
			studentArray[i].getScore(scanner.nextDouble()); //학점을 전달합니다.
		}

		//출력
		for (int j=0;j<iTotalStudentNum;++j) {
			iStudentCnt=j+1;
			studentArray[j].printInfo(iStudentCnt);
		}
			
		scanner.close();
	}

}
