package lambda.implementation.comparator.three.modal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		
		Comparator<Integer> comp = (o1,o2) ->  { return (o1>o2) ? 1 : (o1<o2) ? -1 : 0;};
		Collections.sort(arList, comp);
		System.out.println("Without Sorrting: >> "+arList);


	}

}
