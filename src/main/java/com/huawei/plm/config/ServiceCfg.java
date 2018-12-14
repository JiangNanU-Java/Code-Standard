package com.huawei.plm.config;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import lombok.Data;

@Data
@XStreamAlias("Service")
public class ServiceCfg {

    @XStreamAsAttribute
    private String name;

    private List<ConnectorCfg> connectors;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<ConnectorCfg> getConnectors() {
        return connectors;
    }

    public void setConnectors(List<ConnectorCfg> connectors) {
        this.connectors = connectors;
    }
}
