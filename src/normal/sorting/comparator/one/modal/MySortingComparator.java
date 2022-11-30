package normal.sorting.comparator.one.modal;

import java.util.Comparator;

public class MySortingComparator implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		/*
		 * if(o1>o2) 
		 * { 
		 * return 1; 
		 * } 
		 * else if(o1<o2)
		 *  { 
		 *  return -1; 
		 *  }
		 *   else
		 *    { 
		 *    return 0; 
		 *    }
		 */
		
		return (o1 > o2) ? 1 : (o1<o2) ? -1 : -0;
	}

	
}
