package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import java.sql.*;

public class tableController implements Initializable {
    @FXML private TableView<depense> table;
    @FXML private TableColumn categorie;
    @FXML private TableColumn date;
    @FXML private TableColumn montant;
    public ObservableList<depense> data= FXCollections.observableArrayList();
    @FXML
    public void historique(){
        try {
            Connection con=dbConnection.Connect();
            String sql="SELECT* FROM depense";
            PreparedStatement stat=con.prepareStatement(sql);
            ResultSet rs=stat.executeQuery();
            while(rs.next()){
                data.add(new depense(rs.getString(2),rs.getDouble(3),rs.getString(4)));
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();

        }
        table.setItems(null);
    categorie.setCellValueFactory(new PropertyValueFactory<depense,String>("categorie"));
    montant.setCellValueFactory(new PropertyValueFactory<depense, Double>("montant"));
    date.setCellValueFactory(new PropertyValueFactory<depense,String>("date"));
        table.setItems(data);
    }
    public void dash(javafx.event.ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("dashboard.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
