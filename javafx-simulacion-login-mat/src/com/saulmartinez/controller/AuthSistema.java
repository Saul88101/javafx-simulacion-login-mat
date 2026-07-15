/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.saulmartinez.controller;

import com.saulmartinez.model.Rol;
import com.saulmartinez.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSistema {

    private ArrayList<Usuario> listaUsuarios;

    public AuthSistema() {
        listaUsuarios = new ArrayList<>();

        listaUsuarios.add(new Usuario("Juan", "123", "Juan Torres", Rol.USER));

        listaUsuarios.add(new Usuario("Marco", "2468", "Marco Fuentes", Rol.USER));

        listaUsuarios.add(new Usuario("Howards", "789456", "Howard Phillips Lovecraft", Rol.ADMIN));
    }

    public Usuario login(String username, String password) {
        for (Usuario usuario : listaUsuarios) {

            if (usuario.getUsername().equals(username)
                    && usuario.getPassword().equals(password)) {
                return usuario;
            }
        }
        return null;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

}
