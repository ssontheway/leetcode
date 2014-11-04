import java.util.Arrays;
import java.util.HashMap;

//两个链表相加
public class AddTwoNums {
	 public static int[] twoSum(int[] numbers, int target) {
		 HashMap<Integer,Integer> table = new HashMap<Integer,Integer>();
		 int[] result = new int[2];
		 for(int i = 0; i < numbers.length; i++){
			 table.put(numbers[i], i);
		 }
		 for(int i = 0; i < numbers.length; i++){
			 if(table.containsKey(target - numbers[i])){
				 int n = table.get(target - numbers[i]);
				 if(n > i){
					 result[0] = i+1;
					 result[1] = n+1;
					 break;
				 }else if(n < i){
					 result[1] = i+1;
					 result[0] = n+1;
					 break;
				 }
			 }
		 }
		 return result;
	 }
	//add sum to 10
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if(l1 == null && l2 == null){
			return null;
		}else if(l1 == null && l2 != null){
			return l2;
		}else if(l1 != null && l2 == null){
			return l1;
		}else{
			ListNode node1 = l1, node2 = l2;
	        return l1;
		}
	}
}
