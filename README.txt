
Window--

edit
kafka-folder->config - zookeeper.properties
dataDir=F:/kafka_2.13-3.2.1/zookeeper-data

kafka-folder->config - server.properties
log.dirs=F:/kafka_2.13-3.2.1/kafka-logs

start zookeeper:
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start server:
.\bin\windows\kafka-server-start.bat .\config\server.properties

Note: model in both producer and consumer has same package
