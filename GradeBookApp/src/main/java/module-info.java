module com.example.gradebookapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                        
    opens com.example.gradebookapp to javafx.fxml;
    exports com.example.gradebookapp;
}