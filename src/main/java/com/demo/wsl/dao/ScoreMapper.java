package com.demo.wsl.dao;

import com.demo.wsl.model.Score;
import java.util.List;

public interface ScoreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Score record);

    Score selectByPrimaryKey(Long id);

    List<Score> selectAll();

    int updateByPrimaryKey(Score record);
}