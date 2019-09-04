/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5_2;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

/**
 * FXML Controller class
 *
 * @author lusst
 */
public class DialogosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void abrirDialogos(ActionEvent event) {
        
        //Caixa de Diálogo
        //Tipos de Ícones
        // Alert.AlertType.INFORMATION - informação
        // Alert.AlertType.ERROR - erro
        // Alert.AlertType.WARNING - atenção
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Título da caixa de alerta"); //título
        alerta.setHeaderText("Mensagem de Cabeçalho"); //cabeçalho (opcional)
        alerta.setContentText("Parabéns JavaFX");// conteudo
        alerta.showAndWait(); //mostrando o alerta
        
        //Caixa de Confirmação (faz uma pergunta e espera resposta)
        Alert confirmacao = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacao.setTitle("Isso mesmo?");
        confirmacao.setHeaderText(null);
        confirmacao.setContentText("Deseja me doar seu salario?");
        
        //Pegando a reposta atraves do botão que foi selecionado
        Optional<ButtonType> resp = confirmacao.showAndWait();
        
        //Verificar qual botao foi pressionado
        if(resp.get() == ButtonType.OK){
            //Apertou o botao ok 
            //faça algo
            System.out.println("Doou");
        }
        
        
        //Caixa de Entrada de Dados
        TextInputDialog entrada = new TextInputDialog();
        entrada.setTitle("Titulo");
        entrada.setHeaderText(null);
        entrada.setContentText("Digite sua idade");
        
        //Pegando a String que a pessoa digitou
        Optional<String> texto = entrada.showAndWait();
        
        //Imprindo o texto digitado
        System.out.println(texto.get());
        
        
    }
    
}
