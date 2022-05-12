package Assignment02;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Problem04 {
	
	
	public static ArrayList<String> display(ArrayList<String> A1){
		int length = A1.size();
		char[] array;
		
		ArrayList<Character> arr1 = new ArrayList<>();
		ArrayList<String> arr2 = new ArrayList<>();
		
		for(int i=0;i<length;i++) {
			array = A1.get(i).toCharArray();
			
			for(int j=0;j<array.length;j++) {
				if(!arr1.contains(array[j])) {
					arr1.add(array[j]);
				}
				
			}
			 String string = arr1.stream()
                     .map(String::valueOf)
                     .collect(Collectors.joining());
			arr2.add(string);
			arr1.clear();
			
		}
		return arr2;
	}

}
