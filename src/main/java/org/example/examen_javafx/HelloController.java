package org.example.examen_javafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TableView<Usuario> tableView;

    @FXML
    private TableColumn<Usuario, String> correoColumn;

    @FXML
    private TableColumn<Usuario, String> plataformaColumn;

    @FXML
    private TableColumn<Usuario, Boolean> adminColumn;

    @FXML
    private TextField emailTextField;

    @FXML
    private ChoiceBox<String> plataforma;

    @FXML
    private CheckBox admin;

    @FXML
    private Button añadir;

    private ObservableList<Usuario> usuarios;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        usuarios = FXCollections.observableArrayList();
        tableView.setItems(usuarios);
        plataforma.setItems(FXCollections.observableArrayList("Windows", "Mac", "Linux"));
    }

    @FXML
    public void añadir(ActionEvent actionEvent) {
        String email = emailTextField.getText();
        String platform = plataforma.getValue();
        boolean isAdmin = admin.isSelected();
        String software

        Usuario nuevoUsuario = new Usuario(email, platform, isAdmin);
        usuarios.add(nuevoUsuario);
        tableView.refresh();
        System.out.println("Añadir usuario: " + email + ", Plataforma: " + platform + ", Administrador: " + isAdmin);
    }
}