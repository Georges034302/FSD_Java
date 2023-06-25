module com.fsd {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.fsd to javafx.fxml;
    exports com.fsd;
}
