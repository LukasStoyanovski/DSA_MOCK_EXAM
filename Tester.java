public class Tester {
	public static void main(String[] args) {

		/* Add your code as well as the answers to text questions (as comments) */
		/* Don't forget to include the number of the questions (Part X Question Y) as comments */
		
		BinarySearchTree bst = new BinarySearchTree();
		
		// Q1 Part a
		
		bst.insert(23);
		bst.insert(14);
		bst.insert(10);
		bst.insert(19);
		bst.insert(16);
		bst.insert(38);
		bst.insert(47);
		bst.insert(39);
		
		//Q2 Part b
		
		bst.plusPlus();
		
		// Q1 Part b
		
		System.out.println("Post order traversal");
		bst.postOrderTraversal();
		
		System.out.println("\nPre order traversal");
		bst.preOrderTraversal();
		
		System.out.println("\nIn order traversal");
		bst.inOrderTraversal();

		/* Q1 Part c 
        
		O(n), this is because each traversal visits each node exactly once.
		The time complexity does not depend on the shape of the binary search tree (whether it is balanced or not)
		it is always proportional to the number of nodes in the tree.*/
		
		/*Q3 
		 * Therefore, the double-linked list with head and tail pointers is the most efficient for all operations of a Deque because it maintains constant-time access to both ends of the list. It does not require any traversal for the fundamental operations, making it ideal for a Deque's requirements.
			Double-Linked List with Head and Tail Pointers:

			append_front: Can be done in O(1) because we have a head pointer, so we can quickly add a new node before the current head and update the head pointer to the new node.
			append_back: Similarly, O(1) because the tail pointer gives us direct access to the last node, allowing us to add a new node after the current tail and update the tail pointer.
			pop_front: O(1) since the head pointer allows us to remove the front node directly and update the head to the next node.
			pop_back: O(1) as the tail pointer means we can remove the tail node and update
		 */
		
		ReferenceBasedList myList = new ReferenceBasedList();

        // Assume you have already added elements to myList
        // For example:
        myList.append("First");
        myList.append("Second");
        myList.append("Third");

        // Now, print the list in reverse order
        myList.printReverse();
        // print reverse order queue list
        QueueReferenceBased myQueue = new QueueReferenceBased();

        // Assume you enqueue some elements
        myQueue.enqueue("First");
        myQueue.enqueue("Second");
        myQueue.enqueue("Third");

        // Print the queue in reverse order
        myQueue.printReverse();
		
	}
};
	
	
	