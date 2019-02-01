package service.impl;

import dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.TestPojo;
import service.TestService;

import java.util.List;
@Service
@Transactional
public class TestServiceImpl implements TestService{
    @Autowired
    private TestDao dao;

    public List<TestPojo> findAll(){
        return dao.findAll();
    }
}
