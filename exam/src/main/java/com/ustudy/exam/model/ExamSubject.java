package com.ustudy.exam.model;

import java.io.Serializable;

public class ExamSubject implements Serializable {

	private static final long serialVersionUID = -9022319462035362070L;
	
	private int id;
	private int examid;
	private int gradeId;
	private String gradeName = null;
	private int subId;
	private String subName = null;
	private int stuNum;
	private int teacNum;
	private int examPaper;
	private int examAnswer;
	private int examPaperNum;
	private int template;
	private int objItemNum;
	private int subItemNum;
	private int taskDispatch;
	
	public ExamSubject() {
	}

	public ExamSubject(int id, int examid, int gradeId, int subId) {
		this.id = id;
		this.examid = examid;
		this.gradeId = gradeId;
		this.subId = subId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}

	public int getTeacNum() {
		return teacNum;
	}

	public void setTeacNum(int teacNum) {
		this.teacNum = teacNum;
	}

	public int getExamPaper() {
		return examPaper;
	}

	public void setExamPaper(int examPaper) {
		this.examPaper = examPaper;
	}

	public int getExamAnswer() {
		return examAnswer;
	}

	public void setExamAnswer(int examAnswer) {
		this.examAnswer = examAnswer;
	}

	public int getExamPaperNum() {
		return examPaperNum;
	}

	public void setExamPaperNum(int examPaperNum) {
		this.examPaperNum = examPaperNum;
	}

	public int getTemplate() {
		return template;
	}

	public void setTemplate(int template) {
		this.template = template;
	}

	public int getObjItemNum() {
		return objItemNum;
	}

	public void setObjItemNum(int objItemNum) {
		this.objItemNum = objItemNum;
	}

	public int getSubItemNum() {
		return subItemNum;
	}

	public void setSubItemNum(int subItemNum) {
		this.subItemNum = subItemNum;
	}

	public int getTaskDispatch() {
		return taskDispatch;
	}

	public void setTaskDispatch(int taskDispatch) {
		this.taskDispatch = taskDispatch;
	}
	
}