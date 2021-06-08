package oda.operators.model.customresource;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Kind;
import io.fabric8.kubernetes.model.annotation.Version;
import io.quarkus.runtime.annotations.RegisterForReflection;

@Group("my.group")
@Kind("RabbitmqUser")
@Version("v1alpha1")
@RegisterForReflection
public class RabbitmqUser extends CustomResource<RabbitmqUserSpec, RabbitmqUserStatus> implements Namespaced {

    private static final long serialVersionUID = 2989781806817820637L;

    @Override
    protected RabbitmqUserSpec initSpec() {
        return new RabbitmqUserSpec();
    }

    @Override
    protected RabbitmqUserStatus initStatus() {
        return new RabbitmqUserStatus();
    }


}
