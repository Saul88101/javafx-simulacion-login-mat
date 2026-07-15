/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.controller;

import com.saulmartinez.model.Usuario;
import com.saulmartinez.view.LoginView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica
 */
public class LoginController {

    private final LoginView LOGIN_VIEW;
    private final AuthSistema AUTH_SISTEMA;
    private double ejeX = 0;
    private double ejeY = 0;
    private Stage escenario = SceneManager.getInstanciaSceneManager().getEscenarioPrincipal();

    public LoginController(LoginView loginView) {
        this.LOGIN_VIEW = loginView;
        this.AUTH_SISTEMA = new AuthSistema();
        construirAcciones();
    }

    public void construirAcciones() {
        this.LOGIN_VIEW.getBtnCerrarVentana().setOnMouseClicked(
                (evento) -> {
                    System.exit(0);
                }
        );

        this.LOGIN_VIEW.getBtnIniciarSesion().setOnMouseClicked(
                (evento) -> {
                    validarLogin();
                }
        );

        this.LOGIN_VIEW.setOnMouseClicked(
                (evento) -> {
                    ejeX = evento.getSceneX();
                    ejeY = evento.getSceneY();
                }
        );

        this.LOGIN_VIEW.setOnMouseDragged(
                (evento) -> {
                    double ejeXVentanaDesplazamiento = evento.getScreenX();
                    double ejeYVentanaDesplazamiento = evento.getScreenY();

                    System.out.println("X " + ejeX);
                    System.out.println("Y " + ejeY);

                    System.out.println("Desplazamiento total X " + (ejeXVentanaDesplazamiento - ejeX));
                    System.out.println("Desplazamiento total Y " + (ejeYVentanaDesplazamiento - ejeY));
                    escenario.setX((ejeXVentanaDesplazamiento - ejeX));
                    escenario.setY((ejeYVentanaDesplazamiento - ejeY));
                }
        );
    }

    private void validarLogin() {

        String username = LOGIN_VIEW.getTxtNombreUsuario().getText().trim();
        String password = LOGIN_VIEW.getPwdClave().getText().trim();
        Usuario usuarioLogin = AUTH_SISTEMA.login(username, password);

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Verifique que los campo no estan vacios");
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("estilo-bordes-campos-incorrectos");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("estilo-bordes-campos-incorrectos");
            return;
        }

        if (username.isEmpty() || password.isEmpty()) {

            if (username.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "NO DEJE EL CAMPO NOMBRE USUARIO VACIO");
                this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().add("empty");

            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "NO DEJE EL CAMPO CONTRASEÑA VACIO");
            }
            this.LOGIN_VIEW.getTxtNombreUsuario().getStyleClass().remove("error");
            this.LOGIN_VIEW.getPwdClave().getStyleClass().add("empty");
        }

    }
}
