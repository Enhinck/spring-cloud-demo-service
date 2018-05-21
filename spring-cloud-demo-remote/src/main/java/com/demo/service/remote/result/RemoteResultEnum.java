package com.demo.service.remote.result;

public enum RemoteResultEnum {
	SUCCESS(0, "成功"), DB_ERROR(1, "数据库异常"), IO_ERROR(2, "I/O异常"), PARAMS_ERROR(3, "参数错误");

	private int resultCode; // 错误码
	private String message; // 错误信息

	RemoteResultEnum(int resultCode, String message) {
		this.resultCode = resultCode;
		this.message = message;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}