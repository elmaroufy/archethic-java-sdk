package com.elmaroufy.archethic.client;

import com.elmaroufy.archethic.model.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ApiClient {

    CompletableFuture<TransactionStatus> sendTransaction(Transaction transaction);
    CompletableFuture<Transaction> getLastTransaction(String address);
    CompletableFuture<String> getStorageNoncePublicKey();
    CompletableFuture<Balance> fetchBalance(String address);
    CompletableFuture<String> getTransactionContent(String address);
    CompletableFuture<List<Transaction>> getTransactionChain(String address, int page);
    CompletableFuture<List<Node>> getNodeList();
    CompletableFuture<List<Transaction>> networkTransactions(String type, int page);
    CompletableFuture<List<TransactionInput>> getTransactionInputs(String address);
    //TODO to move
    CompletableFuture<String> createKeychain(String passphrase, String originPrivateKey);
    CompletableFuture<Transaction> getTransactionAllInfos(String address);
    CompletableFuture<TransactionFee> getTransactionFee(Transaction transaction);
    //TODO to move
    CompletableFuture<String> lastAddressFromSeed(String seed);
    CompletableFuture<String> lastAddressFromAddress(String address);
    CompletableFuture<OracleUcoPrice> getLastOracleUcoPrice();
}
