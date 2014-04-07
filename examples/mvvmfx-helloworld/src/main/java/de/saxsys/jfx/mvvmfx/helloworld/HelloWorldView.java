package de.saxsys.jfx.mvvmfx.helloworld;

import de.saxsys.jfx.mvvm.api.FxmlView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloWorldView implements FxmlView<HelloWorldViewModel>, Initializable {

    @FXML
    private Label helloLabel;
    private HelloWorldViewModel viewModel;


    @Override
    public void setViewModel(HelloWorldViewModel viewModel) {
        this.viewModel = viewModel;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        helloLabel.textProperty().bind(viewModel.helloMessage());
    }
}
