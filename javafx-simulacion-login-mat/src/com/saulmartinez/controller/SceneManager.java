/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.controller;

import com.saulmartinez.view.BienvenidaView;
import com.saulmartinez.view.LoginView;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class SceneManager {

    private static SceneManager instanciaSceneManager;
    private Stage escenarioPrincipal;
    private Stage escenarioSecundario;
    private Scene escenaPrincipal;

    //CONSTRUCTOR VACIO
    private SceneManager() {
    }

    //METODO PARA CAMBIAR ESCENAS
    public void cambiarEscena(Pane panel, int ancho, int alto) {
        try {
            escenaPrincipal = new Scene(panel, ancho, alto);
            escenarioPrincipal.setScene(escenaPrincipal);

            escenarioPrincipal.sizeToScene();
            escenarioPrincipal.show();

            escenaPrincipal.getStylesheets().add(getClass().getResource("/com/saulmartinez/styles/estilos-login.css").toExternalForm());
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo : cambiarEscena");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre : cambiarEscena");
            errorPadre.printStackTrace();
        }
    }

    public void ventanaLogin() {
        try {
            // metodo para ocultar las opciones de ventana por defecto
            this.escenarioPrincipal.initStyle(StageStyle.TRANSPARENT);
            LoginView login = LoginView.getInstanciaLoginView();
            cambiarEscena(login, 400, 500);
            this.escenaPrincipal.setFill(Color.TRANSPARENT);
            new LoginController(login);
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo : ventanaLogin");
            objetoNulo.printStackTrace();
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre : ventanaLogin");
            errorPadre.printStackTrace();
        }
    }

    public void ventanaBienvenida() {
        try {
            escenarioSecundario = new Stage();
            this.escenarioSecundario.initStyle(StageStyle.TRANSPARENT);
            this.escenarioSecundario.initModality(Modality.APPLICATION_MODAL);

            BienvenidaView bienvenida = new BienvenidaView();
            
            escenaPrincipal = new Scene(bienvenida, 200, 300);
        } catch (NullPointerException objetoNulo) {
            JOptionPane.showMessageDialog(null, "Error de objeto nulo: Ventana Bienvenida");
            objetoNulo.printStackTrace(); // imprime todo el camino hacia el error
        } catch (Exception errorPadre) {
            JOptionPane.showMessageDialog(null, "Error padre: Ventana Bienvenida");
            errorPadre.printStackTrace();
        }

    }

    // GETTERS Y SETTERS
    public static SceneManager getInstanciaSceneManager() {
        if (instanciaSceneManager == null) {
            instanciaSceneManager = new SceneManager();
        }

        return instanciaSceneManager;
    }

    public Stage getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public Stage getEscenarioSecundario() {
        return escenarioSecundario;
    }

    public Scene getEscenaPrincipal() {
        return escenaPrincipal;
    }

    public static void setInstanciaSceneManager(SceneManager instanciaSceneManager) {
        SceneManager.instanciaSceneManager = instanciaSceneManager;
    }

    public void setEscenarioPrincipal(Stage escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void setEscenarioSecundario(Stage escenarioSecundario) {
        this.escenarioSecundario = escenarioSecundario;
    }

    public void setEscenaPrincipal(Scene escenaPrincipal) {
        this.escenaPrincipal = escenaPrincipal;
    }

}
