package aula4;

import java.net.URL;
import java.time.LocalDate;

import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

/**
 * FXML Controller class
 *
 * @author lusst
 */
public class Aula4Controller implements Initializable {

    @FXML
    private DatePicker datePickerValidade;
    @FXML
    private ComboBox<String> comboCidades;
    @FXML
    private ListView<String> listViewCidade;
    @FXML
    private Spinner<Integer> spinnerPeriodo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //Configurar os elementos que vao aparecer no 
        //combobox
        
        //Criar uma Lista JavaFX de String para
        //colocar no combobox
        ObservableList lista = FXCollections.observableArrayList();
        lista.add("Pirapora");
        lista.add("Buritizeiro");
        lista.add("Várzea da Palma");
        
        //Adicionar a lista no comboBox
        comboCidades.setItems(lista);
        
        //Para deixar um dos valores já selecionados
        comboCidades.setValue("Buritizeiro");
        
        //Adicionar a lista no listView
        listViewCidade.setItems(lista);

        //Configurar o Spinner para valores inteiros
        //primeiro parametro é o minimo
        //segundo maximo
        //terceiro valor é o valor inicial  (opcional)
        SpinnerValueFactory<Integer> valores = 
                new SpinnerValueFactory
                        .IntegerSpinnerValueFactory(1, 8, 4);
        spinnerPeriodo.setValueFactory(valores);
        
    }    

    @FXML
    private void pegarDados(ActionEvent event) {
        
        //Pegando a data do componente
        LocalDate data = datePickerValidade.getValue();
        System.out.println(data);
        
        //Pegando o elemento que está selecionado no comboBox
        String combo = comboCidades.getValue();
        System.out.println(combo);
        
        //Pegando o elemento selecionado numa listView
        String selecionado = listViewCidade.getSelectionModel()
                .getSelectedItem();
        System.out.println(selecionado);
        
        //Pegando o valor do Spinner
        int valor = spinnerPeriodo.getValue();
        System.out.println(valor);
        
    }
    
}
