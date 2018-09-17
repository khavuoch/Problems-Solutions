// CODEFIGHT.COM PROBLEM
public int firstDuplicate(int[] a){ 
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	for(int i = 0; i < a.length; i++){
		// check if item already existed
		if(map.containsKey(a[i])){ // if yes, then it's duplicate
			return a[i];
		}else{
			map.put(a[i], -1);  // else, put it in the map
		}
	}
	return -1;
}