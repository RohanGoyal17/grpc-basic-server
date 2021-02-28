# grpc-basic-server

How to run<br><br>

Install the project
```
$ mvn clean compile install
```

Run Server
```
$ mvn exec:java -Dexec.mainClass=com.rohan.grpc.server.GrpcServer
```

Send Request from client to the server and observe the response
```
$ mvn exec:java -Dexec.mainClass=com.rohan.grpc.client.GrpcClient
```
