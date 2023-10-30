package proj_0925;
//5번만들기
//sort수정
//생각과정따라가기  

public class Lotto_pf {
	
	public static void printArr(int iLottoArr[]) {
		for(int j=0;j<iLottoArr.length;++j) {
			System.out.print(iLottoArr[j]+" ");
		}
		System.out.println();
	}
	
	public static void alignArr(int iLottoArr[]) {
		int min=iLottoArr[0];
		int idx=0;
		int k, tmp;

		for(int q=0;q<iLottoArr.length;++q) {
			min = iLottoArr[q];
			for (k=q+1;k<iLottoArr.length;++k) {
				if (min>iLottoArr[k]) {
					min=iLottoArr[k];					
					idx = k;

					tmp=iLottoArr[q];
					iLottoArr[q]=iLottoArr[idx];
					iLottoArr[idx]=tmp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		for (int m=0;m<5;++m) { //5번 출력 할 때
			int iOneNo, iCnt,i;
			int[] iLottoArr;
			iLottoArr = new int[6];
			iCnt=0; //현재까지 추출된 번호의 수 //3개 이미뽑아놨다고가정
			
			//랜덤추출 시작
			while(true) {
				iOneNo=(int)(Math.random()*45)+1;
				if(iCnt==6) {
					break;
				}
				for(i=0;i<iCnt;++i) {
					if(iLottoArr[i]==iOneNo) {
						//System.out.println("중복 ");
						break;
					}
				}//중복체크 
				
				if (i==iCnt) {
					iLottoArr[iCnt]=iOneNo;
					iCnt++;
				}else {
					//다 안돌고 나온 경우 
					iOneNo=(int)(Math.random()*45)+1;
				}
			}//랜덤 추출 끝
			
			//출력 
			//printArr(iLottoArr);
			
			//정렬
			alignArr(iLottoArr);
			
			//정렬 출력  
			printArr(iLottoArr);
			
		}
		
	}

}
