#!/bin/bash

#protoc --java_out=../java/  ./mensagem.proto

PATH_GRPC_JAVA_COMPILER=/home/sergio/apps/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java

protoc --plugin=protoc-gen-grpc-java=$PATH_GRPC_JAVA_COMPILER --grpc-java_out=../java/ --proto_path=./ mensagem.proto

#protoc --plugin=protoc-gen-grpc-java=/home/sergio/apps/grpc-java --java_out=../java/ mensagem.proto