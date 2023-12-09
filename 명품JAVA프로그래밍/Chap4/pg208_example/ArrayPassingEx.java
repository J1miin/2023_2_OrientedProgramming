package pg208_example;

public class ArrayPassingEx {
	static void replaceSpace(char a[]) {
		for(int i=0;i<a.length;++i) {
			if(a[i] == ' ') {
				a[i]=',';
			}
		}
	}
	
	static void printCharArray(char a[]) {
		//출력
		for(int i=0;i<a.length;++i) {
			System.out.print(a[i]);
		}
	}
	
	public static void main(String[] args) {
		char cArray[]= {'t','h','i','s',' ','i','s',' ','a',' ','p','e','n'};//초기화 
		replaceSpace(cArray);
		printCharArray(cArray);

	}

}
