package story;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MyOwnStory extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {			
			Label lblCharacter = new Label("Postac");
			lblCharacter.setMinWidth(100);
			lblCharacter.setAlignment(Pos.BOTTOM_RIGHT);
			
			TextField txtCharacter = new TextField();
			txtCharacter.setMinWidth(200);
			txtCharacter.setMaxWidth(200);
			txtCharacter.setPromptText("Wprowadz postac");
			txtCharacter.getStyleClass().add("fieldstyle");
			
			Label lblAge = new Label("Wiek");
			lblAge.setMinWidth(100);
			lblAge.setAlignment(Pos.BOTTOM_RIGHT);
			
			TextField txtAge = new TextField();
			txtAge.setMinWidth(200);
			txtAge.setMaxWidth(200);
			txtAge.setPromptText("Wprowadz wiek");
			txtAge.getStyleClass().add("fieldstyle");
			
			Label lblActor = new Label("Aktor");
			lblActor.setMinWidth(100);
			lblActor.setAlignment(Pos.BOTTOM_RIGHT);
			
			TextField txtActor = new TextField();
			txtActor.setMinWidth(200);
			txtActor.setMaxWidth(200);
			txtActor.setPromptText("Wprowadz aktora");
			txtActor.getStyleClass().add("fieldstyle");
			
			Label lblYear = new Label("Rok");
			lblYear.setMinWidth(100);
			lblYear.setAlignment(Pos.BOTTOM_RIGHT);
			
			TextField txtYear = new TextField();
			txtYear.setMinWidth(200);
			txtYear.setMaxWidth(200);
			txtYear.setPromptText("Wprowadz rok");
			txtYear.getStyleClass().add("fieldstyle");
			
			
			Label lblRole1 = new Label("Postac");
			Label lblRole2 = new Label();
			Label lblRole3 = new Label("grana przez");
			Label lblRole4 = new Label();
			Label lblRole5 = new Label("miala w ");
			Label lblRole6 = new Label();
			Label lblRole7 = new Label("roku,");
			Label lblRole8 = new Label();
			Label lblRole9 = new Label("lat.");
			
			HBox hboxCharacter = new HBox(20,lblCharacter,txtCharacter);
			hboxCharacter.setPadding(new Insets(5));
			
			HBox hboxAge = new HBox(20,lblAge,txtAge);
			hboxAge.setPadding(new Insets(5));
			
			HBox hboxActor = new HBox(20,lblActor,txtActor);
			hboxActor.setPadding(new Insets(5));
			
			HBox hboxYear = new HBox(20,lblYear,txtYear);
			hboxYear.setPadding(new Insets(5));
			
			HBox hboxRole = new HBox(2, lblRole1, lblRole2, lblRole3, lblRole4, 
					lblRole5, lblRole6, lblRole7, lblRole8, lblRole9);
			hboxRole.setPadding(new Insets(5));
			hboxRole.setAlignment(Pos.CENTER);
			
			VBox root = new VBox (5, hboxCharacter, hboxActor, hboxAge, hboxYear, hboxRole);
			
			lblRole2.textProperty().bind(txtCharacter.textProperty());
			lblRole4.textProperty().bind(txtActor.textProperty());
			lblRole6.textProperty().bind(txtAge.textProperty());
			
			Scene scene = new Scene(root,450,200);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("My own story");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
