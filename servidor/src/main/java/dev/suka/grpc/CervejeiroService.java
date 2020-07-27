package dev.suka.grpc;

import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;

public class CervejeiroService extends CervejeiroGrpc.CervejeiroImplBase {

    @Override
    public void getCerveja(Empty request, StreamObserver<Cerveja> responseObserver) {
        Cerveja cerva = Cerveja.newBuilder()
                .setNome("Heineken")
                .setTipo(Cerveja.TipoCerva.CERVEJA_GRINGA)
                .build();
        responseObserver.onNext(cerva);
        responseObserver.onCompleted();
    }


}
