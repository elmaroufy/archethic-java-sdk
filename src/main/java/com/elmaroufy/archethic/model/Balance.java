package com.elmaroufy.archethic.model;

import lombok.Data;

import java.util.List;

@Data
public class Balance {

    private List<NftBalance> nft;
    private Double uco;
}
