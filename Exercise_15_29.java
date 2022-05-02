import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Exercise_15_29 extends Application {

    Pane pane = new Pane();
    private double x = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Timeline animation = new Timeline(new KeyFrame(Duration.millis(10), e -> moveCar()));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();
        pane.setOnMousePressed(e -> {
            animation.pause();
        });
        pane.setOnMouseReleased(e -> {
            animation.play();
        });
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void moveCar() {
        if (x + 50 < pane.getWidth())
            x += 1;
        else x = 0;

        pane.getChildren().clear();
        Circle circle1 = new Circle(x + 15, 45, 5);
        circle1.setFill(Color.BLACK);
        Circle circle2 = new Circle(x + 35, 45, 5);
        circle2.setFill(Color.BLACK);
        Rectangle rectangle = new Rectangle(x, 30, 50, 10);
        rectangle.setFill(Color.RED);
        Polygon polygon = new Polygon(x + 10, 30, x + 40, 30, x + 30, 20, x + 20, 20);
        polygon.setFill(Color.BLACK);
        pane.getChildren().addAll(circle1, circle2, rectangle, polygon);


    }

}
