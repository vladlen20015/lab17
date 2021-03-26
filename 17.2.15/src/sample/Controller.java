package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
public class Controller {
    @FXML
    private Button butP;

    @FXML
    private Button butM;

    @FXML
    private TextField tF;

    final int[] finalTxt = {0};
    public void butPActionPerformed(ActionEvent event) {
       if(finalTxt[0]<=2){
               finalTxt[0]++;
               tF.setText(String.valueOf(finalTxt[0]));
           }
        }
    public void butMActionPerformed(ActionEvent event) {
        if(finalTxt[0] >=-4){
            finalTxt[0]--;
            tF.setText(String.valueOf(finalTxt[0]));
        }
    }
}