package com.example.demo.dao;

import com.example.demo.vo.MmbrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FirstDAO {
    List<MmbrVO> selectMmbrList();
}

