package com.weizhe.springboot.handle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weizhe.springboot.model.Result;
import com.weizhe.springboot.util.ResultUtil;

@ControllerAdvice
public class ExceptionHandle {

	@SuppressWarnings("rawtypes")
	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public Result handle(Exception e) {
		return ResultUtil.error(-1, e.getMessage());
	}
}
