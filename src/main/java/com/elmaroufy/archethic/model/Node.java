package com.elmaroufy.archethic.model;

import lombok.Data;

@Data
public class Node {

    private Boolean authorized;
    private Boolean available;
    private Double averageAvailability;
    private String firstPublicKey;
    private String geoPatch;
    private String ip;
    private String lastPublicKey;
    private String networkPatch;
    private Integer port;
    private String rewardAddress;
    private Integer enrollmentDate;
    private Integer authorizationDate;
}
