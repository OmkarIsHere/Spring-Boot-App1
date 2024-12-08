package com.student.registration;
import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sId;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "sId")
//    private String sId;

    @Column(name = "sName")
    private String sName;

    @Column(name = "sEmail", unique = true, nullable = false)
    private String sEmail;
    
    @Column(name = "sPhone", unique = true, nullable = false)
    private String sPhone;

    @Column(name = "sCourse")
    private String sCourse;
    
    @Column(name = "sPassword")
    private String sPassword;

	public Student() {}

	public Student(String name, String email, String phone, String course, String password) {
		this.sName = name;
		this.sEmail = email;
		this.sPhone = phone;
		this.sPassword = password;
		this.sCourse = course;
	}

	public Long getId() {
        return sId;
    }
	
    public void setId(Long id) {
        this.sId = id;
    }
	
	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsEmail() {
		return sEmail;
	}

	public void setsEmail(String sEmail) {
		this.sEmail = sEmail;
	}

	public String getsPhone() {
		return sPhone;
	}

	public void setsPhone(String sPhone) {
		this.sPhone = sPhone;
	}

	public String getsCourse() {
		return sCourse;
	}

	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}

	public String getsPassword() {
		return sPassword;
	}

	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sEmail=" + sEmail + ", sPhone=" + sPhone + ", sCourse=" + sCourse
				+ ", sPassword=" + sPassword + "]";
	}
	


}

