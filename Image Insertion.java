
package effortLogAnalysisProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Font;
import javafx.stage.*;
// vaibhav
public class DisplayImage extends Application {

	public void start(Stage window) throws Exception{
		//title for window
		window.setTitle("Login form");
		
		//creating grid pane
		GridPane gridPane = createformPane();
		//adding UI control
		addUIControls(gridPane);
		//Create a scene
		Scene scene = new Scene(gridPane, 600, 500);
		//set the scene
		window.setScene(scene);
		window.show();		
	}

	

	private GridPane createformPane() {
		
		// new grid pane
		GridPane gridPane = new GridPane();
		
		//position at center
		gridPane.setAlignment(Pos.TOP_LEFT);
		
		//set padding of 20px
		gridPane.setPadding(new Insets(10, 10, 10, 10));
		
		// Add Column Constraints

        // columnOneConstraints will be applied to all the nodes placed in column one.
        ColumnConstraints columnOneConstraints = new ColumnConstraints(60, 100, Double.MAX_VALUE);
        columnOneConstraints.setHalignment(HPos.RIGHT);

        // columnTwoConstraints will be applied to all the nodes placed in column two.
        ColumnConstraints columnTwoConstrains = new ColumnConstraints(100,200, Double.MAX_VALUE);
        columnTwoConstrains.setHgrow(Priority.ALWAYS);

        gridPane.getColumnConstraints().addAll(columnOneConstraints, columnTwoConstrains);

		
		return gridPane;
	}
	
	private void addUIControls(GridPane gridPane) throws FileNotFoundException {
		
		// add header
		Label headerLabel = new Label("Login Form");
		headerLabel.setFont(Font.font("Arial", 18));
		gridPane.add(headerLabel, 1, 0);
		
		
		
		File file = new File("D:\\Semester - 2\\Sanchit.jpg");
		FileInputStream imgi = new FileInputStream(file);
		Image img= new Image(imgi);
		
		ImageView imgv = new ImageView(img);
		gridPane.add(imgv, 1, 10);
		
		
		
		// add login label
		Label loginLabel = new Label("User ID");
		gridPane.add(loginLabel, 0, 2);
		
		//add login text field
		TextField loginField = new TextField();
		gridPane.add(loginField, 1, 2);
		
		//add password label
		Label passwordLabel = new Label("Password:");
		gridPane.add(passwordLabel, 0, 5);
		
		//add password text field
		PasswordField passwordField = new PasswordField();
		gridPane.add(passwordField, 1, 5);
		
		//add submit button
		Button submitButton = new Button("Submit");
		gridPane.add(submitButton, 0, 7, 2, 1);
		
		submitButton.setOnAction(new EventHandler<ActionEvent>() {
		
		
		@Override
		public void handle(ActionEvent event) {
		
			if(loginField.getText().isEmpty()) {
				showAlert(Alert.AlertType.ERROR,
						gridPane.getScene().getWindow(),
						"Sanchit");
				return;
			}
			if(passwordField.getText().isEmpty()) {
				showAlert(Alert.AlertType.ERROR,
						gridPane.getScene().getWindow(),
						"2018");
				return;
			}
			
			showAlert(Alert.AlertType.CONFIRMATION,
					gridPane.getScene().getWindow(),
					"Login Sucessfull !!");
			
		}
		
	});
		
	}



	protected void showAlert(AlertType error, Window window, String string) {
		  Alert alert = new Alert(error);
		  alert.setTitle(null);
		  alert.setContentText(string);
		  alert.initOwner(window);
		  alert.show();
		  
	}
	
	   public static void main(String[] args) {
	        launch(args);
}
}
//Sanchit
