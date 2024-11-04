module org.example.examen_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.examen_javafx to javafx.fxml;
    exports org.example.examen_javafx;
}