package Assignment02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem02 {
	
	public static Map<String, String> display(String[] S1){
		int length = S1.length;
		ArrayList<Character> arr = new ArrayList<>();
		Map<String, String> map = new LinkedHashMap<>();
		for(int i=0;i<length;i++) {
			char[] array = S1[i].toCharArray();
			for(int j=0;j<1;j++) {
				
				if(!map.containsKey(array[j]+"")) {
					
					arr.add(array[j]);
					String string = arr.stream()
		                     .map(String::valueOf)
		                     .collect(Collectors.joining());
					arr.clear();
					map.put(string, S1[i]);
				}
				else {
					arr.add(array[j]);
					String string = arr.stream()
		                     .map(String::valueOf)
		                     .collect(Collectors.joining());
					arr.clear();
					   map.put(string, map.get(string)+S1[i]);
				}	
			}
		}
		return map;
	}

}
