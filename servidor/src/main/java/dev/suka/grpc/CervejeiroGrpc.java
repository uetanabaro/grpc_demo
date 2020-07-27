package dev.suka.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 *
 */
@javax.annotation.Generated(
        value = "by gRPC proto compiler (version 1.32.0-SNAPSHOT)",
        comments = "Source: mensagem.proto")
public final class CervejeiroGrpc {

  private CervejeiroGrpc() {
  }

  public static final String SERVICE_NAME = "grpc.channelz.v1.Cervejeiro";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
          dev.suka.grpc.Cerveja> getGetCervejaMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "getCerveja",
          requestType = com.google.protobuf.Empty.class,
          responseType = dev.suka.grpc.Cerveja.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
          dev.suka.grpc.Cerveja> getGetCervejaMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, dev.suka.grpc.Cerveja> getGetCervejaMethod;
    if ((getGetCervejaMethod = CervejeiroGrpc.getGetCervejaMethod) == null) {
      synchronized (CervejeiroGrpc.class) {
        if ((getGetCervejaMethod = CervejeiroGrpc.getGetCervejaMethod) == null) {
          CervejeiroGrpc.getGetCervejaMethod = getGetCervejaMethod =
                  io.grpc.MethodDescriptor.<com.google.protobuf.Empty, dev.suka.grpc.Cerveja>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCerveja"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  com.google.protobuf.Empty.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  dev.suka.grpc.Cerveja.getDefaultInstance()))
                          .setSchemaDescriptor(new CervejeiroMethodDescriptorSupplier("getCerveja"))
                          .build();
        }
      }
    }
    return getGetCervejaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CervejeiroStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CervejeiroStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<CervejeiroStub>() {
              @java.lang.Override
              public CervejeiroStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CervejeiroStub(channel, callOptions);
              }
            };
    return CervejeiroStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CervejeiroBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CervejeiroBlockingStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<CervejeiroBlockingStub>() {
              @java.lang.Override
              public CervejeiroBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CervejeiroBlockingStub(channel, callOptions);
              }
            };
    return CervejeiroBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CervejeiroFutureStub newFutureStub(
          io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CervejeiroFutureStub> factory =
            new io.grpc.stub.AbstractStub.StubFactory<CervejeiroFutureStub>() {
              @java.lang.Override
              public CervejeiroFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
                return new CervejeiroFutureStub(channel, callOptions);
              }
            };
    return CervejeiroFutureStub.newStub(factory, channel);
  }

  /**
   *
   */
  public static abstract class CervejeiroImplBase implements io.grpc.BindableService {

    /**
     *
     */
    public void getCerveja(com.google.protobuf.Empty request,
                           io.grpc.stub.StreamObserver<dev.suka.grpc.Cerveja> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCervejaMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getGetCervejaMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      com.google.protobuf.Empty,
                                      dev.suka.grpc.Cerveja>(
                                      this, METHODID_GET_CERVEJA)))
              .build();
    }
  }

  /**
   *
   */
  public static final class CervejeiroStub extends io.grpc.stub.AbstractAsyncStub<CervejeiroStub> {
    private CervejeiroStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CervejeiroStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CervejeiroStub(channel, callOptions);
    }

    /**
     *
     */
    public void getCerveja(com.google.protobuf.Empty request,
                           io.grpc.stub.StreamObserver<dev.suka.grpc.Cerveja> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getGetCervejaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   *
   */
  public static final class CervejeiroBlockingStub extends io.grpc.stub.AbstractBlockingStub<CervejeiroBlockingStub> {
    private CervejeiroBlockingStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CervejeiroBlockingStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CervejeiroBlockingStub(channel, callOptions);
    }

    /**
     *
     */
    public dev.suka.grpc.Cerveja getCerveja(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
              getChannel(), getGetCervejaMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   */
  public static final class CervejeiroFutureStub extends io.grpc.stub.AbstractFutureStub<CervejeiroFutureStub> {
    private CervejeiroFutureStub(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CervejeiroFutureStub build(
            io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CervejeiroFutureStub(channel, callOptions);
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<dev.suka.grpc.Cerveja> getCerveja(
            com.google.protobuf.Empty request) {
      return futureUnaryCall(
              getChannel().newCall(getGetCervejaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CERVEJA = 0;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CervejeiroImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CervejeiroImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CERVEJA:
          serviceImpl.getCerveja((com.google.protobuf.Empty) request,
                  (io.grpc.stub.StreamObserver<dev.suka.grpc.Cerveja>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
            io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CervejeiroBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CervejeiroBaseDescriptorSupplier() {
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dev.suka.grpc.Mensagem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cervejeiro");
    }
  }

  private static final class CervejeiroFileDescriptorSupplier
          extends CervejeiroBaseDescriptorSupplier {
    CervejeiroFileDescriptorSupplier() {
    }
  }

  private static final class CervejeiroMethodDescriptorSupplier
          extends CervejeiroBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CervejeiroMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CervejeiroGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new CervejeiroFileDescriptorSupplier())
                  .addMethod(getGetCervejaMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
