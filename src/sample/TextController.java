package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.awt.*;

public class TextController {

    @FXML
    private Label label;

    @FXML
    private Label mittenteID;

    @FXML
    private Label argomentoID;

    private Model model;

    public void initModel(Model model){

        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model ;
        model.creaEmail();
        model.currentEmailProperty().addListener(
                ((observableValue, oldEmail, newEmail) ->{

                    if (newEmail == null ) {
                        label.setText("");

                    } else {
                        label.textProperty().bind(newEmail.testoProperty());
                        mittenteID.textProperty().bind(newEmail.mittenteProperty());
                        argomentoID.textProperty().bind(newEmail.argomentoProperty());
                    }
                } )
        );
    }

}

