package com.example.assignment.domain;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardVO {
    private Long assId;
    private String assTitle;
    private String assCont;
    private Timestamp regDate;
    private Timestamp modDate;
}
