package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author liliana
 */
public class Email {
    private String id,mittente,destinatario,argomento,testo;

    public Email(String id, String mittente, String destinatario, String argomento, String testo) {
        this.id = id;
        this.mittente = mittente;
        this.destinatario = destinatario;
        this.argomento = argomento;
        this.testo = testo;
    }

    public String getId() {
        return id;
    }

    public String getMittente() {
        return mittente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getArgomento() {
        return argomento;
    }

    public String getTesto() {
        return testo;
    }


    @Override
    public String toString() {
        return getMittente()+ "\n" + getArgomento();
    }
}
