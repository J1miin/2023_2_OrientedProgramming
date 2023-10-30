package proj_0925;

public class Lotto {
	
	public static void main(String[] args) {
		double dRandom = Math.random();
		int iRandom = (int)(dRandom*45)+1; //1-45까지 랜덤 숫자뽑기 
		int iCnt =0; 
		int i;
		i=0;
		int[] iLottoArr = {3,5,0,0,0,0}; 
		//3-5-6-7
		
		if(iLottoArr[0]==iRandom) {
			iRandom=(int)(dRandom*45)+1;
		}
		if(iLottoArr[1]==iRandom) {
			iRandom=(int)(dRandom*45)+1;
		}else {	
			iLottoArr[2]=iRandom;
			}
		//3이 있고 5를 뽑을 생각 
		for (int j=0;j<iLottoArr.length;++j) {
			System.out.println(iLottoArr[j]);
		}
	}

}
