package appSwing.gui;


import appSwing.business.WorkerManager;
import appSwing.entity.Worker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 * - Hauptformular zum Anzeigen
 * - Es enthält Schaltflächen zum Bearbeiten der Kontaktliste und zeigt dieselben Kontakte an.
 */

public class WorkerFrame extends JFrame implements ActionListener {
    private static final String LOAD = "LOAD";
    private static final String ADD = "ADD";
    private static final String EDIT = "EDIT";
    private static final String DELETE = "DELETE";

    private final WorkerManager workerManager = new WorkerManager();
    private final JTable workerTable = new JTable();

    // В конструкторе мы создаем нужные элементы
    public WorkerFrame() {
        // Выставляем у таблицы свойство, которое позволяет выделить
        // ТОЛЬКО одну строку в таблице
        workerTable.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        // Используем layout manager
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        // Каждый элемент является последним в строке
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        // Элемент раздвигается на весь размер ячейки
        gbc.fill = GridBagConstraints.BOTH;
        // Но имеет границы - слева, сверху и справа по 5. Снизу - 0
        gbc.insets = new Insets(5, 5, 0, 5);

        // Создаем панель для кнопок
        JPanel btnPanel = new JPanel();
        // усанавливаем у него layout
        btnPanel.setLayout(gridbag);
        // Создаем кнопки
        btnPanel.add(createButton(gridbag, gbc, "Обновить", LOAD));
        btnPanel.add(createButton(gridbag, gbc, "Добавить", ADD));
        btnPanel.add(createButton(gridbag, gbc, "Исправить", EDIT));
        btnPanel.add(createButton(gridbag, gbc, "Удалить", DELETE));

        // Создаем панель для левой колокни с кнопками
        JPanel left = new JPanel();
        // Выставляем layout BorderLayout
        left.setLayout(new BorderLayout());
        // Кладем панель с кнопками в верхнюю часть
        left.add(btnPanel, BorderLayout.NORTH);
        // Кладем панель для левой колонки на форму слева - WEST
        add(left, BorderLayout.WEST);

        // Кладем панель со скролингом, внутри которой нахоится наша таблица
        // Теперь таблица может скроллироваться
        add(new JScrollPane(workerTable), BorderLayout.CENTER);

        // выставляем координаты формы
        setBounds(100, 200, 900, 400);
        // При закрытии формы заканчиваем работу приложения
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Загружаем контакты
        loadWorker();
    }

    // Метод создает кнопку с заданными харктеристиками - заголовок и действие
    private JButton createButton(GridBagLayout gridbag, GridBagConstraints gbc, String title, String action) {
        // Создаем кнопку с заданным загловком
        JButton button = new JButton(title);
        // Действие будетп роверяться в обработчике и мы будем знать, какую
        // именно кнопку нажали
        button.setActionCommand(action);
        // Обработчиком события от кнопки являемся сама форма
        button.addActionListener(this);
        // Выставляем свойства для размещения для кнопки
        gridbag.setConstraints(button, gbc);
        return button;
    }

    @Override
    // Обработка нажатий кнопок
    public void actionPerformed(ActionEvent ae) {
        // Получаем команду - ActionCommand
        String action = ae.getActionCommand();
        // В зависимости от команды выполняем действия
        switch (action) {
            // Перегрузка данных
            case LOAD:
                loadWorker();
                break;
            // Добавление записи
            case ADD:
                loadWorker();
                break;
            // Исправление записи
            case EDIT:
                loadWorker();
                break;
            // Удаление записи
            case DELETE:
                loadWorker();
                break;
        }
    }

    // Загрухить список контактов
    private void loadWorker() {
        // Обращаемся к классу для загрузки списка контактов
        List<Worker> workers = workerManager.findWorkers();
        // Создаем модель, которой передаем полученный список
        WorkerModel wm = new WorkerModel(workers);
        // Передаем нашу модель таблице - и она может ее отображать
        workerTable.setModel(wm);
    }

    // Добавление контакта
    private void addWorker() {
        // Создаем диалог для ввода данных
        EditWorkerDialog ewd = new EditWorkerDialog();
        // Обрабатываем закрытие диалога
        saveWorker(ewd);
    }

    // Редактирование контакта
    private void editWorker() {
        // Получаем выделеннуб строку
        int sr = workerTable.getSelectedRow();
        // если строка выделена - можно ее редактировать
        if (sr != -1) {
            // Получаем ID контакта
            Long id = Long.parseLong(workerTable.getModel().getValueAt(sr, 0).toString());
            // получаем данные контакта по его ID
            Worker wrk = workerManager.getWorker(id);
            // Создаем диалог для ввода данных и передаем туда контакт
            EditWorkerDialog ewd = new EditWorkerDialog(wrk);
            // Обрабатываем закрытие диалога
            saveWorker(ewd);
        } else {
            // Если строка не выделена - сообщаем об этом
            JOptionPane.showMessageDialog(this, "Вы должны выделить строку для редактирования");
        }
    }

    // Удаление контакта
    private void deleteWorker() {
        // Получаем выделеннуб строку
        int sr = workerTable.getSelectedRow();
        if (sr != -1) {
            // Получаем ID контакта
            Long id = Long.parseLong(workerTable.getModel().getValueAt(sr, 0).toString());
            // Удаляем контакт
            workerManager.deleteWorker(id);
            // перегружаем список контактов
            loadWorker();
        } else {
            JOptionPane.showMessageDialog(this, "Вы должны выделить строку для удаления");
        }
    }

    // Общий метод для добавления и изменения контакта
    private void saveWorker(EditWorkerDialog ewd) {
        // Если мы нажали кнопку SAVE
        if (ewd.isSave()) {
            // Получаем контакт из диалогового окна
            Worker wrk = ewd.getWorker();
            if (wrk.getWorkerId() != null) {
                // Если ID у контакта есть, то мы его обновляем
                workerManager.updateWorker(wrk);
            } else {
                // Если у контакта нет ID - значит он новый и мы его добавляем
                workerManager.addWorker(wrk);
            }
            loadWorker();
        }
    }
}
