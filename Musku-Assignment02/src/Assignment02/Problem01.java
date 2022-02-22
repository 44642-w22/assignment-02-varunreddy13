package Assignment02;

import java.util.ArrayList;
import java.util.*;

public class Problem01 {
	
	public static Map<String,Integer> display(ArrayList<String> a){
		Map<String,Integer> map = new TreeMap<>();
		for(int i = 0; i<a.size(); i++) {
			
			
				if(map.containsKey(a.get(i))) {
					map.put(a.get(i), map.get(a.get(i))+1);
				}else {
					map.put(a.get(i),1);
				}			
				}
			
			
		
		
		return map;
	}

}
