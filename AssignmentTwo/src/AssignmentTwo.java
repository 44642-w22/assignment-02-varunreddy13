import java.util.*;
import java.util.stream.Collectors;


public class AssignmentTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("************************************** Problem01 *******************************");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number of Elements : ");
		int elements = scan.nextInt();
		System.out.println("Enter String elements : ");

		ArrayList<String> arr = new ArrayList<>();
		while(elements> 0) {
			arr.add(scan.next());
			elements--;
		}

		//Problem01 p1 = new Problem01();
		System.out.println("OUTPUT "+ display01(arr));

		System.out.println();
		System.out.println("************************************** Problem02 *******************************");

		System.out.println("Enter elements  : ");
		int element02 = scan.nextInt();
		String[] S11 = new String[element02];
		//System.out.println("Enter String elements: ");
		for(int i=0;i<element02;i++) {
			S11[i] = scan.next();
		}
		//Problem02 p2 = new Problem02();
		Map<String,String> output2 = display02(S11);
		System.out.println("OUTPUT "+output2);

		System.out.println();
		System.out.println("************************************** Problem03 *******************************");
		System.out.println("Enter number of elements");
		int element3 = scan.nextInt();
		System.out.println("Enter Integer elements : ");
		int[] A2 = new int[element3];
		for(int i=0;i<element3;i++) {
			A2[i] = scan.nextInt();
		}
		//Problem03 p3 = new Problem03();
		//        Set<Integer> output2 = test2.sequential(A2);
		//        System.out.println(output2);
		System.out.println("OUTPUT "+display03(A2));

		System.out.println();
		System.out.println("************************************** Problem04 *******************************");

		System.out.println("Enter number of elements : ");
		int element04 = scan.nextInt();
		System.out.println("Enter String elements  : ");
		ArrayList<String> A1 = new ArrayList<>();
		while(element04>0) {
			A1.add(scan.next());
			element04--;
		}
		//Problem04 p4 = new Problem04();
		ArrayList<String> output4 = display04(A1);
		System.out.println("OUTPUT "+output4);


		System.out.println();
		System.out.println("************************************** Problem05 *******************************");

		System.out.println("Enter number of elements : " );
		ArrayList<String> A = new ArrayList<>();
		int element05 = scan.nextInt();
		System.out.println("Enter String elements  : ");
		while(element05>0) {
			A.add(scan.next());
			element05--;
		}
		//Problem05 p5 = new Problem05();
		Map<String, String> output5 = display05(A);
		System.out.println("OUTPUT "+output5);

		System.out.println();

		System.out.println("************************************** Problem06 *******************************");

		System.out.println("Enter number of elements : ");
		int element06 = scan.nextInt();
		ArrayList<String> S1 = new ArrayList<>();
		System.out.println("Enter String elements  : ");
		while(element06>0) {
			S1.add(scan.next());
			element06--;
		}
		//Problem06 p6 = new Problem06();
		Map<String,Boolean> output6 = display06(S1);
		System.out.println("OUTPUT "+output6);

	}
	
	//  Problem01
	public static Map<String,Integer> display01(ArrayList<String> a){
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
//  Problem02
	public static Map<String, String> display02(String[] S1){
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
//  Problem03
	
	public static Set<Integer> display03(int[] A1){
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
//  Problem04
	
	public static ArrayList<String> display04(ArrayList<String> A1){
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

//  Problem05
	public static Map<String, String> display05(ArrayList<String> A){
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
//  Problem06
	public static Map<String, Boolean> display06(ArrayList<String> S1) {
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
