package edu.neusoft.ssmDemo.model.dao;


import edu.neusoft.ssmDemo.model.vo.Worker;

import java.util.List;

public interface WorkerMapper {
    Worker selectByNameAndPwd(Worker worker);

    void insertWorker(Worker worker);

    List<Worker> selectAll();

    void updateWorker(Worker worker);

    void deleteByWid(Integer wid);
}
