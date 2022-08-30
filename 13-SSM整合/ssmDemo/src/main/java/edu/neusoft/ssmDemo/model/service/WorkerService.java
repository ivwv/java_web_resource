package edu.neusoft.ssmDemo.model.service;

import edu.neusoft.ssmDemo.model.dao.WorkerMapper;
import edu.neusoft.ssmDemo.model.vo.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerMapper mapper;

    public boolean login(Worker worker) {
        Worker wor=mapper.selectByNameAndPwd(worker);
        if(wor!=null){
            return true;
        }
        return false;
    }

    public void regist(Worker worker) {
        mapper.insertWorker(worker);
    }

    public List<Worker> showAll() {
        return mapper.selectAll();
    }

    public void updateWorker(Worker worker) {
        mapper.updateWorker(worker);
    }

    public void deleteWorker(Integer wid) {
        mapper.deleteByWid(wid);
    }
}
