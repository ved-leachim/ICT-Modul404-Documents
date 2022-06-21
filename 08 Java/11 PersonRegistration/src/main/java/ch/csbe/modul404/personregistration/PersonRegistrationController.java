package ch.csbe.modul404.personregistration;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PersonRegistrationController implements Initializable {

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnRegister;

    @FXML
    private Button btnReset;

    @FXML
    private Label lblState;

    @FXML
    private TableView<Person> tvPersons;

    @FXML
    private TableColumn<Person, String> clnGivenName;

    @FXML
    private TableColumn<Person, String> clnSurname;

    @FXML
    private TableColumn<Person, Byte> clnAge;

    @FXML
    private TableColumn<Person, String> clnDescription;

    @FXML
    private TextField txtAge;

    @FXML
    private TextArea txtDescription;

    @FXML
    private TextField txtGivenName;

    @FXML
    private TextField txtSurname;

    private Stage stage;
    private Scene scene;
    ObservableList<Person> personList = FXCollections.observableArrayList();

    public void reset(ActionEvent event) {
        txtGivenName.setText("");
        txtSurname.setText("");
        txtAge.setText("");
        txtDescription.setText("");
        lblState.setText("");
    }

    public void registerPerson(ActionEvent event) {
        if (txtSurname.getText().length() == 0 || txtGivenName.getText().length() == 0 || txtAge.getText().length() == 0 || txtDescription.getText().length() == 0) {
            lblState.setText("Bitte füllen Sie alle benötigten Felder aus.");
            return;
        }
        lblState.setText("");

        Person newPerson = new Person(
                txtGivenName.getText(),
                txtSurname.getText(),
                Byte.parseByte(txtAge.getText()),
                txtDescription.getText());

        personList.add(newPerson);

    }

    public void switchToLoginScene(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(PersonRegistration.class.getResource("login.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        clnGivenName.setCellValueFactory(new PropertyValueFactory<Person, String>("givenName"));
        clnSurname.setCellValueFactory(new PropertyValueFactory<Person, String>("surname"));
        clnAge.setCellValueFactory(new PropertyValueFactory<Person, Byte>("age"));
        clnDescription.setCellValueFactory(new PropertyValueFactory<Person, String>("description"));

        tvPersons.setItems(personList);
    }
}
