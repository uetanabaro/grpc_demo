package dev.suka;


import dev.suka.grpc.CervejeiroService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        final Server server = ServerBuilder.forPort(8080)
                .addService(new CervejeiroService())
                //.addService(ProtoReflectionService.newInstance())
                .build()
                .start();


        server.awaitTermination();

    }
}
