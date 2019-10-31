import java.sql.Connection;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DBmain extends Application{
	private TableView table;
	private TreeView<String> tree;
	private TextArea ta;
	private Button[] buttons;
	private Label[] labels;
	private TextField[] txt;
	
	
	@Override
	public void start(Stage stage) {
		VBox vbox = new VBox();
		
		Scene scene = new Scene(vbox);
		stage.setScene(scene);
		stage.setTitle("Dream Home 02");
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
		//Connection con = MyConnection.makeConnection();
		
		
	}
}
