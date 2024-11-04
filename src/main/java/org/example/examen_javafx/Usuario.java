package org.example.examen_javafx;

import java.util.Date;

public class Usuario {
    private String correo;
    private String plataforma;
    private boolean isAdmin;
    private String software;
    private Date fecha;

    public Usuario(String correo, String plataforma, boolean isAdmin) {
        this.correo = correo;
        this.plataforma = plataforma;
        this.isAdmin = isAdmin;
    }
}
