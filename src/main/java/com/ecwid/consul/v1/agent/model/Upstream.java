package com.ecwid.consul.v1.agent.model;

import com.google.gson.annotations.SerializedName;

public class Upstream {

	@SerializedName("DestinationName")
	private String destinationName;

	@SerializedName("LocalBindPort")
	private Integer localBindPort;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public Integer getLocalBindPort() {
		return localBindPort;
	}

	public void setLocalBindPort(Integer localBindPort) {
		this.localBindPort = localBindPort;
	}
}
