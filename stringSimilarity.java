public int[] stringSimilarity(String[] inputs) {
	int[] result = new int[inputs.length];
	for(int i=0; i<inputs.length; i++){
		int res = 0;
		int count;
		String item = inputs[i];
		int strSize = item.length();
		for(int k=0; k<strSize; k++){
			count = 0;
			for(int s=k; s<strSize; s++){
				if(item.charAt(s-k) == item.charAt(s)){
					count++;
				}
				else break;
			}
			res = res + count;
		}
		result[i] = res;
	}
	return result;
}
