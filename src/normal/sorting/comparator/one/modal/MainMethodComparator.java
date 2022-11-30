package normal.sorting.comparator.one.modal;

import java.util.ArrayList;
import java.util.Collections;

public class MainMethodComparator 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arList = new ArrayList<Integer>();
		
		arList.add(12);
		arList.add(13);
		arList.add(11);
		arList.add(9);
		arList.add(14);
		arList.add(16);
		System.out.println("Without Sorrting: >> "+arList);
		
		Collections.sort(arList,new MySortingComparator());
		System.out.println("After Sorrting: >> "+arList);

		

		
		
	}

}
