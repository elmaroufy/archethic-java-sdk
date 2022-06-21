package com.elmaroufy.archethic.client;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Environement {
    TESTNET (""),
    MAINNET(""),
    DEVNET("");

    private String url;
}
