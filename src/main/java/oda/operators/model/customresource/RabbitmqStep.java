package oda.operators.model.customresource;

import com.fasterxml.jackson.annotation.JsonValue;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public enum RabbitmqStep {

    PENDING("pending"),
    POSTPONED("postponed"),
    DONE("done");

    private String value;

    private RabbitmqStep(String s) {
        this.value = s;
    }

    @JsonValue
    String getValue() {
        return this.value;
    }

}
