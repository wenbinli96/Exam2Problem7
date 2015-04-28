package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class Controller {

	

	@FXML
	private TextField First_Name = new TextField();
	@FXML
	private TextField Middle_Initial = new TextField();
	@FXML
	private TextField Last_Name = new TextField();
	@FXML
	private TextField Address = new TextField();
	@FXML
	private TextField City = new TextField();
	@FXML
	private RadioButton Male = new RadioButton();
	@FXML
	private RadioButton Female = new RadioButton();
	@FXML
	private Button Clear = new Button();
	@FXML
	private Button Save = new Button();
	
	public void setCustomer(Customer Customers) {

		First_Name.setText(Customers.getFirstName());
		Last_Name.setText(Customers.getLastName());
		Address.setText(Customers.getAddress());
		City.setText(Customers.getCity());
	}
	/// the save button
	public void handleSaveButton(ActionEvent event){
	}
	public void handleClearButton(ActionEvent event){
		
	}

}
