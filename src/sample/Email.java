package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author liliana
 */
public class Email {
    //property id
    private final StringProperty id = new SimpleStringProperty();
    public final StringProperty idProperty() {
        return this.id;
    }
    public final String getId() {
        return this.idProperty().get();
    }
    public final void setId(final String id) {
        this.idProperty().set(id);
    }

    //property mittente
    private final StringProperty mittente = new SimpleStringProperty();
    public final StringProperty mittenteProperty(){
        return this.mittente;
    }
    public final String getMittente(){
        return this.mittenteProperty().get();
    }
    public final void setMittente(final String mittente){
        this.mittenteProperty().set(mittente);
    }

    //property destinatario
    private final StringProperty destinatario = new SimpleStringProperty();
    public final StringProperty destinatarioProperty() {
        return this.destinatario;
    }
    public final String getDestinatario() {
        return this.destinatarioProperty().get();
    }
    public final void setDestinatario(final String destinatario) {
        this.destinatarioProperty().set(destinatario);
    }

    //property argomento
    private final StringProperty argomento = new SimpleStringProperty();
    public final StringProperty argomentoProperty() {
        return this.argomento;
    }
    public final String getArgomento() {
        return this.argomentoProperty().get();
    }
    public final void setArgomento(final String argomento) {
        this.argomentoProperty().set(argomento);
    }
    //property testo
    private final StringProperty testo = new SimpleStringProperty();
    public final StringProperty testoProperty() {
        return this.testo;
    }
    public final String getTesto() {
        return this.testoProperty().get();
    }
    public final void setTesto(final String testo) {
        this.testoProperty().set(testo);
    }

    public Email(String id, String mittente, String destinatario, String argomento, String testo) {
        setId(id);
        setMittente(mittente);
        setDestinatario(destinatario);
        setArgomento(argomento);
        setTesto(testo);

    }

    @Override
    public String toString() {
        return getMittente()+ "\n" + getArgomento();
    }
}
