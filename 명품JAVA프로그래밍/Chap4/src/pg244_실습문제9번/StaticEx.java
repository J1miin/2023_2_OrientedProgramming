package pg244_실습문제9번;

public class StaticEx {

	public static void main(String[] args) {
		int array1[]= {1,2,3,4};
		int array2[]= {5,6,7,8};
		int addArray[]=ArrayUtil.connect(array1, array2);
		//ArrayUtil.printArr(addArray);
		for(int i=0;i<addArray.length;++i) {
			System.out.print(addArray[i]+" ");
		}

	}

}
