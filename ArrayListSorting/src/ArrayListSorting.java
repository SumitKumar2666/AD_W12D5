
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {
	public static void main(String args[]) {
		
		ArrayList <Double> testlist =new ArrayList<Double>();
		testlist.add(0.5);
		testlist.add(0.2);
		testlist.add(0.9);
		testlist.add(0.1);
		testlist.add(0.1);
		testlist.add(0.1);
		testlist.add(0.54);
		testlist.add(0.71);
		testlist.add(0.71);
		testlist.add(0.71);
		testlist.add(0.92);
		testlist.add(0.12);
		testlist.add(0.65);
		testlist.add(0.34);
		testlist.add(0.62);
		
		Collections.sort(testlist);                         //sorting the list
		System.out.println("Sorted Arraylist: ");
		for(Double str: testlist){
	    System.out.println(str);
	    
		}
	}

}
