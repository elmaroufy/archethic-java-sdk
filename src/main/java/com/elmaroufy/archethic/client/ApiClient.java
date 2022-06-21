package com.elmaroufy.archethic.client;

import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

public interface ApiClient {

    <T> CompletableFuture<T> postAsync(String path, Class<T> responseType, Object request);


}
