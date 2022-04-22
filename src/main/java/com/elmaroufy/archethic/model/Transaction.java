package com.elmaroufy.archethic.model;

import com.elmaroufy.archethic.model.enums.TransactionType;
import lombok.Data;

import java.util.List;

@Data
public class Transaction {
    private String address;
    private Balance balance;
    private Integer chainLength;
    private List<CrossValidationStamp> crossValidationStamps;
    private List<TransactionInput> inputs;
    private String originSignature;
    private String previousPublicKey;
    private String previousSignature;
    private TransactionType type;
    private ValidationStamp validationStamp;
    private Integer version;
}
