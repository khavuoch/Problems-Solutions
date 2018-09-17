/**
 * Hackerrank -- Encircular
 * @param commands - array contains strings which each of the string represent
 * a commands for a robot. Ex: {"G", "L", "R", "LGLG", "GLG", ...}
 * @return an array containing the strings "YES" or "NO", telling if a command
 * on the same index position performed a CIRCLE or NOT.
 */
public String[] doesCircleExists(String[] commands) {
	String[] result = new String[commands.length];
	for(int i = 0; i < commands.length; i++){
		if(commands[i].length() == 1){
			if(commands[i].charAt(0) == 'G')
				result[i] = "NO";
			else    result[i] = "YES";                
		}
		else{
			int x = 0, y = 0;
			String dir = "n";
			
			for(int k = 0; k < commands[i].length(); k++){
				char cmd = commands[i].charAt(k);
				if(dir == "n"){
					if(cmd == 'G')    
						y++;
					else if(cmd == 'L')
						dir = "w";
					else    dir = "e";
				}
				else if(dir == "e"){
					if(cmd == 'G')
						x++;
					else if(cmd == 'L')
						dir = "n";
					else    dir = "s";
				}
				else if(dir == "s"){
					if(cmd == 'G')
						y--;
					else if(cmd == 'L')
						dir = "e";
					else    dir = "w";
				}
				else if(dir == "w"){
					if(cmd == 'G')
						x--;
					else if(cmd == 'L')
						dir = "s";
					else    dir = "n";
				}
			}
			if(x == 0 && y == 0)
				result[i] = "YES";
			else    result[i] = "NO";
		}
	}
	return result;
}