package com.jmo.boardtemplate.dto.request;

import com.jmo.boardtemplate.entity.Board;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class BoardCreateRequest {
    private final String title;
    private final String content;

    public Board toEntity() {
        return Board.of(title, content);
    }
}
