package aula3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author lusst
 */
public class Aula3Controller implements Initializable {

    @FXML
    private PasswordField passwordFieldSenha;
    @FXML
    private TextArea textAreaReclamacoes;
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
        
        //Pegar o dado do passwaordField
        m += passwordFieldSenha.getText();
        
        //Pegar o texto do textArea
        m += "\n" + textAreaReclamacoes.getText();
        
        //Jogar os dados no label
        labelDados.setText(m);
        
        
        
    }
    
}
