package sample;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class connectController implements Initializable {
    @FXML private TextField text1;
    @FXML private PasswordField text2;
    @FXML private Label label1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    @FXML
    public void register(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("register.fxml"));
        Scene scene=new Scene(root);
        Stage stage=(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();


    }
    @FXML

    public void login(ActionEvent actionEvent) throws SQLException {
        Connection con = (Connection) dbConnection.Connect();
        PreparedStatement stat=null;
        ResultSet re=null;
        String sql="SELECT* FROM compte WHERE username= ? AND password= ?";
        try{
            stat=con.prepareStatement(sql);
            stat.setString(1,text1.getText().toString());
            stat.setString(2,text2.getText().toString());
            re=stat.executeQuery();
            if(re.next()){
                label1.setText("Connecté");
                Parent root= FXMLLoader.load(getClass().getResource("dashboard.fxml"));
                Scene scene=new Scene(root);
                Stage stage=(Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            }else{
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Erreur");
                alert.setTitle("Alert");
                alert.setContentText("Le nom d'utilisateur ou le mot de passe est incorrecte!!!");
                alert.showAndWait();
            }
        }catch (Exception e){

        }

    }

}
