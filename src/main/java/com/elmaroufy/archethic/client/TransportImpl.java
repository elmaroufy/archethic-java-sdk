package com.elmaroufy.archethic.client;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class TransportImpl implements Transport{


    public TransportImpl(Executor executor, CloseableHttpClient httpClient) {
        this.executor = executor;
        this.httpClient = httpClient;
    }

    private final Executor executor;
    private final CloseableHttpClient httpClient;

    @Override
    public CompletableFuture<String> invoke(OperationType operationType, String path, String jsonRequest) {
        return CompletableFuture.supplyAsync(() -> {
            final HttpUriRequest request;
            switch (operationType) {
                case POST:
                    request = new HttpPost(getRequestUrl(path));
                    break;
                default:
                    throw new UnsupportedOperationException("Unsupported Operation: " + operationType);
            }
            return processInvoke(jsonRequest, request);
        }, executor);
    }

    private String getRequestUrl(String path) {
        try {
            //TODO use a parameterized url
            return URI.create(Environement.DEVNET.getUrl()).resolve(path).toURL().toString();
        } catch (final MalformedURLException e) {
            throw new RuntimeException(e);
            //TODO handle errors
        }
    }

    private String processInvoke(String jsonRequest,  HttpUriRequest request) {
        //TODO, this is just an example of performing http call -> to develop
        //TODO handle errors
        try {
            ((HttpEntityEnclosingRequestBase) request).setEntity(new StringEntity(jsonRequest, ContentType.APPLICATION_JSON));
            HttpResponse response = httpClient.execute(request);
            return EntityUtils.toString(response.getEntity());
        } catch (ClientProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
