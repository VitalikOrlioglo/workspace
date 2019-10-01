package dao;

import java.util.List;
import entity.Worker;

/**
 * - Interaktion der WorkerManager mit DataBanken uber ein Interface
 * - Interface muss von allen DataBanken implementiert werden
 * - so gemacht, weil Datenbanken konnen unterschiedlich sein
 * - Um mit jedem Speichertyp arbeiten zu können, haben wir eine Schnittstelle erstellt
 * Student
 * @author vitali orlioglo
 * 01.10.2019
 * Department
 */

public interface WorkerDAO {
	// Gibt die ID des hinzugefugten Kontakts zuruck
    public Long addWorker(Worker worker);
    public void updateWorker(Worker worker);
    // loschen eintrag durch ID
    public void deleteWorker(Long workerId);
    public Worker getWorker(Long workerId);
    // Kontaktliste erhalten
    public List<Worker> findWorkers();
}
