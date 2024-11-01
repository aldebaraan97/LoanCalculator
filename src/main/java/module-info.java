module com.example.loancalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loancalculator to javafx.fxml;
    exports com.example.loancalculator;
    exports com.example.loancalculator.loan;
    opens com.example.loancalculator.loan to javafx.fxml;
}