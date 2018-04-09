package Week1;

public class ClassNoteStackQ {
	private class ClassNoteStack {
		public void IsBalanced(String str) {
			//	Stack stack
			//	for char in str:
			//		if char in ['(','[']:
			//			stack.Push(char)
			//		else:
			//			if stack.Empty(): return false
			//			top <- stack.Pop()
			//			if (top == ]'] and char!= ']') or
			//				(top == '(' and char != ')'):
			//				return false
			//	return stack.empty
		}
		
		public ClassNoteStack() {
			// if implemented by array
			// have a varaible numElements to keep track number of elements
			//		inside the array.
			// Push(e) will be PushEnd(e)
			// Pop(e) will be PopEnd(e)
			
			// if implemented by linked List
			// Push(e) is implemented as PushFront(e)
			// Pop(e) is implemented as PopFront()
		}
	}
	
	private class ClassNoteQ {
		// implement functions: enqueue, dequeue,
		// if implemented by linked list
		//	Enqueue(e) = PushEnd(e)
		// Dequeue() = PopFront()
		
		// if implemented by array. we want enqueue and dequeue is O(1)
		//	use 2 variables: read and write to denote the first and last
		//	index of the array
		// read pointer points where dequeue should happen
		// 	write pointer points where enqueue should happen
		// we implement a circular buffer. however, once the write
		// pointer wraps around, write pointer cannot be same as read
		// pointer.
		
	}
}
