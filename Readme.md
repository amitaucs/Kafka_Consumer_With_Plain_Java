To execute the code, A Kafka server needs to be up and running.

1. Download confluent kafka from https://www.confluent.io/get-started/?product=software
2. Go to /etc/kafka
3. Open server.properties
4. Uncomment "listeners=PLAINTEXT://0.0.0.0:9092"
5. UnComment "advertised.listeners=PLAINTEXT://localhost:9092"
6. UnComment "listener.security.protocol.map=PLAINTEXT:PLAINTEXT,SSL:SSL,SASL_PLAINTEXT:SASL_PLAINTEXT,SASL_SSL:SASL_SSL"
7. Install confluent CLI https://docs.confluent.io/confluent-cli/current/install.html#install
8. Run "confluent local services start"
9. Access cluster at http://localhost:9021/