package appSwing.gui;

import appSwing.entity.Worker;

import javax.swing.table.AbstractTableModel;
import java.util.List;

/**
 * - Diese Klasse dient zum Anzeigen der Kontakttabelle.
 */
public class WorkerModel extends AbstractTableModel {
    // Список загловков для колонок в таблице
    private static final String[] headers = {"ID", "Vorname", "Nachname", "Handy", "Email", "Geburtsdatum", "Sex", "Position", "Verheiratet"};

    // Здесь мы храним список контактов, которые будем отображать в таблице
    private final List<Worker> workers;

    public WorkerModel(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    // Получить количество строк в таблице - у нас это размер коллекции
    public int getRowCount() {
        return workers.size();
    }

    @Override
    // Получить количество столбцов - их у нас стольк же, сколько полей
    // у класса Worker - 9
    public int getColumnCount() {
        return 9;
    }

    @Override
    // Вернуть загловок колонки - мы его берем из массива headers
    public String getColumnName(int col) {
        return headers[col];
    }

    @Override
    // Получить объект для отображения в кокнретной ячейке таблицы
    // В данном случае мы отдаем строковое представление поля
    public Object getValueAt(int row, int col) {
        Worker worker = workers.get(row);
        // В зависимости от номера колонки возвращаем то или иное поле контакта
        switch (col) {
            case 0:
                return worker.getWorkerId().toString();
            case 1:
                return worker.getFirstName();
            case 2:
                return worker.getLastName();
            case 3:
                return worker.getEmail();
            case 4:
                return worker.getDateOfBirth();
            case 5:
                return worker.getSex();
            case 6:
                return worker.getPosition();
            case 7:
                return worker.isMarried();
            default:
                return worker.getPhone();
        }
    }
}
