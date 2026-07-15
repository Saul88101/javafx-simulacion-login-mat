/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.controller;

import javafx.scene.image.Image;

/**
 *
 * @author informatica
 */
public class ImageController {

    private final String RUTA_IMAGENES = "/com/saulmartinez/resources/";

    public Image getImageLogin(String nombreImagen) {
        Image imagenAMostrar;
        switch (nombreImagen) {
            case "logo":
                imagenAMostrar = new Image(RUTA_IMAGENES + "hutao.png", 100, 100, true, true);
                break;

            default:
                imagenAMostrar = new Image(RUTA_IMAGENES + "hutao.png", 100, 100, true, true);
        }
        return imagenAMostrar;
    }
}
