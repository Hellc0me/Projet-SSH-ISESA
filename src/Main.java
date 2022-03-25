import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
    	
        VBox root = new VBox();
        root.setSpacing(10);
        root.setPadding(new Insets(15,20,10,100));

        root.getChildren().addAll(new Identification());
        
        Scene scene = new Scene(root, 550, 250);
        
        primaryStage.setTitle("Connexion");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        

    }

   
    public static void main(String[] args) {
        launch(args);
    }
   
}