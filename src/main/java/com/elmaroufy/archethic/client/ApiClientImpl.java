package com.elmaroufy.archethic.client;

import java.util.concurrent.CompletableFuture;

public class ApiClientImpl implements ApiClient{

    @Override
    public <T> CompletableFuture<T> postAsync(String path, Class<T> responseType, Object request) {
        return null;
    }
}
