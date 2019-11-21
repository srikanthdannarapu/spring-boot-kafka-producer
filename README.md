# spring-boot-kafka-producer

# run zookeeper
navigate to C:\Program Files\kafka_2.12-2.3.1\bin\windows new cmd

run the below command to start zookeeper instance

zookeeper-server-start.bat C:\Users\sreekanth\Desktop\kafka_2.12-2.3.1\config\zookeeper.properties


# run kafka server
navigate to C:\Program Files\kafka_2.12-2.3.1\bin\windows on new cmd

run the below command to start kafka server
kafka-server-start.bat C:\Users\sreekanth\Desktop\kafka_2.12-2.3.1\config\server.properties

# run kafka consumer
check consumer message sent by producer by running below command on new cmd 

navigate to C:\Users\sreekanth\Desktop\kafka_2.12-2.3.1\bin\windows 

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic SRI_TOPIC <topic name>