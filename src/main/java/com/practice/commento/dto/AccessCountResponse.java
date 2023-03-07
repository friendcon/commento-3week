package com.practice.commento.dto;

import lombok.Data;

@Data
public class AccessCountResponse {
    private String statusCode;
    private String accessType;
    private String dateType;
    private String date;
    private int accessCount;
}
