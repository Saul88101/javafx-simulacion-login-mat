/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.saulmartinez.system;

import com.saulmartinez.controller.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author informatica
 */
public class ClasePrincipal extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage escenarioRoot) {
        SceneManager.getInstanciaSceneManager().setEscenarioPrincipal(escenarioRoot);
        SceneManager.getInstanciaSceneManager().ventanaLogin();
    }
}
