package cn.edu.neu.entity;

import java.sql.Date;
import java.util.List;

import cn.edu.neu.vo.MajorWithIdAndName;

public class User {
	private String userId;
	private String userPhone;
	private Integer userSex;
	private double userBalance;
	private long userBoxtime;
	private MajorWithIdAndName major;
	private Integer usersignDays;
	private Date lastsignTime;
	private List<BoxUseRecord> boxUseRecords;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Integer getUserSex() {
		return userSex;
	}
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	public double getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(double userBalance) {
		this.userBalance = userBalance;
	}
	public long getUserBoxtime() {
		return userBoxtime;
	}
	public void setUserBoxtime(long userBoxtime) {
		this.userBoxtime = userBoxtime;
	}
	public MajorWithIdAndName getMajor() {
		return major;
	}
	public void setMajor(MajorWithIdAndName major) {
		this.major = major;
	}
	public Integer getUsersignDays() {
		return usersignDays;
	}
	public void setUsersignDays(Integer usersignDays) {
		this.usersignDays = usersignDays;
	}
	public Date getLastsignTime() {
		return lastsignTime;
	}
	public void setLastsignTime(Date lastsignTime) {
		this.lastsignTime = lastsignTime;
	}
	public List<BoxUseRecord> getBoxUseRecords() {
		return boxUseRecords;
	}
	public void setBoxUseRecords(List<BoxUseRecord> boxUseRecords) {
		this.boxUseRecords = boxUseRecords;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPhone=" + userPhone + ", userSex=" + userSex + ", userBalance="
				+ userBalance + ", userBoxtime=" + userBoxtime + ", usersignDays=" + usersignDays + ", lastsignTime="
				+ lastsignTime + ", boxUseRecords=" + boxUseRecords + "]";
	}
	public User(String userId, String userPhone, Integer userSex, double userBalance, long userBoxtime,
			MajorWithIdAndName major, Integer usersignDays, Date lastsignTime, List<BoxUseRecord> boxUseRecords) {
		super();
		this.userId = userId;
		this.userPhone = userPhone;
		this.userSex = userSex;
		this.userBalance = userBalance;
		this.userBoxtime = userBoxtime;
		this.major = major;
		this.usersignDays = usersignDays;
		this.lastsignTime = lastsignTime;
		this.boxUseRecords = boxUseRecords;
	}
	public User() {
		super();
	}
	
	
}
