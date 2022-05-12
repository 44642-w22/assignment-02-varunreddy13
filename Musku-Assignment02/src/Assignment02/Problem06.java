package Assignment02;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Problem06 {

	
	public static Map<String, Boolean> display(ArrayList<String> S1) {
		// TODO Auto-generated method stub
		int Size = S1.size();
		int count = 1;
		Map<String,Boolean> M1 = new TreeMap<>();
		for(int i=0;i<Size;i++) {
			for(int j=i+1;j<Size;j++) {
				if(S1.get(i).equals(S1.get(j))) {
					count++;
				}
			}
			
			if(count>=2) {
				M1.put(S1.get(i), true);
			}
			else {
				if(!M1.containsKey(S1.get(i))) {
				M1.put(S1.get(i), false);
				}
			}
			count = 1;
		}
		return M1;
	}

}
