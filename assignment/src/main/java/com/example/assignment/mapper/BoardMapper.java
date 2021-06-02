package com.example.assignment.mapper;

import com.example.assignment.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    public int insertBoard(BoardVO vo);

    public int updateBoard(BoardVO vo);

    public int deleteBoard(Long assId);

    public List<BoardVO> boardList();

    public BoardVO readBoard(String assId);
}
