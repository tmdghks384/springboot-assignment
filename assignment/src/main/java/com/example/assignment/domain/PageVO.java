package com.example.assignment.domain;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;

@Getter
@ToString
@Log4j2
public class PageVO {
    private int startPage;
    private int endPage;
    private boolean prev, next;

    private int total;
    private com.example.assignment.domain.Criteria cri;

    public PageVO(com.example.assignment.domain.Criteria cri, int total) {
        this.cri = cri;
        this.total = total;
        log.info(total);
        log.info(cri);
        this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;
        this.startPage = this.endPage - 9;

        int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));

        if (realEnd < this.endPage) {
            this.endPage = realEnd;
        }

        this.prev = this.startPage > 1;
        this.next = this.endPage < realEnd;
    }
}
