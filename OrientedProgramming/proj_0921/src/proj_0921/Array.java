package proj_0921;

import java.util.Scanner;

public class Array {
	public static void printArr(int iArr[]) {
		for (int j=0;j<iArr.length;++j) {
			System.out.print(iArr[j]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//상수선언
		final int SIZE = 5;
		Scanner scanner = new Scanner(System.in);
		int inputArray[] = new int[SIZE];
		//int inputArray[]= {5,7,2,8,3};
		int i,inputNum, cnt, max, idx, tmp;
	
		cnt =0;
		//while부터 쓰면 안된다.
		/*
		 * for(int i=0;i<5;++i){
			 * 	while (true) {
					System.out.print("5개의 양의 정수를 입력해주세요 :");
					inputNum=scanner.nextInt();
					if(inputNum<=0) {
						System.out.println("양수가 아닙니다.");
						continue;
					}else {
						inputArray[i]=inputNum;
						break;
					}
				}
		 * }
		 * 
		
		 * */
		
		while (true) {
			if (cnt==SIZE) {
				break;
			}
			System.out.print("5개의 양의 정수를 입력해주세요 :");
			inputNum=scanner.nextInt();
			if(inputNum<=0) {
				System.out.println("양수가 아닙니다.");
				continue;
			}else {
				inputArray[cnt]=inputNum;
				cnt=cnt+1;
			}
		}
		//정수에서 최대값구하라고 하면 내 배열 중의첫번재 값을 초기화해주면 됨.
		//57283
		//자리 위치를 저장
		printArr(inputArray);

		for(int q=0;q<inputArray.length;++q) {
			max = inputArray[q];
			//idx=q;
			for (int k=q+1;k<inputArray.length;++k) {
				if (max<inputArray[k]) {
					max=inputArray[k];					
					idx = k;
					
					tmp=inputArray[q];
					inputArray[q]=inputArray[idx];
					inputArray[idx]=tmp;
				}
				
			}
			
		}
		printArr(inputArray);
		
		scanner.close();
	}

}
