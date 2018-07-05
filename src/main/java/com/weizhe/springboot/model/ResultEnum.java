package com.weizhe.springboot.model;

/**
 * 维护所有的错误代码枚举
 * @author Administrator
 *
 */
public enum ResultEnum {
	
	UNKONW_ERROR(-1,"未知错误"),
	SUCCESS(1,"成功");
	

	private ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

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

	private Integer  code;

	private String msg;
}
