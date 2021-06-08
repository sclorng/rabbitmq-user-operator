package oda.operators.model.customresource;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;
import oda.operators.commons.RandomString;

@RegisterForReflection
@JsonIgnoreProperties(ignoreUnknown = true)
public class RabbitmqUserSpec {
    private static final String VHOST_PREFIX = "vhost-";

    private String namespace;
    private String environment;

    @JsonIgnore
    private String password = RandomString.getAlphaNumericString();

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @JsonIgnore
    public String getVhost() {
        return VHOST_PREFIX + this.environment;
    }

}
