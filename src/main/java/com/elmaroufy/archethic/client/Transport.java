package com.elmaroufy.archethic.client;

import java.util.concurrent.CompletableFuture;

public interface Transport {

    CompletableFuture<String> invoke(OperationType operationType, String path, String jsonRequest);

}
