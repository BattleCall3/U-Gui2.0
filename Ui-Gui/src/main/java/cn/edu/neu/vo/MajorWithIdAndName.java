package cn.edu.neu.vo;

public class MajorWithIdAndName {
	private int majorId;
	private String majorName;
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public String getMajorName() {
		return majorName;
	}
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	@Override
	public String toString() {
		return "MajorWithIdAndName [majorId=" + majorId + ", majorName=" + majorName + "]";
	}
}
