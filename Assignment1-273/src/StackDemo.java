import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// container or data structure to hold all waitlisted students
		Stack<WaitlistedStudent> waitlistStack = new Stack<WaitlistedStudent>();

		// push all waitlisted students to waitlist stack
		waitlistStack.push(new WaitlistedStudent("John", 1));
		waitlistStack.push(new WaitlistedStudent("Dom", 2));
		waitlistStack.push(new WaitlistedStudent("Maze", 3));
		waitlistStack.push(new WaitlistedStudent("Ben", 4));
		waitlistStack.push(new WaitlistedStudent("Hazel", 5));
		waitlistStack.push(new WaitlistedStudent("Silo", 6));
		waitlistStack.push(new WaitlistedStudent("Ron", 7));

		System.out.println("List of students on Waitlist");
		// print stack contents
		printStackContents(waitlistStack);

		// professor declares maximum number of students to get added from
		// waitlist
		int waitlistCapacity = 4;

		// remove students from the stack that can't get added due to limited
		// seat capacity
		while (waitlistStack.size() != waitlistCapacity) {
			waitlistStack.pop();
		}

		System.out.println("\nList of students that got added due to limited seat capacity(" + waitlistCapacity + ")");
		// print name of students that gets added
		printStackContents(waitlistStack);

	}

	private static void printStackContents(Stack<WaitlistedStudent> waitlistStack) {

		for (int i = 0; i < waitlistStack.size(); i++) {
			WaitlistedStudent student = (WaitlistedStudent) waitlistStack.get(i);
			System.out.println(student.getName() + ", with waitlist position " + student.getWaitlistPos());
		}
	}

}
