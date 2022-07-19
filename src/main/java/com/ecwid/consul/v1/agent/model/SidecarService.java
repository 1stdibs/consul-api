package com.ecwid.consul.v1.agent.model;

import com.google.gson.annotations.SerializedName;

public class SidecarService {

	@SerializedName("Proxy")
	private Proxy proxy;

	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}
}
