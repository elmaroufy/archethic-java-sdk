package com.elmaroufy.archethic.client;

import com.elmaroufy.archethic.model.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ArchethicApi {

    public CompletableFuture<TransactionStatus> sendTransaction(Transaction transaction) {
        return null;
    }

    public CompletableFuture<Transaction> getLastTransaction(String address) {
        return null;
    }

    public CompletableFuture<String> getStorageNoncePublicKey() {
        return null;
    }

    public CompletableFuture<Balance> fetchBalance(String address) {
        return null;
    }

    public CompletableFuture<String> getTransactionContent(String address) {
        return null;
    }

    public CompletableFuture<List<Transaction>> getTransactionChain(String address, int page) {
        return null;
    }

    public CompletableFuture<List<Node>> getNodeList() {
        return null;
    }

    public CompletableFuture<List<Transaction>> networkTransactions(String type, int page) {
        return null;
    }

    public CompletableFuture<List<TransactionInput>> getTransactionInputs(String address) {
        return null;
    }

    public CompletableFuture<String> createKeychain(String passphrase, String originPrivateKey) {
        return null;
    }

    public CompletableFuture<Transaction> getTransactionAllInfos(String address) {
        return null;
    }

    public CompletableFuture<TransactionFee> getTransactionFee(Transaction transaction) {
        return null;
    }

    public CompletableFuture<String> lastAddressFromSeed(String seed) {
        return null;
    }

    public CompletableFuture<String> lastAddressFromAddress(String address) {
        return null;
    }

    public CompletableFuture<OracleUcoPrice> getLastOracleUcoPrice() {
        return null;
    }
}
