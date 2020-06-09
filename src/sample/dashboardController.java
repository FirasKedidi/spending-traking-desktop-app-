package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class dashboardController implements Initializable {
    @FXML private ComboBox<String>cb;
    private ObservableList<String> list= FXCollections.observableArrayList("Medicament","Transport","Carburant","Nourriture","Loisir");
    @FXML private TextField tx;
    @FXML private DatePicker dp;
    public void diagramme(ActionEvent actionEvent) throws IOException{
        Parent root= FXMLLoader.load(getClass().getResource("diagramme.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    public void historique(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("historique.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        cb.setItems(list);
    }
    public void insertData(ActionEvent event){
        LocalDate date=dp.getValue();
        String d=date.toString();
    }

}

