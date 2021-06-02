package com.example.assignment.controller;

import com.example.assignment.domain.BoardVO;
import com.example.assignment.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/board/rest/*")
@Log4j2
@RequiredArgsConstructor
public class BoardRestController {
    private final BoardService board;

    @PostMapping("/write")
    @ResponseBody
    public ResponseEntity<String> boardWrite(@RequestBody BoardVO vo) {
        boolean isInserted = board.insertBoard(vo);
        log.info(vo);

        try {
            if (isInserted == true) {
                log.info("등록 완료");
            }
        } catch (Exception e) {
            log.warn("에러 발생");
        }
        return new ResponseEntity<>("등록 완료",HttpStatus.OK);
    }

    @PostMapping("/update/{assId}")
    public ResponseEntity<String> boardUpdate(@PathVariable(value = "assId")Long assId, @RequestBody BoardVO vo) {
        boolean isUpdated = board.updateBoard(vo);
        log.info(vo);
        try {
            if (isUpdated == true) {
                log.info("수정 완료");
            }
        } catch (Exception e) {
            log.warn("에러 발생");
        }
        return new ResponseEntity<>("수정완료", HttpStatus.OK);
    }

    @PostMapping("/delete/{assId}")
    public ResponseEntity<String> boardDelete(@PathVariable(value = "assId") Long assId) {
        boolean isDeleted = board.deleteBoard(assId);
        log.info(assId);
        try {
            if (isDeleted == true) {
                log.info("삭제 완료");
            }
        } catch (Exception e) {
            log.warn("에러 발생");
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
