package appSwing.dao;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import appSwing.entity.Worker;

/**
 * - Modellierung/Realisierung von Speicher(WorkerDAO)
 * Student
 * @author vitali orlioglo
 * 01.10.2019
 * Department
 */


public class WorkerSimpleDAO implements WorkerDAO {
	private final List<Worker> workers = new ArrayList<Worker>();

	public WorkerSimpleDAO() {
		addWorker(new Worker("Андрей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru", LocalDate.of(2000, Month.DECEMBER, 2), 'M',"Developer", true));
	}

	@Override
	public Long addWorker(Worker worker) {
        Long id = generateWorkerId();
        worker.setWorkerId(id);
        workers.add(worker);
        return id;
	}

	@Override
	public void updateWorker(Worker worker) {
		Worker oldWorker = getWorker(worker.getWorkerId());
        if(oldWorker != null) {
        	oldWorker.setFirstName(worker.getFirstName());
        	worker.setLastName(worker.getLastName());
        	worker.setPhone(worker.getPhone());
        	worker.setEmail(worker.getEmail());
        }
	}

	@Override
	public void deleteWorker(Long workerId) {
		for (Iterator<Worker> iterator = workers.iterator(); iterator.hasNext();) {
			Worker worker = (Worker) iterator.next();
			if(worker.getWorkerId().equals(workerId)) {
				iterator.remove();
            }
		}
	}

	@Override
	public Worker getWorker(Long workerId) {
		for(Worker worker : workers) {
            if(worker.getWorkerId().equals(workerId)) {
                return worker;
            }
        }
		return null;
	}

	@Override
	public List<Worker> findWorkers() {
		return workers;
	}
	
    private Long generateWorkerId() {
        Long workerId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while(getWorker(workerId) != null) {
        	workerId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return workerId;
    }
}
