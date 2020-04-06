package de.runconfigsample;

import com.install4j.api.launcher.SplashScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(final Stage primaryStage) throws Exception {
    Label label = new Label("Hello world!");
    StackPane stackPane = new StackPane(label);
    Scene scene = new Scene(stackPane, 400, 400);
    primaryStage.setScene(scene);
    primaryStage.show();

    SplashScreen.hide();
  }
}




