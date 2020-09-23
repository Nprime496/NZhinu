package org.openjfx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import java.net.URL;
import java.util.ResourceBundle;

import static org.openjfx.Logic.resolve;

public class InterfcController implements Initializable {

    /**
     * Initializes the controller class.
     */

    @FXML
    private TextArea test;

    @FXML
    private Button resoudre;

    @FXML
    private TextArea resultats;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        resultats.setEditable(false);
        resoudre.setOnAction(e->{
            resultats.setText(resolve(test.getText()));
        });
    }

}
