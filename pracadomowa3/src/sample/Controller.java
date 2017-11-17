package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import javafx.collections.ObservableList;
import javafx.scene.control.TextField;

public class Controller {


    //public ObservableList<String> list = FXCollections.observableArrayList();
    public TextField text;
    public TableView<String> table;



    public void handleClick(ActionEvent actionEvent) {
       // if (text.getText()!=null) {
         //   list.add(text.getText());
        //}
        //table.setItems(list);
        table.getItems().add(text.getText());
    }


  @FXML
   public void initialize() {
      TableColumn<String, String> onlyColumn = (TableColumn<String, String>) table.getColumns().get(0);
      if (onlyColumn.getCellValueFactory() == null) {
          onlyColumn.setCellValueFactory((param) -> new SimpleStringProperty(param.getValue()));
      }
  }

}
