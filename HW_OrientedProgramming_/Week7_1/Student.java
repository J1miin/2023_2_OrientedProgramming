package studentInfo;

class Student {
	private String sName;
	private int iStudentId;
	private double dGrade;
	
	public Student() {
	}
	
	//퍼블릭 메서드를 통해 Student클래스의 private 멤버변수에 접근합니다.
	public void getName (String sName){ //이름을 얻는 메서드 
		this.sName = sName;
	}
	public void getID (int iStudentId){ //학번을 얻는 메서드 
		this.iStudentId=iStudentId;
	}
	public void getScore (double dGrade){ //학점을 얻는 메서드 
		this.dGrade=dGrade;
	}
	public void printInfo(int studentIdx) { //학생 정보를 출력하는 메서드
		System.out.println("학생 " +studentIdx);
		System.out.println("이름 : " + this.sName);
		System.out.println("학번 : " + this.iStudentId);
		System.out.println("학점 : " + this.dGrade);
		System.out.println("-------------------------");
	}
	
}
                