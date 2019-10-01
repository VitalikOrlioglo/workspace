package appSwing.dao;

/**
 * - Design Pattern Abstract Factory
 * - Das Anlegen eines Datenbank erfolgt nur in dieser Klasse
 * - um nicht in mehreren Klassen zu wechseln, wenn wir den Datenbankandern wollen
 * - WorkerDAO Instance Factory
 * Student
 * @author vitali orlioglo
 * 01.10.2019
 * Department
 */
public class WorkerDAOFactory {
	public static WorkerDAO getWorkerDAO() {
        return new WorkerSimpleDAO();
    }
}
