import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class panel_stack extends Application{
    public void start(Stage stage){
        StackPane panel = new StackPane();//creacion del panel tipo stack
        panel.getChildren().addAll(new Rectangle(300, 100, Color.rgb(73, 139, 145)));//añadir un label
        panel.setMaxSize(Region.USE_COMPUTED_SIZE, Region.USE_COMPUTED_SIZE);//configurar para que no se pueda cambiar la forma
        /**
         * crear una etiqueta
         */
        Label title = new Label("Hola desde panelStack");
        StackPane.setAlignment(title, Pos.CENTER);
        /**
         * se añade al panel
         */
        panel.getChildren().addAll(title);
        /**
         * configuracion del panel para interfaz
         */
        Scene miScena = new Scene(panel);
        stage.setTitle("panelStack ejemplo");
        stage.setScene(miScena);
        stage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }

}
