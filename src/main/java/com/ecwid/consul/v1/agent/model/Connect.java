package com.ecwid.consul.v1.agent.model;

import com.google.gson.annotations.SerializedName;

public class Connect {

	@SerializedName("SidecarService")
	private SidecarService sidecarService;

	@SerializedName("Native")
	private Boolean connectNative;

	public SidecarService getSidecarService() {
		return sidecarService;
	}

	public void setSidecarService(SidecarService sidecarService) {
		this.sidecarService = sidecarService;
	}

	public Boolean getConnectNative() {
		return connectNative;
	}

	public void setConnectNative(Boolean connectNative) {
		this.connectNative = connectNative;
	}
}
