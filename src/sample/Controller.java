package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

        @FXML
        private Circle circle;

        @FXML
        private TextField txt_email;

        @FXML
        private PasswordField txt_password;

        @FXML
        private Button btn_login;

        @FXML
        void btn_click(ActionEvent event) {
            if (txt_email.getText().equals("ege@mail.com") && txt_password.getText().equals("123456")) {
                System.out.println("Giriş Başarılı!");
            }else{
                System.out.println("Hatalı Giriş!");
            }
        }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image img = new Image("sample/useravatar.jpg");
        circle.setFill(new ImagePattern(img));
    }
}
