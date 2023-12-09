package ex7_8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//컬렉션 클래스의 static method 연습하기 
public class CollectionsEx {

	static void printList(LinkedList<String> linkedList) {
		Iterator <String> it = linkedList.iterator();
		while(it.hasNext()) {
			String e = it.next();
			String separator;
			if(it.hasNext()) {
				separator="->";
			}else {
				separator="\n";
			}
			System.out.print(e+separator);
		}
	}
	
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("transformer");
		myList.add("avartar");
		myList.add("matrix");
		myList.add(0,"jimin");
		myList.add(1,"studying");
		
		printList(myList);
		
		Collections.sort(myList);
		printList(myList);
		int index = Collections.binarySearch(myList,"jimin")+1;
		System.out.println("jimin is in the index of "+index);
		
		Collections.reverse(myList);
		printList(myList);
		
		index = Collections.binarySearch(myList,"studying")+1;
		System.out.println("jimin is in the index of "+index);
	}

}
