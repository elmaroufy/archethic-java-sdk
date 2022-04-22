package com.elmaroufy.archethic.model;

import com.elmaroufy.archethic.model.enums.TransactionInputType;
import lombok.Data;

@Data
public class TransactionInput {

    private Double amount;
    private String from;
    private String nftAddress;
    private Boolean spent;
    private Integer timestamp;
    private TransactionInputType type;
}
