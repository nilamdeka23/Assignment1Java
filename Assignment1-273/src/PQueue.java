
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PQueue {

	public static void main(String[] args) {

		PriorityQueue<Student> studentEnrollmentQ = new PriorityQueue<>(6, new Comparator<Student>() {

			public int compare(Student student1, Student student2) {
				boolean flag1 = student1.isOnWaitlist();
				boolean flag2 = student2.isOnWaitlist();
				// check to see if both the students are on waitlist
				if (flag1 == flag2) {
					return student1.compareTo(student2);
				} else if (flag1) {
					return -1;
				} else if (flag2) {
					return 1;
				}

				return 0;
			}
		});

		// students that applied for add codes for the class
		studentEnrollmentQ.add(new Student(11, "Jack", true, 4));
		studentEnrollmentQ.add(new Student(42, "Ron", true, 3));
		studentEnrollmentQ.add(new Student(31, "Robin", false));
		studentEnrollmentQ.add(new Student(4, "Venkatesh", true, 2));
		studentEnrollmentQ.add(new Student(5, "Max", true, 6));
		studentEnrollmentQ.add(new Student(56, "Nilam", true, 1));
		// ds to contain the processed list of students
		List<String> finalStudentList = new ArrayList<>();

		while (true) {
			Student studentBeingProcessed = studentEnrollmentQ.poll();
			// when queue is empty
			if (studentBeingProcessed == null) {
				break;
			}

			finalStudentList.add(studentBeingProcessed.getName());
		}

		System.out.println("Below is the final list of students enrolled in for this semester");
		// print only the first 4 values due to limited class capacity
		for (int i = 0; i < 4; i++) {
			System.out.println(finalStudentList.get(i));
		}
	}

}