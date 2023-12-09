package pg244_실습문제9번;

public class ArrayUtil {
	public static int [] connect(int[] a, int[] b) {
		//a와 b배열 연결한 새로운 배열 리턴 
		int[] newArr;
		int size = a.length+b.length;
		newArr=new int[size]; //새로운 배열 생성 
		int iCnt;//배열의 인덱스 계산하는 변수 
		int bIdx;
		
		iCnt=0;
		bIdx=0;
		
		for(int i=0;i<a.length;++i) {
			newArr[i]=a[i]; //a의 배열 먼저 복사
			iCnt++;
		}
		
		for(int j=iCnt;j<size;++j) {
			newArr[j]=b[bIdx];
			bIdx++;
		}
		return newArr;
	}
	public static void printArr(int[] a) {
		for(int i=0;i<a.length;++i) {
			System.out.print(a[i]+" ");
		}
	}
}
