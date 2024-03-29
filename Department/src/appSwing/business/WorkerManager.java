package appSwing.business;

import java.util.List;

import appSwing.dao.WorkerDAO;
import appSwing.dao.WorkerDAOFactory;
import appSwing.entity.Worker;

public class WorkerManager {
    private WorkerDAO dao;
    
    public WorkerManager() {
        dao = WorkerDAOFactory.getWorkerDAO();
    }
    
    public Long addWorker(Worker worker) {
        return dao.addWorker(worker);
    }
    
    public void updateWorker(Worker worker) {
        dao.updateWorker(worker);
    }
    
    public void deleteWorker(Long workerId) {
        dao.deleteWorker(workerId);
    }
    
    public Worker getWorker(Long workerId) {
        return dao.getWorker(workerId);
    }
    
    public List<Worker> findWorkers() {
        return dao.findWorkers();
    }
}
