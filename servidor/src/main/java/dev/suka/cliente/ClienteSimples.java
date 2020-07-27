package dev.suka.cliente;

import com.google.protobuf.Empty;
import dev.suka.grpc.Cerveja;
import dev.suka.grpc.CervejeiroGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClienteSimples {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        CervejeiroGrpc.CervejeiroBlockingStub stub
                = CervejeiroGrpc.newBlockingStub(channel);

        while (true) {
            Cerveja cerveja = stub.getCerveja(Empty.newBuilder().build());
            System.out.println(cerveja);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //channel.shutdown();
    }
}
