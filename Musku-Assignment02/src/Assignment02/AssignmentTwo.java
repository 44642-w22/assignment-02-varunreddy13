package Assignment02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

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
		
		Problem01 p1 = new Problem01();
		System.out.println("OUTPUT "+ p1.display(arr));
		
		 System.out.println();
		System.out.println("************************************** Problem02 *******************************");
		
		System.out.println("Enter elements of choice(int) : ");
        int element02 = scan.nextInt();
        String[] S11 = new String[element02];
        //System.out.println("Enter String elements: ");
        for(int i=0;i<element02;i++) {
        	S11[i] = scan.next();
        }
        Problem02 p2 = new Problem02();
        Map<String,String> output2 = p2.display(S11);
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
        Problem03 p3 = new Problem03();
//        Set<Integer> output2 = test2.sequential(A2);
//        System.out.println(output2);
		System.out.println("OUTPUT "+p3.display(A2));

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
        Problem04 p4 = new Problem04();
        ArrayList<String> output4 = p4.display(A1);
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
	        Problem05 p5 = new Problem05();
	        Map<String, String> output5 = p5.display(A);
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
	        Problem06 p6 = new Problem06();
	        Map<String,Boolean> output6 = p6.display(S1);
	        System.out.println("OUTPUT "+output6);

	}

}
