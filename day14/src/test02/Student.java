package test02;
// 자바 빈 + 생성자 + toString(오버라이딩)
public class Student {
	private String stuNo;
	private String name;
	private int score;
	private String address;
	private String tel;
	private boolean bool;
	
	// Source → Generate Constructor using Field
	public Student(String stuNo, String name, int score, String address, String tel, boolean bool) {
		super();
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
		this.address = address;
		this.tel = tel;
		this.bool = bool;
	}
	
	
	// Source → Generate Getter and Setter
	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public boolean isBool() {
		return bool;
	}
	public void setBool(boolean bool) {
		this.bool = bool;
	}
	
	
	// Source → Generate toString() // 보여줄값이므로 주로 Field값만 넣는다 (메서드는 잘안씀)
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", score=" + score + ", address=" + address + ", tel="
				+ tel + ", bool=" + bool + "]";
	}
	
}

