package com.example.demo;

public class MergeSortedLists {
	
	
	public static void main(String[] args) {
		
		
		
	}
	
	
	
    public ListNode mergeKLists(ListNode[] lists) {
		
    	ListNode finalList = null;//new ListNode();
    	
    	for(int i = 0 ; i < lists.length; i++) {
    		finalList = mergeList(finalList, lists[i]);
    	}
    	
    	return finalList;

    }
    
    public ListNode mergeList(ListNode l1, ListNode l2) {
    	if (l1 == null)
    		return l2;
    	if(l2 == null)
    		return l1;
    	ListNode result = null;
    	
    	if(l1.val <= l2.val) {
    		result = l1;
    		result.next = mergeList(l1.next, l2);
    	}
    	if((l2.val < l1.val)) {
    		result = l2;
    		result.next = mergeList(l1,l2.next);
    		
    	}
    	return result;
    }
	
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
}
