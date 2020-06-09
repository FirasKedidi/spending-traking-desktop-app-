package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class InsertController implements Initializable {
    @FXML private ComboBox<String>cb;
    private ObservableList<String> list= FXCollections.observableArrayList("1","2","3","4","5");
    @FXML private TextField tx;
    @FXML private DatePicker dp;
    //@FXML private Button btn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cb.setItems(list);

    }

}
