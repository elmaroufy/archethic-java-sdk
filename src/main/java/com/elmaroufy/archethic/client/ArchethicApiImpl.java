package com.elmaroufy.archethic.client;

import com.elmaroufy.archethic.model.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ArchethicApiImpl implements ArchethicApi{
    @Override
    public CompletableFuture<TransactionStatus> sendTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public CompletableFuture<Transaction> getLastTransaction(String address) {
        return null;
    }

    @Override
    public CompletableFuture<String> getStorageNoncePublicKey() {
        return null;
    }

    @Override
    public CompletableFuture<Balance> fetchBalance(String address) {
        return null;
    }

    @Override
    public CompletableFuture<String> getTransactionContent(String address) {
        return null;
    }

    @Override
    public CompletableFuture<List<Transaction>> getTransactionChain(String address, int page) {
        return null;
    }

    @Override
    public CompletableFuture<List<Node>> getNodeList() {
        return null;
    }

    @Override
    public CompletableFuture<List<Transaction>> networkTransactions(String type, int page) {
        return null;
    }

    @Override
    public CompletableFuture<List<TransactionInput>> getTransactionInputs(String address) {
        return null;
    }

    @Override
    public CompletableFuture<String> createKeychain(String passphrase, String originPrivateKey) {
        return null;
    }

    @Override
    public CompletableFuture<Transaction> getTransactionAllInfos(String address) {
        return null;
    }

    @Override
    public CompletableFuture<TransactionFee> getTransactionFee(Transaction transaction) {
        return null;
    }

    @Override
    public CompletableFuture<String> lastAddressFromSeed(String seed) {
        return null;
    }

    @Override
    public CompletableFuture<String> lastAddressFromAddress(String address) {
        return null;
    }

    @Override
    public CompletableFuture<OracleUcoPrice> getLastOracleUcoPrice() {
        return null;
    }
}
