package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.util.Callback;

import static javafx.geometry.Pos.CENTER_LEFT;


public class ListController {

    @FXML
    private ListView<Email> listView;

    private Model model;

    public void initModel(Model model) {
        // ensure model is only set once:
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model ;

        model.creaEmail();
        //passo una lista di observable alla listview e il metodo setItem me le mette da solo dove devono stare
        listView.setItems(model.getEmailList());

        //quando clicco su una mail il suo contenuto viene mostrato
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Email>() {
            @Override
            public void changed(ObservableValue<? extends Email> observableValue, Email oldSelection, Email newSelection) {
                if (newSelection!=null)
                    model.setCurrentEmail(newSelection);
                if(model.getEmailList().isEmpty())
                    model.setCurrentEmail(null);//metto questa cosa in modo tale che quando la lista è vuota la email corrente venga messa a null e non rimanga l'ultima selezionata
            }
        });

        //setCellFactory è una fabbrica di Celle dove definisco il layout do ogni cella della ListView
        //ha come parametro la ListView e ritorna la ListCell
        listView.setCellFactory((ListView<Email> param)   -> {
            return new ListCell<Email>() {
                @Override
                protected void updateItem(Email email, boolean empty) {
                    super.updateItem(email, empty);

                    if (email == null || empty) {
                        setText(null);
                        setGraphic(null);//se non faccio setGraphic(null) non pulisce la grafica!!!!!
                    } else {

                        // Creo il layout per ogni cella
                        HBox root = new HBox(10);
                        root.setAlignment(CENTER_LEFT);
                        root.setPadding(new Insets(5, 10, 5, 10));

                        // Dentro la radice metto una label con l'email
                        root.getChildren().add(new Label(email.toString()));

                        // Serve per separare il bottone dalla label che mostra le email
                        Region region = new Region();
                        HBox.setHgrow(region, Priority.ALWAYS);
                        root.getChildren().add(region);

                        // creo il bottone e definisco l'azione onAction
                        Button btnRemove = new Button("Elimina");
                        btnRemove.setOnAction(event -> {
                            if (!model.getEmailList().isEmpty() ){
                                model.getEmailList().remove(email);
                            }
                        });

                        root.getChildren().add(btnRemove);


                        // Finally, set our cell to display the root HBox
                        setText(null);
                        setGraphic(root);
                    }
                }
            };
        });



    }


}