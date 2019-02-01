package dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import pojo.TestPojo;

import java.util.List;
@Repository
public interface TestDao {

    @Select("select * from test")
    public List<TestPojo> findAll();
}
