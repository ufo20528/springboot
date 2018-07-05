package com.weizhe.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boot")
public class SimpleBootController {

	@RequestMapping("/test")
	public String hello()
	{
		return "hello2";
	}
	
	
	@RequestMapping("/test2/{id}")
	public String hello2(@PathVariable("id") Integer id)
	{
		return "hello2:"+id;
	}
	
	//url: /boot/test3?id=11
	@RequestMapping("/test3")
	
	public String hello3(@RequestParam(value="id",required=false,defaultValue="0") Integer id)
	{
		return "hello3:"+id;
	}
}
