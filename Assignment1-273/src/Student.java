
public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private boolean isOnWaitlist;
	private int waitlistNo;

	public Student(int id, String name, boolean isOnWaitlist, int waitlistNo) {
		this.id = id;
		this.name = name;
		this.isOnWaitlist = isOnWaitlist;
		this.waitlistNo = waitlistNo;
	}

	public Student(int id, String name, boolean isOnWaitlist) {
		this.id = id;
		this.name = name;
		this.isOnWaitlist = isOnWaitlist;
		// a huge number to make it insignificant
		this.waitlistNo = 1000;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public boolean isOnWaitlist() {
		return isOnWaitlist;
	}

	public int getWaitlistNo() {
		return waitlistNo;
	}

	@Override
	public int compareTo(Student student) {
		if (this.waitlistNo < student.getWaitlistNo())
			return -1;
		else
			return 1;
	}

}
