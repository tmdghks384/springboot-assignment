package com.example.assignment.controller;

import com.example.assignment.domain.BoardVO;
import com.example.assignment.service.BoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/board/*")
@RequiredArgsConstructor
@Log4j2
public class BoardController {
    private final BoardService boardService;

    @GetMapping({"/list", "/"})
    public String boardList(Model model) {
        model.addAttribute("board", boardService.listBoard());
        return "boardList";
    }

    @GetMapping("/read/{assId}")
    public String readBoard(@PathVariable(value = "assId") String assId, Model model) {
        BoardVO vo = boardService.readBoard(assId);
        model.addAttribute("dto", vo);
        return "boardRead";
    }

    @GetMapping("/write")
    public String boardWrite() {
        return "boardWrite";
    }

    @GetMapping("/update/{assId}")
    public String boardUpdate(@PathVariable(value = "assId") String assId, Model model){
        BoardVO vo = boardService.readBoard(assId);
        model.addAttribute("dto", vo);
        return "boardWrite";
    }
}
