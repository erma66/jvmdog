package jvmdog.core.command.instance;

import jvmdog.protocol.api.model.MessageData;

public class InstanceRequestData extends MessageData{
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
