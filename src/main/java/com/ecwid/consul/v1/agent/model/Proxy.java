package com.ecwid.consul.v1.agent.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Proxy {

	@SerializedName("Upstreams")
	private List<Upstream> upstreams;

	public List<Upstream> getUpstreams() {
		return upstreams;
	}

	public void setUpstreams(List<Upstream> upstreams) {
		this.upstreams = upstreams;
	}
}
