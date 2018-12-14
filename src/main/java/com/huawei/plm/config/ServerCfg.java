package com.huawei.plm.config;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import lombok.Data;

@Data
@XStreamAlias("Server")
public class ServerCfg {

	@XStreamAsAttribute
	private int port = 8005;

	@XStreamAsAttribute
	private String shutDown = "SHUTDOWN";

	private List<ServiceCfg> services;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getShutDown() {
        return shutDown;
    }

    public void setShutDown(String shutDown) {
        this.shutDown = shutDown;
    }

    public List<ServiceCfg> getServices() {
        return services;
    }

    public void setServices(List<ServiceCfg> services) {
        this.services = services;
    }
}
