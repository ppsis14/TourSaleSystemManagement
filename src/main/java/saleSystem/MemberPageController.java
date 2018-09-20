package saleSystem;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MemberPageController {
    @FXML
    private JFXButton memberHomeBtn;

    @FXML
    void handleBackHomeFromMemberBtn(ActionEvent event) throws IOException {
        memberHomeBtn.getScene().getWindow().hide();
        Stage memberToHomeWindow = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/homePage.fxml"));
        Scene scene = new Scene(root);
        memberToHomeWindow.setScene(scene);
        memberToHomeWindow.show();
        memberToHomeWindow.setResizable(false);

    }


}
