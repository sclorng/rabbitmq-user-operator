# rabbitmq-user-operator

Demo for issue https://github.com/quarkiverse/quarkus-operator-sdk/issues/47.

Add .env file 
```
QUARKUS_OPERATOR_SDK_CONTROLLERS_RABBITMQUSER_NAMESPACES=default
```

`mvn quarkus:dev`

produces

```
[INFO] Scanning for projects...
[INFO] 
[INFO] ----------------< oda.operators:rabbitmq-user-operator >----------------
[INFO] Building rabbitmq-user-operator 1.0.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- quarkus-maven-plugin:1.13.4.Final:dev (default-cli) @ rabbitmq-user-operator ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 2 resources
[INFO] Nothing to compile - all classes are up to date
Listening for transport dt_socket at address: 5005
2021-06-08 15:56:57,320 WARN  [io.qua.ope.dep.OperatorSDKProcessor] (build-8) Use of deprecated check-crd-and-validate-local-model property. Use crd.validate instead.
2021-06-08 15:56:57,481 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-8) Registered 'oda.operators.model.customresource.RabbitmqUserSpec' for reflection
2021-06-08 15:56:57,482 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-8) Registered 'oda.operators.model.customresource.RabbitmqUserStatus' for reflection
2021-06-08 15:56:57,508 INFO  [io.qua.ope.dep.OperatorSDKProcessor] (build-8) Processed 'oda.operators.controller.RabbitmqUserController' controller named 'RabbitmqUser' for 'rabbitmqusers.my.group' CR (version 'my.group/v1alpha1')
2021-06-08 15:56:58,729 INFO  [io.fab.crd.gen.CRDGenerator] (build-8) Created 'rabbitmqusers.my.group' version 'v1alpha1' with oda.operators.model.customresource.RabbitmqUser (spec: oda.operators.model.customresource.RabbitmqUserSpec / status oda.operators.model.customresource.RabbitmqUserStatus):
        - v1 CRD -> file:///workspaces/trash/rabbitmq-user-operator/target/kubernetes/rabbitmqusers.my.group-v1.yml

[INFO] Checking for existing resources in: /workspaces/trash/rabbitmq-user-operator/src/main/kubernetes.
__  ____  __  _____   ___  __ ____  ______ 
 --/ __ \/ / / / _ | / _ \/ //_/ / / / __/ 
 -/ /_/ / /_/ / __ |/ , _/ ,< / /_/ /\ \   
--\___\_\____/_/ |_/_/|_/_/|_|\____/___/   
2021-06-08 15:57:02,731 INFO  [io.quarkus] (Quarkus Main Thread) rabbitmq-user-operator 1.0.0-SNAPSHOT on JVM (powered by Quarkus 1.13.4.Final) started in 7.271s. Listening on: http://localhost:8080
2021-06-08 15:57:02,735 INFO  [io.quarkus] (Quarkus Main Thread) Profile dev activated. Live Coding activated.
2021-06-08 15:57:02,736 INFO  [io.quarkus] (Quarkus Main Thread) Installed features: [cdi, kubernetes, kubernetes-client, openshift-client, operator-sdk, smallrye-health]
2021-06-08 15:57:03,951 ERROR [io.qua.run.Application] (Quarkus Main Thread) Failed to start application (with profile dev): java.lang.NullPointerException
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer.operator(OperatorProducer.java:27)
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer_Subclass.operator$$superaccessor1(OperatorProducer_Subclass.zig:235)
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer_Subclass$$function$$1.apply(OperatorProducer_Subclass$$function$$1.zig:53)
        at io.quarkus.arc.impl.AroundInvokeInvocationContext.proceed(AroundInvokeInvocationContext.java:54)
        at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.proceed(InvocationInterceptor.java:63)
        at io.quarkus.arc.runtime.devconsole.InvocationInterceptor.monitor(InvocationInterceptor.java:51)
        at io.quarkus.arc.runtime.devconsole.InvocationInterceptor_Bean.intercept(InvocationInterceptor_Bean.zig:521)
        at io.quarkus.arc.impl.InterceptorInvocation.invoke(InterceptorInvocation.java:41)
        at io.quarkus.arc.impl.AroundInvokeInvocationContext.perform(AroundInvokeInvocationContext.java:41)
        at io.quarkus.arc.impl.InvocationContexts.performAroundInvoke(InvocationContexts.java:32)
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer_Subclass.operator(OperatorProducer_Subclass.zig:186)
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.create(OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.zig:379)
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.create(OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.zig:394)
        at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:96)
        at io.quarkus.arc.impl.AbstractSharedContext.access$000(AbstractSharedContext.java:14)
        at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:29)
        at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:26)
        at io.quarkus.arc.impl.LazyValue.get(LazyValue.java:26)
        at io.quarkus.arc.impl.ComputingCache.computeIfAbsent(ComputingCache.java:69)
        at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:26)
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.get(OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.zig:426)
        at io.quarkiverse.operatorsdk.runtime.OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.get(OperatorProducer_ProducerMethod_operator_847eb6ef05d4600d92e563d1fb80474eed9238e0_Bean.zig:442)
        at oda.operators.QuarkusOperator_Bean.create(QuarkusOperator_Bean.zig:271)
        at oda.operators.QuarkusOperator_Bean.create(QuarkusOperator_Bean.zig:311)
        at io.quarkus.arc.impl.AbstractSharedContext.createInstanceHandle(AbstractSharedContext.java:96)
        at io.quarkus.arc.impl.AbstractSharedContext.access$000(AbstractSharedContext.java:14)
        at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:29)
        at io.quarkus.arc.impl.AbstractSharedContext$1.get(AbstractSharedContext.java:26)
        at io.quarkus.arc.impl.LazyValue.get(LazyValue.java:26)
        at io.quarkus.arc.impl.ComputingCache.computeIfAbsent(ComputingCache.java:69)
        at io.quarkus.arc.impl.AbstractSharedContext.get(AbstractSharedContext.java:26)
        at io.quarkus.arc.impl.ClientProxies.getApplicationScopedDelegate(ClientProxies.java:17)
        at oda.operators.QuarkusOperator_ClientProxy.arc$delegate(QuarkusOperator_ClientProxy.zig:67)
        at oda.operators.QuarkusOperator_ClientProxy.run(QuarkusOperator_ClientProxy.zig:126)
        at io.quarkus.runtime.ApplicationLifecycleManager.run(ApplicationLifecycleManager.java:122)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:66)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:42)
        at oda.operators.QuarkusOperator.main(QuarkusOperator.java:22)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at io.quarkus.runner.bootstrap.StartupActionImpl$3.run(StartupActionImpl.java:134)
        at java.base/java.lang.Thread.run(Thread.java:834)

2021-06-08 15:57:04,169 INFO  [io.qua.it.ope.cli.run.OpenShiftClientProducer] (Quarkus Main Thread) Closing OpenShift client
2021-06-08 15:57:04,171 INFO  [io.quarkus] (Quarkus Main Thread) rabbitmq-user-operator stopped in 0.218s
```
