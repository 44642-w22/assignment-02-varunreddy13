package Assignment02;

import java.util.LinkedHashSet;
import java.util.Set;

public class Problem03 {
	
	public static Set<Integer> display(int[] A1){
		int size = A1.length;
		Set<Integer> set = new LinkedHashSet<>();
		for(int a=0;a<size;a++) {
			for(int b=a+1;b<size;b++) {
				if(A1[a] == A1[b]) {
					for(int c=b;c<size;c++) {
						A1[c] = A1[c]+1;
					}
				}
			}
			set.add(A1[a]);
		}

		return set;
		
	}

}
