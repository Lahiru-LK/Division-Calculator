package com.example.q04;

        import javafx.application.Application;
        import javafx.fxml.FXMLLoader;
        import javafx.scene.Scene;
        import javafx.scene.image.Image;
        import javafx.stage.Stage;

        import java.io.IOException;
        import java.io.PrintStream;

public class CalApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalApplication.class.getResource("Calculate.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setResizable(false);
        stage.setTitle("CalApplication");

        Image image = new Image("/com/example/q04/icons/cal.png");
        stage.getIcons().add(image);

        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}