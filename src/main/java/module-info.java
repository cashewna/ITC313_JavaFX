module com.example.itc313_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.itc313_javafx to javafx.fxml;
    exports com.example.itc313_javafx;
    exports chapter14;
}