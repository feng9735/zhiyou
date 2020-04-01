package com.zhiyou100.gym.pojo;

public class ResponseModel {
	public static final int SUCCESS_CODE = 0;
	public static final int ERROR_CODE = 1;
	
	
	public static final String SUCCSS_MSG  = "请求成功";
	
//	登录错误信息
	public static final String ERROR_MSG_1  = "账号不能为空！";
	public static final String ERROR_MSG_2  = "密码不能为空！";
	public static final String ERROR_MSG_3  = "账号或密码不正确！";
	
	
//	注册错误信息
	public static final String ERROR_MSG_4  = "注册信息不能为空！";
	public static final String ERROR_MSG_5  = "您注册的账号已存在！";
	
	
	
	public static ResponseModel success(Object data){
		ResponseModel model = new ResponseModel();
		model.setCode(SUCCESS_CODE);
		model.setMsg(SUCCSS_MSG);
		model.setData(data);
		return model;
	}
	
	public static ResponseModel error(String message){
		ResponseModel model = new ResponseModel();
		model.setCode(ERROR_CODE);
		model.setMsg(message);
		return model;
	}

	private Integer code;
	private String msg;
	private Object data;


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
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}



	@Override
	public String toString() {
		return "ResponseModel [code=" + code + ", msg=" + msg + ", data=" + data + "]";
	}
}
