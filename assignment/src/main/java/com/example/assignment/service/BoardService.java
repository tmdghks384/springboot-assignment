package com.example.assignment.service;

import com.example.assignment.domain.BoardVO;
import com.example.assignment.mapper.BoardMapper;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService{
    @Setter(onMethod_ = @Autowired)
    private BoardMapper mapper;

    public boolean insertBoard(BoardVO vo) {
        return mapper.insertBoard(vo) == 1;
    }

    public boolean updateBoard(BoardVO vo) {
        return mapper.updateBoard(vo) == 1;
    }

    public boolean deleteBoard(Long assId) {
        return mapper.deleteBoard(assId) == 1;
    }

    public List<BoardVO> listBoard() {
        return mapper.boardList();
    }

    public BoardVO readBoard(String assId) {
        return mapper.readBoard(assId);
    }
}
