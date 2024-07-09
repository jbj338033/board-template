package com.jmo.boardtemplate.service;

import com.jmo.boardtemplate.dto.request.BoardCreateRequest;
import com.jmo.boardtemplate.dto.response.BoardResponse;
import com.jmo.boardtemplate.entity.Board;
import com.jmo.boardtemplate.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public List<BoardResponse> getBoards() {
        List<Board> boards = boardRepository.findAll();

        return boards.stream().map(BoardResponse::of).toList();
    }

    @Transactional(readOnly = true)
    public BoardResponse getBoard(Long boardId) {
        Board board = boardRepository.findById(boardId).orElseThrow();

        return BoardResponse.of(board);
    }

    @Transactional
    public void createBoard(BoardCreateRequest request) {
        Board board = request.toEntity();

        boardRepository.save(board);
    }

    @Transactional
    public void deleteBoard(Long boardId) {
        boardRepository.deleteById(boardId);
    }
}
