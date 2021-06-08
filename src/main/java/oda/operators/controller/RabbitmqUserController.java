package oda.operators.controller;

import javax.enterprise.context.ApplicationScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.javaoperatorsdk.operator.api.Context;
import io.javaoperatorsdk.operator.api.Controller;
import io.javaoperatorsdk.operator.api.DeleteControl;
import io.javaoperatorsdk.operator.api.ResourceController;
import io.javaoperatorsdk.operator.api.UpdateControl;
import io.javaoperatorsdk.operator.processing.event.EventSourceManager;
import io.javaoperatorsdk.operator.processing.event.internal.TimerEventSource;
import oda.operators.model.customresource.RabbitmqUser;

@Controller(name = RabbitmqUserController.NAME)
@ApplicationScoped
public class RabbitmqUserController implements ResourceController<RabbitmqUser> {

    protected static final String NAME = "RabbitmqUser";
    protected static final String SECRET_NAME_PREFIX = "rabbitmq-intentions-";
    protected static final String LABEL_OWNER_UID = "rabbitmq-user.owf-oda.local/owner_uid";
    protected static final String CREATED_BY = "rabbitmq-user-operator.owf-oda.local/created-by";
    protected static final String MANAGED_BY = "rabbitmq-user-operator.owf-oda.local/managed-by";
    protected static final String APPLICATION_SOURCE = "application-source";

    protected static final String CUSTOMSERVICE_OPERATOR = "customservice-operator";
    protected static final String KEY_USERNAME = "oda.rabbit.username";
    protected static final String KEY_PASSWORD = "oda.rabbit.password";
    protected static final String KEY_VHOST = "oda.rabbit.vhost";
    protected static final String KEY_CONSUMER_RETRY = "oda.rabbit.consumer.max.retry";
    protected static final String CONSUME_PREFIX = "consume-";
    protected static final String PRODUCE_PREFIX = "produce-";
    protected static final int LABEL_MAX_LENGHT = 62;

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitmqUserController.class);

    private TimerEventSource timerEventSource;

    void setTimerEventSource(TimerEventSource timerEventSource) {
        this.timerEventSource = timerEventSource;
    }

    @Override
    public void init(EventSourceManager eventSourceManager) {
        timerEventSource = new TimerEventSource();
        eventSourceManager.registerEventSource("Timer", timerEventSource);
    }

    @Override
    public DeleteControl deleteResource(RabbitmqUser resource, Context<RabbitmqUser> context) {
        return DeleteControl.DEFAULT_DELETE;
    }

    // Return the changed resource, so it gets updated. See javadoc for details.
    @Override
    public UpdateControl<RabbitmqUser> createOrUpdateResource(RabbitmqUser resource, Context<RabbitmqUser> context) {

        return UpdateControl.updateCustomResourceAndStatus(resource);
    }

}