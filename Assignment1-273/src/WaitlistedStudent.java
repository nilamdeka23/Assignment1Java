public class WaitlistedStudent {

	private String name;
	private int waitlistPos;

	public WaitlistedStudent(String name, int waitlistPos) {
		this.name = name;
		this.waitlistPos = waitlistPos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWaitlistPos() {
		return waitlistPos;
	}

	public void setId(int waitlistPos) {
		this.waitlistPos = waitlistPos;
	}

}
