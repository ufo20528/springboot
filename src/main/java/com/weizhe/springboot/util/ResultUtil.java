package com.weizhe.springboot.util;

import com.weizhe.springboot.model.Result;

public class ResultUtil {

	public static <T> Result<T> suceess(T object) {
		Result<T> result = new Result<T>();
		result.setCode(0);
		result.setMsg("OK");
		result.setDate(object);
		return result;
	}

	public static <T> Result<T> suceess() {
		Result<T> result = new Result<T>();
		result.setCode(0);
		result.setMsg("OK");
		return result;
	}

	public static <T> Result<T> error(int code, String msg) {
		Result<T> result = new Result<T>();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}

}
