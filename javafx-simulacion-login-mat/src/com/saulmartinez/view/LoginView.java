/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.view;

import com.saulmartinez.controller.ImageController;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

/**
 *
 * @author informatica
 */
public class LoginView extends BorderPane {

    public static LoginView instanciaLoginView;
    private HBox barraDeVentana;
    private Label lblTituloVentana;
    private Button btnCerrarVentana;
    private final String RUTA_ESTILOS = "/com/saulmartinez/styles/";

    private ImageView imgLogologin;
    private TextField txtNombreUsuario;
    private Label lblNombreUsuario;

    private PasswordField pwdClave;
    private Label lblClave;

    private GridPane formulario;
    private Button btnIniciarSesion;
    private VBox cajavertical;

    private LoginView() {
        this.setPadding(new Insets(20));
        this.setBorder(new Border(new BorderStroke(
                Paint.valueOf("#121212"),
                BorderStrokeStyle.SOLID,
                new CornerRadii(25),
                new BorderWidths(10))));

        this.setBackground(new Background(
                new BackgroundFill(
                        Paint.valueOf("#3EB489"),
                        new CornerRadii(25),
                        Insets.EMPTY
                )
        ));

        this.getStyleClass().add("estilos-login");

        barraDeVentana = new HBox(20);

        imgLogologin = new ImageView();

        txtNombreUsuario = new TextField();
        lblNombreUsuario = new Label("Ingrese su nombre de usuario");

        cajavertical = new VBox(15);

        formulario = new GridPane();

        lblClave = new Label("Ingrese su contraseña");
        pwdClave = new PasswordField();

        btnCerrarVentana = new Button("X");
        btnCerrarVentana.setId("estilo-boton-salir");

        lblTituloVentana = new Label("JavaFX - MAT - Simulador Login");
        lblTituloVentana.getStyleClass().add("estilo-titulo-ventana");
        Image gif = new Image(getClass().getResource(
                "/com/saulmartinez/resources/mario-dancing.gif")
                .toExternalForm(), 32, 32, true, true);
        
        ImageView imageView = new ImageView(gif);
        
        lblTituloVentana.setGraphic(imageView);

        btnIniciarSesion = new Button("Iniciar Sesion");

        imgLogologin.setFitHeight(100);
        imgLogologin.setFitWidth(100);
        imgLogologin.setCache(true);
        imgLogologin.setPreserveRatio(false);

        barraDeVentana.getChildren().addAll(btnCerrarVentana, lblTituloVentana);

        formulario.add(lblNombreUsuario, 0, 0);
        formulario.add(txtNombreUsuario, 1, 0);

        formulario.add(lblClave, 0, 1);
        formulario.add(pwdClave, 1, 1);

        imgLogologin = new ImageView(new ImageController().getImageLogin("logo"));

        cajavertical.setAlignment(Pos.CENTER);
        cajavertical.getChildren().addAll(imgLogologin, formulario, btnIniciarSesion);

        this.setCenter(cajavertical);

        this.setTop(barraDeVentana);
    }

    // GETTERS Y SETTERS
    public static LoginView getInstanciaLoginView() {
        if (instanciaLoginView == null) {
            instanciaLoginView = new LoginView();
        }
        return instanciaLoginView;
    }

    public static void setInstanciaLoginView(LoginView instanciaLoginView) {
        LoginView.instanciaLoginView = instanciaLoginView;
    }

    public void setBarraDeVentana(HBox barraDeVentana) {
        this.barraDeVentana = barraDeVentana;
    }

    public void setLblTituloVentana(Label lblTituloVentana) {
        this.lblTituloVentana = lblTituloVentana;
    }

    public void setBtnCerrarVentana(Button btnCerrarVentana) {
        this.btnCerrarVentana = btnCerrarVentana;
    }

    public HBox getBarraDeVentana() {
        return barraDeVentana;
    }

    public Label getLblTituloVentana() {
        return lblTituloVentana;
    }

    public Button getBtnCerrarVentana() {
        return btnCerrarVentana;
    }

    public String getRUTA_ESTILOS() {
        return RUTA_ESTILOS;
    }

    public ImageView getImgLogologin() {
        return imgLogologin;
    }

    public TextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public Label getLb1NombreUsuario() {
        return lblNombreUsuario;
    }

    public PasswordField getPwdClave() {
        return pwdClave;
    }

    public Label getLbiClave() {
        return lblClave;
    }

    public GridPane getFormulario() {
        return formulario;
    }

    public Button getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public VBox getCajavertical() {
        return cajavertical;
    }

    public static double getUSE_PREF_SIZE() {
        return USE_PREF_SIZE;
    }

    public static double getUSE_COMPUTED_SIZE() {
        return USE_COMPUTED_SIZE;
    }

    public static double getBASELINE_OFFSET_SAME_AS_HEIGHT() {
        return BASELINE_OFFSET_SAME_AS_HEIGHT;
    }

    public void setImgLogologin(ImageView ImgLogologin) {
        this.imgLogologin = ImgLogologin;
    }

    public void setTxtNombreUsuario(TextField txtNombreUsuario) {
        this.txtNombreUsuario = txtNombreUsuario;
    }

    public void setLb1NombreUsuario(Label lb1NombreUsuario) {
        this.lblNombreUsuario = lb1NombreUsuario;
    }

    public void setPwdClave(PasswordField pwdClave) {
        this.pwdClave = pwdClave;
    }

    public void setLbiClave(Label lbiClave) {
        this.lblClave = lbiClave;
    }

    public void setFormulario(GridPane formulario) {
        this.formulario = formulario;
    }

    public void setBtnIniciarSesion(Button btnIniciarSesion) {
        this.btnIniciarSesion = btnIniciarSesion;
    }

    public void setCajavertical(VBox cajavertical) {
        this.cajavertical = cajavertical;
    }

}
