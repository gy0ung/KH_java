package calendar01.test02_T;

public class Student {
	private String stuNo;
	private String name;
	private int jumsu;
	private String address;
	private String tel;
	private boolean bool;
	
	public Student() { }

	public Student(String stuNo, String name, int jumsu, String address, String tel, boolean bool) {
		this.stuNo = stuNo;
		this.name = name;
		this.jumsu = jumsu;
		this.address = address;
		this.tel = tel;
		this.bool = bool;
	}
	
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
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
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
	
	@Override
	public String toString() {
		return "Student [stuNo=" + stuNo + ", name=" + name + ", jumsu=" + jumsu + ", address=" + address + ", tel="
				+ tel + ", bool=" + bool + "]";
	}
}
