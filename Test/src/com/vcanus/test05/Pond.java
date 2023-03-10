package com.vcanus.test05;

public class Pond {

	public static void main(String[] args) {
		
		int[][] pond = {  	 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
							 { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
							 { 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 },
							 { 0, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
							 { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
							 { 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
							 { 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
							 { 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 },
							 { 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
							 { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
		};
		
		calculateDepth(pond);
		
	}
	
	public static void calculateDepth(int[][] pond) {
		//깊이  변경을 했는지 여부
		boolean isPondChange = false;
		
		//깊이 변경 조건 검사
		for(int i=1; i<pond.length-1; i++) {
			for(int j=1; j<pond[0].length-1; j++) {
				if(pond[i][j] > 0 && pond[i-1][j] >= pond[i][j] && pond[i+1][j] >= pond[i][j]
								&& pond[i][j-1] >= pond[i][j] && pond[i][j+1] >= pond[i][j]) {
					pond[i][j]++;
					isPondChange = true;
				}
			}
		}
		
		//연못 변경 여부 확인 후 출력
		if(!isPondChange) {
			for(int i=0; i<pond.length; i++) {
				for(int j=0; j<pond[0].length; j++) {
					System.out.print(pond[i][j]+" ");
				}
				System.out.println();
			}
		}else { 
			// 변경을 했다면 다시 검사해야하니 함수 호출
			calculateDepth(pond);
		}
	}

}
