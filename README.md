## How to run

1. In [application.yml](src/main/resources/application.yml), fill in the connection string and pricing tier with the values from your Azure Service Bus.
2. In [QueueReceiveService.java](src/main/java/com/example/servicebus/jms/QueueReceiveService.java), replace the value of variables `QUEUE_ONE` and `QUEUE_TWO` with your queue names in Azure Service Bus.
3. To test the forwarding function between different entities with the transacted session, you need to send messages to your `QUEUE_ONE` first, you can do it via Service Bus Explorer, which supports batching sending and is convenient.
4. In your terminal, run `mvn clean spring-boot:run`.

```shell
mvn clean spring-boot:run
```

3. Watch your `QUEUE_TWO` to see if messages are sent there successfully.