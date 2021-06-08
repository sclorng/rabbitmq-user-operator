package oda.operators.model.customresource;

import io.quarkus.runtime.annotations.RegisterForReflection;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@RegisterForReflection
public class RabbitmqUserStatus {
    
    private RabbitmqUserStatusStep steps;
    private int ressourseHash;
    private boolean rescheduled = false;

    public RabbitmqUserStatus() {
        steps = new RabbitmqUserStatusStep();
    }

    public RabbitmqUserStatusStep getSteps() {
        return this.steps;
    }

    public void setSteps(RabbitmqUserStatusStep steps) {
        this.steps = steps;
    }

    public int getRessourseHash() {
        return this.ressourseHash;
    }

    public void setRessourseHash(int ressourseHash) {
        this.ressourseHash = ressourseHash;
    }

    public boolean isRescheduled() {
        return this.rescheduled;
    }

    public void setRescheduled(boolean rescheduled) {
        this.rescheduled = rescheduled;
    }

}
