package com.cloud.commons;

public enum ResultCode {

	/** 成功 */
	CODE_200(200, "success"),

	CODE_500(500,"服务忙，请稍后再试！");


	private int code;

	private String desc;

	ResultCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

}
