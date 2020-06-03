package com.lxn.entity;

public class ResultEntity {
	@Override
	public String toString() {
		return "ResultEntity [status=" + status + ", resultObject=" + resultObject + "]";
	}
	private String status;
	private Object resultObject;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getResultObject() {
		return resultObject;
	}
	public void setResultObject(Object resultObject) {
		this.resultObject = resultObject;
	}

}
