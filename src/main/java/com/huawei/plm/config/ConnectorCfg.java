package com.huawei.plm.config;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import lombok.Data;

@Data
@XStreamAlias("Connector")
public class ConnectorCfg {
    @XStreamAsAttribute
    private int port = 8080;

    @XStreamAsAttribute
    private String protocol = "HTTP/1.1";

    @XStreamAsAttribute
    String executor;

    public void setPort(int port) {
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getProtocol() {

        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
}
