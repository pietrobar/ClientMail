package sample;

import javafx.beans.Observable;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;

/**
 *
 * @author pietro
 */
public class Model {
    private ObservableList<Email> emailList = null;
    public Model(){
        this.emailList = FXCollections.observableArrayList();
    }
    private final ObjectProperty<Email> currentEmail = new SimpleObjectProperty<>(null);

    public ObjectProperty<Email> currentEmailProperty() {
        return currentEmail ;
    }

    public final Email getCurrentEmail() {
        return currentEmailProperty().get();
    }

    public final void setCurrentEmail(Email email) {
        currentEmailProperty().set(email);
    }

    public ObservableList<Email> getEmailList() {
        return emailList ;
    }



    public void creaEmail() {
        // mock...
        emailList.setAll(
                new Email("1",  "pietro.barone@example.com","jacob.smith@example.com","Tesi", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean in vehicula elit, vel tristique quam. In rutrum nunc tellus, et lacinia neque consequat a. Nulla sed libero consectetur arcu mollis egestas vitae quis lectus. Vestibulum condimentum lobortis lacinia. Morbi feugiat cursus volutpat. Cras a mi a turpis posuere dictum et quis neque. Etiam blandit facilisis lobortis. Curabitur placerat sodales turpis id venenatis. Donec semper libero justo, eu ultrices nunc consectetur quis.\n" +
                        "\n" +
                        "Donec bibendum massa nec pulvinar finibus. Quisque efficitur a augue et sollicitudin. Morbi ullamcorper nunc vestibulum tristique vehicula. Cras sem enim, venenatis id erat at, sollicitudin luctus nibh. Etiam."),
                new Email("2", "franco@example.com","jacob.smith@example.com","TAPPINA", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean dapibus nunc et dignissim elementum. Etiam in vehicula lorem, imperdiet tempor nisi. Fusce sed interdum tortor, quis efficitur augue. Sed justo justo, fermentum at faucibus ac, facilisis in nisl. Fusce posuere orci eu enim vulputate consectetur. Nulla efficitur ultrices libero vel feugiat. Nunc lobortis nec enim at malesuada. Suspendisse at urna sit amet nisi molestie tempor. Nulla suscipit sem quis orci hendrerit, et bibendum velit scelerisque. Cras tempor sem ornare, ornare sem eu, euismod massa. Pellentesque quis ex euismod, cursus purus quis, congue magna. Donec et feugiat enim, quis viverra nibh."),
                new Email("3", "smith@example.com", "jacob.smith@example.com","PERCIO'", "Nipperkin booty topmast tack code of conduct gangway bring a spring upon her cable cutlass man-of-war blow the man down. Lookout lugsail yo-ho-ho gun American Main grapple stern Barbary Coast Jack Ketch list. Starboard fire ship holystone cackle fruit topgallant nipperkin run a rig skysail main sheet jolly boat.\n" +
                        "\n" +
                        "Plunder jib lass brig clipper hang the jib boatswain grog blossom Blimey heave down. Barbary Coast bucko nipperkin sutler rope's end stern grog blossom man-of-war list Plate Fleet. Coffer Yellow Jack Buccaneer heave to wench schooner skysail yawl jolly boat flogging.\n" +
                        "\n" +
                        "Crow's nest yard Sink me Blimey reef sails haul wind sloop jib clipper coxswain. Gun heave down Nelsons folly Blimey jolly boat loaded to the gunwalls matey handsomely wherry ye. Chandler bounty careen lateen sail chantey carouser swab provost handsomely dead men tell no tales."),
                new Email("4", "neo@example.com", "jacob.smith@example.com","minchiaaa", "Salmagundi killick warp aye hearties overhaul rum ho coffer pink. Fathom holystone broadside red ensign scuppers cable lanyard yardarm nipper yard. Splice the main brace chase guns hulk piracy grog transom booty crimp grog blossom swab.\n" +
                        "\n" +
                        "Warp topmast Arr Buccaneer scallywag snow belaying pin spirits long boat Pirate Round. Lad reef black jack Jack Tar bilged on her anchor jury mast quarter fire in the hole loaded to the gunwalls pillage. Broadside lee aye keel deadlights coxswain keelhaul take a caulk yo-ho-ho Blimey."),
                new Email("5", "il.prescelto@example.com", "jacob.smith@example.com","talè soccu c'è", "Clipper marooned aye spanker shrouds Shiver me timbers snow line tender poop deck. Knave Davy Jones' Locker pink line man-of-war mutiny overhaul draught draft grog blossom. To go on account blow the man down draft loaded to the gunwalls no prey, no pay red ensign chandler salmagundi Letter of Marque knave.")
        );
    }

    public void saveData(File file) { }
}

