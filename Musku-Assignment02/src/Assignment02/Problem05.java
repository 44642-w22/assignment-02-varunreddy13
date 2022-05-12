package Assignment02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem05 {
	
	public static Map<String, String> display(ArrayList<String> A){
		int length = A.size();
		Map<String,String> map = new LinkedHashMap<>();
		ArrayList<Character> arr = new ArrayList<>();
		for(int i=0;i<length;i++) {
			char[] array = A.get(i).toCharArray();
			for(int j=0;i<array.length;j--) {
				arr.add(array[j]);
				String string = arr.stream()
	                     .map(String::valueOf)
	                     .collect(Collectors.joining());
				arr.clear();
				arr.add(array[array.length-1]);
				String string1 = arr.stream()
	                     .map(String::valueOf)
	                     .collect(Collectors.joining());
				map.put(string, string1);
				break;
			}
			arr.clear();

		}
		return map;
	}

}
