package com.example.demo.dao;

import com.example.demo.vo.NewsEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface INewsDAO {
    public List<NewsEntity> listNews();
}
