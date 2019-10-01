package test;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import business.WorkerManager;
import entity.Worker;

public class WorkerTest {

	public static void main(String[] args) {
		WorkerManager wm = new WorkerManager();
		Worker w1 = new Worker("Андрей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru", LocalDate.of(2000, Month.DECEMBER, 2), 'M',"Developer", true);
		Worker w2 = new Worker("Андрей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru", LocalDate.of(2000, Month.DECEMBER, 2), 'M',"Developer", true);
		Worker w3 = new Worker("Андрей", "Соколов", "+7-911-890-7766", "sokolov@yandex.ru", LocalDate.of(2000, Month.DECEMBER, 2), 'M',"Developer", true);
 
        System.out.println("ADD Worker ==============");
        Long wId1 = wm.addWorker(w1);
        Long wId2 = wm.addWorker(w2);
        Long wId3 = wm.addWorker(w3);
        List<Worker> result1 = wm.findWorkers();
        for(Worker w : result1) {
            System.out.println(w);
        }
        
        System.out.println("UPDATE Worker ==============");
        Worker change = new Worker(wId1, "Ggegor", "Соколов", "+7-911-890-7766", "Ggegor@yandex.ru", LocalDate.of(2000, Month.DECEMBER, 2), 'M',"Developer", true);
        wm.updateWorker(change);
        List<Worker> result2 = wm.findWorkers();
        for(Worker w : result2) {
            System.out.println(w);
        }
        
        System.out.println("DELETE Worker ==============");
        wm.deleteWorker(wId1);
        List<Worker> result3 = wm.findWorkers();
        for(Worker w : result3) {
            System.out.println(w);
        }
 
        System.out.println("GET Worker ==============");
        Worker worker = wm.getWorker(wId2);
        System.out.println(worker);
	}
}
