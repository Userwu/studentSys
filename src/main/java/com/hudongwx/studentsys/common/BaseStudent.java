package com.hudongwx.studentsys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseStudent<M extends BaseStudent<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setUserId(java.lang.Integer userId) {
		set("userId", userId);
	}

	public java.lang.Integer getUserId() {
		return get("userId");
	}

	public void setName(java.lang.String name) {
		set("name", name);
	}

	public java.lang.String getName() {
		return get("name");
	}

	public void setSex(java.lang.String sex) {
		set("sex", sex);
	}

	public java.lang.String getSex() {
		return get("sex");
	}

	public void setIdNumber(java.lang.String idNumber) {
		set("idNumber", idNumber);
	}

	public java.lang.String getIdNumber() {
		return get("idNumber");
	}

	public void setContactInformation(java.lang.String contactInformation) {
		set("contactInformation", contactInformation);
	}

	public java.lang.String getContactInformation() {
		return get("contactInformation");
	}

	public void setQq(java.lang.String qq) {
		set("qq", qq);
	}

	public java.lang.String getQq() {
		return get("qq");
	}

	public void setEmail(java.lang.String email) {
		set("email", email);
	}

	public java.lang.String getEmail() {
		return get("email");
	}

	public void setEmergencyContact(java.lang.String emergencyContact) {
		set("emergencyContact", emergencyContact);
	}

	public java.lang.String getEmergencyContact() {
		return get("emergencyContact");
	}

	public void setEducationBackground(java.lang.String educationBackground) {
		set("educationBackground", educationBackground);
	}

	public java.lang.String getEducationBackground() {
		return get("educationBackground");
	}

	public void setMajor(java.lang.String major) {
		set("major", major);
	}

	public java.lang.String getMajor() {
		return get("major");
	}

	public void setCollege(java.lang.String college) {
		set("college", college);
	}

	public java.lang.String getCollege() {
		return get("college");
	}

	public void setGraduationTime(java.lang.Long graduationTime) {
		set("graduationTime", graduationTime);
	}

	public java.lang.Long getGraduationTime() {
		return get("graduationTime");
	}

	public void setClassId(java.lang.Integer classId) {
		set("classId", classId);
	}

	public java.lang.Integer getClassId() {
		return get("classId");
	}

	public void setClassName(java.lang.String className) {
		set("className", className);
	}

	public java.lang.String getClassName() {
		return get("className");
	}

	public void setSubject(java.lang.String subject) {
		set("subject", subject);
	}

	public java.lang.String getSubject() {
		return get("subject");
	}

	public void setCredit(java.lang.Integer credit) {
		set("credit", credit);
	}

	public java.lang.Integer getCredit() {
		return get("credit");
	}

	public void setTestAverage(java.lang.Integer testAverage) {
		set("testAverage", testAverage);
	}

	public java.lang.Integer getTestAverage() {
		return get("testAverage");
	}

	public void setTrainingEvaluation(java.lang.Integer trainingEvaluation) {
		set("trainingEvaluation", trainingEvaluation);
	}

	public java.lang.Integer getTrainingEvaluation() {
		return get("trainingEvaluation");
	}

	public void setTutorId(java.lang.Integer tutorId) {
		set("tutorId", tutorId);
	}

	public java.lang.Integer getTutorId() {
		return get("tutorId");
	}

	public void setTutorName(java.lang.String tutorName) {
		set("tutorName", tutorName);
	}

	public java.lang.String getTutorName() {
		return get("tutorName");
	}

	public void setAdmission(java.lang.Long admission) {
		set("admission", admission);
	}

	public java.lang.Long getAdmission() {
		return get("admission");
	}

	public void setTrainingGraduationTime(java.lang.Long trainingGraduationTime) {
		set("trainingGraduationTime", trainingGraduationTime);
	}

	public java.lang.Long getTrainingGraduationTime() {
		return get("trainingGraduationTime");
	}

	public void setTuition(java.lang.Integer tuition) {
		set("tuition", tuition);
	}

	public java.lang.Integer getTuition() {
		return get("tuition");
	}

	public void setPaymentMethod(java.lang.String paymentMethod) {
		set("paymentMethod", paymentMethod);
	}

	public java.lang.String getPaymentMethod() {
		return get("paymentMethod");
	}

	public void setFirstRepaymentTime(java.lang.Long firstRepaymentTime) {
		set("firstRepaymentTime", firstRepaymentTime);
	}

	public java.lang.Long getFirstRepaymentTime() {
		return get("firstRepaymentTime");
	}

	public void setCounselorId(java.lang.Integer counselorId) {
		set("counselorId", counselorId);
	}

	public java.lang.Integer getCounselorId() {
		return get("counselorId");
	}

	public void setCounselorName(java.lang.String counselorName) {
		set("counselorName", counselorName);
	}

	public java.lang.String getCounselorName() {
		return get("counselorName");
	}

	public void setSubsidyPer(java.lang.Integer subsidyPer) {
		set("subsidyPer", subsidyPer);
	}

	public java.lang.Integer getSubsidyPer() {
		return get("subsidyPer");
	}

	public void setBonus(java.lang.Integer bonus) {
		set("bonus", bonus);
	}

	public java.lang.Integer getBonus() {
		return get("bonus");
	}

	public void setResidualFrequency(java.lang.Integer residualFrequency) {
		set("residualFrequency", residualFrequency);
	}

	public java.lang.Integer getResidualFrequency() {
		return get("residualFrequency");
	}

	public void setRegionId(java.lang.Integer regionId) {
		set("regionId", regionId);
	}

	public java.lang.Integer getRegionId() {
		return get("regionId");
	}

	public void setChecked(java.lang.Integer checked) {
		set("checked", checked);
	}

	public java.lang.Integer getChecked() {
		return get("checked");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}

	public java.lang.Integer getStatus() {
		return get("status");
	}

	public void setEmploymentStatus(java.lang.Integer employmentStatus) {
		set("employmentStatus", employmentStatus);
	}

	public java.lang.Integer getEmploymentStatus() {
		return get("employmentStatus");
	}

	public void setCreateTime(java.lang.Long createTime) {
		set("createTime", createTime);
	}

	public java.lang.Long getCreateTime() {
		return get("createTime");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}

	public java.lang.String getIp() {
		return get("ip");
	}

	public void setOperaterId(java.lang.Integer operaterId) {
		set("operaterId", operaterId);
	}

	public java.lang.Integer getOperaterId() {
		return get("operaterId");
	}

	public void setOperater(java.lang.String operater) {
		set("operater", operater);
	}

	public java.lang.String getOperater() {
		return get("operater");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
	}

}
