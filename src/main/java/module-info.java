module com.example.unogroupproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.unogroupproject to javafx.fxml;
    exports com.example.unogroupproject;
}