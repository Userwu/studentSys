package com.hudongwx.studentsys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseStudentEmployment<M extends BaseStudentEmployment<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setClassName(java.lang.String className) {
		set("className", className);
	}

	public java.lang.String getClassName() {
		return get("className");
	}

	public void setStudentName(java.lang.String studentName) {
		set("studentName", studentName);
	}

	public java.lang.String getStudentName() {
		return get("studentName");
	}

	public void setEmploymentStatus(java.lang.Integer employmentStatus) {
		set("employmentStatus", employmentStatus);
	}

	public java.lang.Integer getEmploymentStatus() {
		return get("employmentStatus");
	}

	public void setTrackTime(java.lang.Long trackTime) {
		set("trackTime", trackTime);
	}

	public java.lang.Long getTrackTime() {
		return get("trackTime");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}

	public java.lang.String getRemark() {
		return get("remark");
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

	public void setApproveStatus(java.lang.Integer approveStatus) {
		set("approveStatus", approveStatus);
	}

	public java.lang.Integer getApproveStatus() {
		return get("approveStatus");
	}

	public void setApprover(java.lang.String approver) {
		set("approver", approver);
	}

	public java.lang.String getApprover() {
		return get("approver");
	}

}
