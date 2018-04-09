package Week1;

public class ClassNote {
	private class SingleLL {
		public void PushFront(int key) {
			// node <- new node
			// node.key <- key
			// node.next <- head
			// head <- node
			// if tail == nil:
			//		tail <- head
		}
		
		public void PopFront() {
			// if head == nil:
			//		error: empty list
			//	head <- head.next
			//	if head == nil
			//		tail <- nil
		}
		
		public void PushBack(int key) {
			//  node <- new node
			// 	node.key <- key
			//	node.next = nil
			//	if tail == nil:
			//		head <- tail <- node
			//	else:
			//		tail.next <- node
			//		tail <- node
		}
		
		public void PopBack() {
			//	if head == nil: error
			//	if head == tail: 
			//		head <- tail <- nil
			//	else:
			//		p <- head
			//		whi.le p.next.next != nil
			//			p <- p.next
			//		p.next<-nil; tail <- p.next
		}
		
		public void AddAfter( int node, int key) {
			// 	node2 <- new node
			//	node2.key <- key
			//	node2.next <- node.next
			//	node.next <- node2
			//	if tail==node
			//		tail<-node2
		}
	}
	
	private class DoubleLL {
		public void PushBack(int key) {
			//	node <- new node
			//	node.key <- key; node.next = nil
			// if tail== nil
			//		head <- tail <- node
			//		node.prev <- nil
			//	else:
			//		tail.next <- node
			//		node.prev <- tail
			//		tail <- node
		}
		public void PopBack() {
			//	if head==nil: error
			//	if head==tail:
			//		head <- tail <- nil
			//	else:
			//		tail<- tail.prev
			//		tail.next <- nil
		}
		public void AddAfter() {
			//	node2 <- new node
			//	node2.key <- key
			//	node2.next <- node.next
			//	node2.prev <- node
			//	if node2.next != nil
			//		node2.next.prev <- node
			//	if tail==node:
			//		tail<- node2
		}
		public void AddBefore(int node, int key) {
			//	node2 <- new node
			//	node2.key <- key
			//	node2.next <- node
			//	node2.prev <- node.prev
			//	node.prev <- node2
			//	if node2.prev != nil
			//		node2.prev.next <- node2
			//	if head==node
			//		head <- node2
		}
	}
	
}
