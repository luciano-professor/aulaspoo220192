/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author lusst
 */
public class Aula3_2Controller implements Initializable {

    @FXML
    private RadioButton radio1;
    @FXML
    private ToggleGroup periodo;
    @FXML
    private RadioButton radio3;
    @FXML
    private RadioButton radio5;
    @FXML
    private RadioButton radio7;
    @FXML
    private Label labelDados;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void pegarDados(ActionEvent event) {
    
        String m = "";
        
        //Para verificar se um radioButton esta
        //selecionado utiliza-se o método
        //isSelected()
        if(radio1.isSelected()){
            //getText() tambem retorna
            //o texto do radio
            m = radio1.getText();
        }
        
        if(radio3.isSelected()){
            m = radio3.getText();
        }
        
        if(radio5.isSelected()){
            m = radio5.getText();
        }
        
        if(radio7.isSelected()){
            m = radio7.getText();
        }
        
        //setando o label
        labelDados.setText(m);
    
    }
    
}
