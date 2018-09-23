public int hourglassSum(){ // HACKERRANK PROBLEM
	int[][] matrix = {{-1, -1, 0, -9, -2, -2}, 
						{-2, -1, -6, -8, -2, -5},
						{-1, -1, -1, -2, -3, -4},
						{-1, -9, -2, -4, -4, -5},
						{-7, -3, -3, -2, -9, -9},
						{-1, -3, -1, -2, -4, -5}};  // Expected output: -6
	
	int counter = 0; // to keep track of the size of the sub matrices
	int counter1 = 0;
	int m = 0;
	int n = 0;
	int highest = Integer.MIN_VALUE;
	int sum = 0;
	for(int i = 0; i < 4; i++){     //shifting position by 1 for 4 times
		for(int k = 0; k < 4; k++){
			
			for(m = i; m < 6 && counter1<3; m++){ //row indexes: 0-2; 1-3; 2-4; 3-5
				counter = 0;
				for(n = k; n < 6 && counter<3; n++){ //col indexes: 0-2; 1-3; 2-4; 3-5
					if(!(counter1==1 && counter==0 || counter1==1 && counter==2)){
						sum = sum + matrix[m][n];
						System.out.print(matrix[m][n] + " ");
					}
					counter++;
				}
				counter1++;
			}
			System.out.println();
			System.out.println("sum = " + sum);
			if(sum > highest)   highest = sum;
			sum = 0;
			m = i; //shift the starting positions of the sub matrix
			n = k; //shift the starting positions of the sub matrix
			counter1 = 0;
		}
	}
	return highest;
}
