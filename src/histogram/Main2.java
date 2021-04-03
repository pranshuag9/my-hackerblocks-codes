package histogram;

import java.util.*;
public class Main2 {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++)
		    arr[i] = s.nextInt();
		    
    	Main2 mainobj = new Main2();
    	StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
    	System.out.println(hist(arr, stack));
    	s.close();
	}
	

	public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {
			int maxArea = Integer.MIN_VALUE, n = arr.length;
			for(int i = 0; i <= n; i++) {
				int h = i != n ? arr[i] : 0;
				if(stack.isEmpty() || h >= arr[stack.top()]) stack.push(i);
				else {
					int currArea = arr[stack.pop()] * (stack.isEmpty() ? i-- : i-- - stack.top() - 1);
					maxArea = maxArea < currArea ? currArea : maxArea;
				}
			}
			return maxArea;		
	}

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}

