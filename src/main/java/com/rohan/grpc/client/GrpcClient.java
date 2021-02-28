package com.rohan.grpc.client;

import com.rohan.grpc.HelloRequest;
import com.rohan.grpc.HelloResponse;
import com.rohan.grpc.HelloServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
            .usePlaintext()
            .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub 
          = HelloServiceGrpc.newBlockingStub(channel);


        String firstName = "Rohan";
        String secondName = "Goyal";

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
            .setFirstName(firstName)
            .setLastName(secondName)
            .build());

        System.out.println("Response received from server:\n" + helloResponse);

        channel.shutdown();
    }
}
