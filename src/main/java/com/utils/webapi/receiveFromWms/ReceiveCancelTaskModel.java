package com.utils.webapi.receiveFromWms;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 接收任务取消请求
 * @author Administrator
 *
 */
public class ReceiveCancelTaskModel {
	@JsonProperty("MsgCode")
	private String MsgCode;//消息类型(RgvInfo)
	@JsonProperty("MsgTime")
	private String MsgTime;//时间yyyyMMddhhmmss
	@JsonProperty("WmsTaskId")
	private String WmsTaskId;//WMS任务编号
	public String getMsgCode() {
		return MsgCode;
	}
	public void setMsgCode(String msgCode) {
		MsgCode = msgCode;
	}
	public String getMsgTime() {
		return MsgTime;
	}
	public void setMsgTime(String msgTime) {
		MsgTime = msgTime;
	}
	public String getWmsTaskId() {
		return WmsTaskId;
	}
	public void setWmsTaskId(String wmsTaskId) {
		WmsTaskId = wmsTaskId;
	}
}
