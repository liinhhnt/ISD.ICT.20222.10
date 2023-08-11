package view.screen.home;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import common.exception.InvalidSearchKeyException;
import common.exception.NoResultException;
import controller.HomeScreenController;
import controller.search.SearchDockByAddressController;
import controller.search.SearchDockByNameController;
import entity.dock.Dock;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import utils.Configs;
import view.screen.BaseScreenHandler;
import view.screen.dock.DockHandler;

public class HomeScreenHandler extends BaseScreenHandler implements Initializable {

    @FXML
    private Button searchBtn;

    @FXML
    private VBox dockListVBox;

    @FXML
    private RadioButton searchByNameBtn;

    @FXML
    private RadioButton searchByAddressBtn;

    @FXML
    private TextField searchTextField;

    @Override
    public void initialize(URL url, ResourceBundle bundle) {
        
    	searchByNameBtn.setOnAction(e -> {
            searchByNameBtn.setSelected(true);
            HomeScreenController homeCtrl = (HomeScreenController) this.getBaseController();
            homeCtrl.setSearchController(new SearchDockByNameController());
            System.out.println("Search by Name");
        });

        searchByAddressBtn.setOnAction(e -> {
            searchByAddressBtn.setSelected(true); 
            HomeScreenController homeCtrl = (HomeScreenController) this.getBaseController();
            homeCtrl.setSearchController(new SearchDockByAddressController());
            System.out.println("Search by Address");
        });

        searchBtn.setOnMouseClicked(e -> {
            try {
                HomeScreenController homeCtrl = (HomeScreenController) this.getBaseController();
                ArrayList<Dock> result = homeCtrl.search(searchTextField.getText());
                showDockList(result);
            } catch (InvalidSearchKeyException ex) {
                System.out.println(ex.getMessage());
            } catch (NoResultException ex) {
                System.out.println(ex.getMessage());
            } catch (Exception ex) {
                System.out.println("Something happened unexpectedly");
                ex.printStackTrace();
            }
        });
        
		showAllDocks();

        
    }

	
    public HomeScreenHandler(Stage stage, String screenPath) throws IOException {
        super(stage, screenPath);
        this.setHomeScreenHandler(this);
    }

    @Override
    public void show() {
        super.show();
    }

    private void showAllDocks() {
        showDockList(HomeScreenController.getAllDocks());
    }

    private void showDockList(ArrayList<Dock> docks) {
        dockListVBox.getChildren().clear();
        try {
            for (Dock dock : docks) {
                DockHandler dockHandler = new DockHandler(Configs.DOCK_PATH, this);
                dockHandler.setDock(dock);
                dockListVBox.getChildren().add(dockHandler.getContent());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
