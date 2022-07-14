package com.elmaroufy.archethic.client;

import java.util.concurrent.CompletableFuture;

public class ApiClient {

    private final Transport transport;

    public ApiClient(Transport transport) {
        this.transport = transport;
    }


    public <T> CompletableFuture<T> postAsync(String path, Class<T> responseType, Object request) {
        return invokeAsync(OperationType.POST, path, request, responseType);
    }

    private <T> CompletableFuture<T> invokeAsync(OperationType operation, String path, Object request, Class<T> responseType) {
        return transport.invoke(operation, path, getObjectAsJson(request)).thenApply(r -> getJsonAsObject(r, responseType));
    }

    private String getObjectAsJson(Object request) {
        //TODO to develop
        return null;
    }

    private <T> T getJsonAsObject(Object response, Class<T> responseType ) {
        //TODO to develop
        return null;
    }
}
