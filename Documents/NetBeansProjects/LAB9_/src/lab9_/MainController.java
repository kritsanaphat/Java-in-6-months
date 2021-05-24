/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9_;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Kritsanaphat
 */
public class MainController implements Initializable {

   
    @FXML
    private TextField Annual;
    @FXML
    private TextField Years;
    @FXML
    private TextField Loan;
    @FXML
    private TextField Month;
    @FXML
    private TextField Total;
    double AnnualV;
    double LoanV;
    int YearsV;
    @FXML
    private Button SavePress;
    @FXML
    private Button LoadPress;
    
    @FXML
    private void CalculatePress() {
        System.out.println("Calculate..");
        AnnualV = Double.parseDouble(Annual.getText());
         YearsV = Integer.parseInt(Years.getText());
         LoanV = Double.parseDouble(Loan.getText());
        DecimalFormat df = new DecimalFormat("###.##");
         Loan l1 = new Loan(AnnualV,YearsV,LoanV);
       
        Month.setText("$"+df.format(l1.getMonthlyPayment()));
        Total.setText("$"+df.format(l1.getTotalPayment()));
         
       
         
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }


    @FXML
    private void handleButton1Action(javafx.event.ActionEvent event) {
    }

    @FXML
    private void handlleclearBtnAction(javafx.event.ActionEvent event) {
        System.out.println("CLEAR..");
        Annual.clear();
        Month.clear();
        Total.clear();
        Years.clear();
        Loan.clear();
    }
    File file = new File("Data.det");
    @FXML
    private void SavePress(ActionEvent event) throws FileNotFoundException, IOException{
         
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream output = new DataOutputStream(fos);
        output.writeDouble(AnnualV);
        output.writeDouble(YearsV);
        output.writeDouble(LoanV);
        output.close();
    }

    @FXML
    private void LoadPress(ActionEvent event) throws FileNotFoundException, IOException{
         // File file = new File("Data.det");
        // FileOutputStream fos = new FileOutputStream(file);
        FileInputStream fis = new FileInputStream(file);
        DataInputStream input = new DataInputStream(fis);
        //double monthS = input.readDouble();
        Annual.setText(""+input.readDouble());
        Years.setText(""+input.readDouble());
        Loan.setText(""+input.readDouble());
       // System.out.println(input.readDouble());
    }

}
