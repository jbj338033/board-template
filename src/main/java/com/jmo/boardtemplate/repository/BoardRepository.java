package com.jmo.boardtemplate.repository;

import com.jmo.boardtemplate.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
