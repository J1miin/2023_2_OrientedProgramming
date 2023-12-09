package ex7_1;
import java.util.Vector;
//vector method practice
public class VectorEx {
	private static Vector<Integer> practiceVec;
	private static Vector<Integer> addVec ;
	

	public static void main(String[] args) {
		practiceVec = new Vector<Integer>();
		addVec = new Vector<Integer>();
		
		for (int i=0;i<5;++i) {
			practiceVec.add(i+1);
			addVec.add(i+2);
		}
		
		for (int i=0;i<5;++i) {
			System.out.print(practiceVec.get(i)+" ");
		}
		
		practiceVec.addAll(addVec);
		
		System.out.println("\nafter Add All --");
		for (int i=0;i<practiceVec.size();++i) {
			System.out.print(practiceVec.get(i)+" ");
		}
		
		Object copyArr[] = practiceVec.toArray();
		System.out.println("\nusing return Array through toArray() --");
		for (int i=0;i<copyArr.length;++i) {
			System.out.print(copyArr[i]+" ");
		}
		
		
	}

}
