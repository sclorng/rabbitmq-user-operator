package oda.operators.model.customresource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.quarkus.runtime.annotations.RegisterForReflection;

@JsonIgnoreProperties(ignoreUnknown = true)
@RegisterForReflection
public class RabbitmqUserStatusStep {

    // public static final String STEP_PENDING = "pending";
    // public static final String STEP_POSTPONED = "postponed";
    // public static final String STEP_DONE = "done";

    private RabbitmqStep rabbitmqObjects = RabbitmqStep.PENDING;
    private RabbitmqStep rabbitmqSecret = RabbitmqStep.PENDING;
    private RabbitmqStep eventServiceTopic = RabbitmqStep.PENDING;

    public RabbitmqStep getRabbitmqObjects() {
        return this.rabbitmqObjects;
    }

    public void setRabbitmqObjects(RabbitmqStep rabbitmqObjects) {
        this.rabbitmqObjects = rabbitmqObjects;
    }

    public RabbitmqStep getRabbitmqSecret() {
        return this.rabbitmqSecret;
    }

    public void setRabbitmqSecret(RabbitmqStep rabbitmqSecret) {
        this.rabbitmqSecret = rabbitmqSecret;
    }

    public RabbitmqStep getEventServiceTopic() {
        return this.eventServiceTopic;
    }

    public void setEventServiceTopic(RabbitmqStep eventServiceTopic) {
        this.eventServiceTopic = eventServiceTopic;
    }

}