package com.hudongwx.studentSys.common.testBaseModel;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseQuestionnaire<M extends BaseQuestionnaire<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}

	public java.lang.Integer getId() {
		return get("id");
	}

	public void setClassName(java.lang.String className) {
		set("class_name", className);
	}

	public java.lang.String getClassName() {
		return get("class_name");
	}

	public void setDate(java.lang.String date) {
		set("date", date);
	}

	public java.lang.String getDate() {
		return get("date");
	}

	public void setClassChief(java.lang.String classChief) {
		set("class_chief", classChief);
	}

	public java.lang.String getClassChief() {
		return get("class_chief");
	}

	public void setToUser(java.lang.String toUser) {
		set("to_user", toUser);
	}

	public java.lang.String getToUser() {
		return get("to_user");
	}

	public void setEndTime(java.lang.String endTime) {
		set("end_time", endTime);
	}

	public java.lang.String getEndTime() {
		return get("end_time");
	}

	public void setNote(java.lang.String note) {
		set("note", note);
	}

	public java.lang.String getNote() {
		return get("note");
	}

}
