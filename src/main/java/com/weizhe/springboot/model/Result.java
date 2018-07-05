package com.weizhe.springboot.model;

public class Result<T> {

	/**
	 * 响应代码
	 */
	private Integer code;

	/**
	 * 响应信息
	 */
	private String msg;

	/**
	 * 返回数据
	 */
	private T date;
	

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getDate() {
		return date;
	}

	public void setDate(T date) {
		this.date = date;
	}

}
