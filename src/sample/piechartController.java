package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class piechartController implements Initializable {
    @FXML
    private PieChart piechart;
    private void loadData(){

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<PieChart.Data>list= FXCollections.observableArrayList();
        list.add(new PieChart.Data("Vetement",100000));
        list.add(new PieChart.Data("Nourriture",50000));
        list.add(new PieChart.Data("Carburant",25000));
        list.add(new PieChart.Data("Loisir",70000));
        list.add(new PieChart.Data("Medicament",5000));
        piechart.setTitle("Suivie de Depense");
        piechart.setData(list);



    }
    public void dash(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
