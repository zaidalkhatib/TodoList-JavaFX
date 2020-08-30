package ZaidsTodoList;

import ZaidsTodoList.dataModel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoList;
    @FXML
    private TextArea showArea;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private Label Date;

    public void initialize()
    {
        TodoItem item = new TodoItem("code", "Write 10000 lines of code", LocalDate.of(2020, 12, 21));
        TodoItem item2 = new TodoItem("Finish projects", "Get my school projects done", LocalDate.of(2020, 12, 4));
        TodoItem item5 = new TodoItem("workout", "Go to the gym and workout", LocalDate.of(2021, 1, 1));
        todoList = new ArrayList<>();
        todoList.add(item);
        todoList.add(item2);
        todoList.add(item5);
        todoListView.getItems().setAll(todoList);
        todoListView.getSelectionModel().selectFirst();

        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    public void handleMouseClicked()
    {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        showArea.setText(item.getDetails());
        Date.setText(item.getDate().toString());

    }
}
