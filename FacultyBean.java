package in.co.sunrays.proj4.bean;

import java.util.Date;

/**
 * Faculty JavaBean encapsulates Faculty attributes
 * 
 * @author Factory
 * @version 1.0
 * @Copyright (c) SunilOS
 * 
 */
public class FacultyBean extends BaseBean {
	private String firstName;
	private String lastName;
	private Date dob;
	private String mobileNo;
	private String email;
	private String Qualification;
	private String gender;
	private String address;
	private long collegeid;
	private String collegename;
	private long courseid;
	private String coursename;
	private long subjectid;
	private String subjectname;
	private String experience;

	public long getCollegeid() {
		return collegeid;
	}

	public void setCollegeid(long collegeid) {
		this.collegeid = collegeid;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public long getCourseid() {
		return courseid;
	}

	public void setCourseid(long courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public long getSubjectid() {
		return subjectid;
	}

	public void setSubjectid(long subjectid) {
		this.subjectid = subjectid;
	}

	public String getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String Qualification) {
		this.Qualification = Qualification;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getKey() {
		return id + "";
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return firstName + lastName;
	}

}
