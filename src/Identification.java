import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Identification extends VBox {
	private Button btn;
	private TextField idField;
	private TextField hostField;
	private PasswordField passwordField;
	private ModeleConnection mC = new ModeleConnection();
	
	public Identification() {
        btn= new Button("Valider");
        idField = new TextField();
        hostField = new TextField();
        passwordField = new PasswordField();
        Label lbH = new Label("Host");
        Label lbId = new Label("Identifiant");
        Label lbPWD = new Label("Mot de passe");
        this.getChildren().add(lbH);
        this.getChildren().add(hostField);
        this.getChildren().add(lbId);
        this.getChildren().add(idField);
        this.getChildren().add(lbPWD);
        this.getChildren().add(passwordField);
        this.getChildren().add(btn);
	    btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				mC.setHost(hostField.getText());
				String g = idField.getText();
				mC.setIdentifiant(g);
				String r = passwordField.getText();
				mC.setMdp(r);
				System.out.println(mC.getIdentifiant());
				try {
					new Connexion(mC);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    	});
		}
}
