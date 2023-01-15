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
		//����  ������ �ߴ��� ����
		boolean isPondChange = false;
		
		//���� ���� ���� �˻�
		for(int i=1; i<pond.length-1; i++) {
			for(int j=1; j<pond[0].length-1; j++) {
				if(pond[i][j] > 0 && pond[i-1][j] >= pond[i][j] && pond[i+1][j] >= pond[i][j]
								&& pond[i][j-1] >= pond[i][j] && pond[i][j+1] >= pond[i][j]) {
					pond[i][j]++;
					isPondChange = true;
				}
			}
		}
		
		//���� ���� ���� Ȯ�� �� ���
		if(!isPondChange) {
			for(int i=0; i<pond.length; i++) {
				for(int j=0; j<pond[0].length; j++) {
					System.out.print(pond[i][j]+" ");
				}
				System.out.println();
			}
		}else { 
			// ������ �ߴٸ� �ٽ� �˻��ؾ��ϴ� �Լ� ȣ��
			calculateDepth(pond);
		}
	}

}