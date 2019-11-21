package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ScrabbleController {

    //Declare all related FX values
    @FXML
    TextField word;
    @FXML
    Label result;
    @FXML
    TextField history;
    @FXML
    Label messages;
    @FXML
    Label errormessage;
    @FXML
    Label gameover;

    @FXML
    Label A;
    @FXML
    Label B;
    @FXML
    Label C;
    @FXML
    Label D;
    @FXML
    Label E;
    @FXML
    Label F;
    @FXML
    Label G;
    @FXML
    Label H;
    @FXML
    Label I;
    @FXML
    Label J;
    @FXML
    Label K;
    @FXML
    Label L;
    @FXML
    Label M;
    @FXML
    Label N;
    @FXML
    Label O;
    @FXML
    Label P;
    @FXML
    Label Q;
    @FXML
    Label R;
    @FXML
    Label S;
    @FXML
    Label T;

    @FXML
    Label U;
    @FXML
    Label V;
    @FXML
    Label W;
    @FXML
    Label X;
    @FXML
    Label Y;
    @FXML
    Label Z;

    //Initialize the program with following
    @FXML
    private void initialize(){
        word.setText("");
        result.setText("0");
    }

    @FXML
    private void submit(ActionEvent event) {
        ScrabbleModel model = new ScrabbleModel(word.getText());
        // System.out.println(word.getText());
        result.setText(String.valueOf(model.getResult()));
        history.setText(model.getHistory());
        messages.setText(model.messages);
        errormessage.setText(model.errormessage);
        // result.setText(model.getResult());
        word.setText("");

        System.out.println("Total word remaining is: " + model.RemainInBag());

        // to grayed out the empty bag
        if (model.remainA <= 0) {
            A.setStyle("-fx-text-fill: gray;");
        }
        if (model.remainB <= 0) {
            B.setStyle("-fx-text-fill: gray;");
        }
        if (model.remainC <= 0) {
            C.setStyle("-fx-text-fill: gray;");
        }
        if (model.remainD <= 0) {
            D.setStyle("-fx-text-fill: gray;");
        }
        if (model.remainE <= 0) {
            E.setStyle("-fx-text-fill: gray;");
        }
        if (model.remainF <= 0) {
            F.setStyle("-fx-text-fill: gray;");
        }
        if (model.remainG <= 0) {
            G.setStyle("-fx-text-fill: gray;");
        }
        if (model.remainH <= 0) {
            H.setStyle("-fx-text-fill: gray;");
        }

        if (model.remainI <= 0) {
            I.setStyle("-fx-text-fill: gray;");
        }

        if (model.remainJ <= 0){
            J.setStyle("-fx-text-fill: gray");
        }
        if (model.remainK <= 0){
            K.setStyle("-fx-text-fill: gray");
        }
        if (model.remainL <= 0){
            L.setStyle("-fx-text-fill: gray");
        }
        if (model.remainM <= 0){
            M.setStyle("-fx-text-fill: gray");
        }
        if (model.remainN <= 0){
            N.setStyle("-fx-text-fill: gray");
        }
        if (model.remainO <= 0){
            O.setStyle("-fx-text-fill: gray");
        }

        if (model.remainP <= 0){
            P.setStyle("-fx-text-fill: gray");
        }

        if (model.remainQ <= 0){
            Q.setStyle("-fx-text-fill: gray");
        }

        if (model.remainR <= 0){
            R.setStyle("-fx-text-fill: gray");
        }

        if (model.remainS <= 0){
            S.setStyle("-fx-text-fill: gray");
        }

        if (model.remainT <= 0){
            T.setStyle("-fx-text-fill: gray");
        }
        if (model.remainU <= 0){
            U.setStyle("-fx-text-fill: gray");
        }

        if (model.remainV <= 0){
            V.setStyle("-fx-text-fill: gray");
        }

        if (model.remainW <= 0){
            W.setStyle("-fx-text-fill: gray");
        }

        if (model.remainX <= 0){
            X.setStyle("-fx-text-fill: gray");
        }

        if (model.remainY <= 0){
            Y.setStyle("-fx-text-fill: gray");
        }

        if (model.remainZ <= 0){
            Z.setStyle("-fx-text-fill: gray");
        }

        // in the case the number of the remain of all bags gets 1
        if(model.RemainInBag() == 1){
            gameover.setText("Gave Over!");

        }
    }




}
