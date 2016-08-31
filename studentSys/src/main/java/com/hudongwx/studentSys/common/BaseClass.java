package com.hudongwx.studentSys.common;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseClass<M extends BaseClass<M>> extends Model<M> implements IBean {

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

	public void setHeadTeacher(java.lang.String headTeacher) {
		set("headTeacher", headTeacher);
	}

	public java.lang.String getHeadTeacher() {
		return get("headTeacher");
	}

	public void setAssistant(java.lang.String Assistant) {
		set("Assistant", Assistant);
	}

	public java.lang.String getAssistant() {
		return get("Assistant");
	}

}