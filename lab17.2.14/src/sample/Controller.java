package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField a;

    @FXML
    private TextField b;

    @FXML
    private TextField sum;

    @FXML
    public void buttonTwoActionPerformed(ActionEvent event) {
        a.setText("");
        b.setText("");
        sum.setText("");
    }
    @FXML
    public void buttonOneActionPerformed(ActionEvent event) {
        float a1= Float.parseFloat(a.getText());
        float b1= Float.parseFloat(b.getText());
        float sum1= a1+b1;
        sum.setText(String.valueOf(sum1));
    }

    }



