module org.premier.premier {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.premier.premier to javafx.fxml;
    exports org.premier.premier;
}