package sample;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Button btnSetName;

    @FXML
    TextField txtName;

    @FXML
    Label lblName;

    @FXML
    protected void DisplyName(){
        lblName.setText(txtName.getText())
    }
}
