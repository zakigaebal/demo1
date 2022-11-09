package com.example.demo.service.impl;

import com.example.demo.dao.FirstDAO;
import com.example.demo.service.FirstService;
import com.example.demo.vo.MmbrVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FirstServiceImpl implements FirstService {

    private final FirstDAO dao;

    @Override
    public List<MmbrVO> helloWorld() {
        return dao.selectMmbrList();
    }
}


