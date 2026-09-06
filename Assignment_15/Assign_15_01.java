import java.util.*;

class Main {

	public static void main(String[] args) {
		
		System.out.println("Elements in Stack "+ Main.StackUndo());
	}

	public static Stack<Integer> StackUndo() {

		Stack<Integer> st = new Stack<>();

		st.push(5);
		st.push(2);
		st.push(7);

		return st;
	}
}





/* 	1. Stack With Undo Feature
Problem: Design a stack that supports the usual operations (push, pop, top) and an 
additional operation undo(k) which undoes the last k operations.
Input: Sequence of operations. Output: Final stack content.
Constraints:
• 1 <= operations <= 10^5
• Only last k operations are undone in reverse order.
Example: Input: push(5), push(2), pop(), push(7), undo(2) Output: [5, 2]	*/