package org.example.examen_javafx;

import java.util.Date;

public class Usuario {
    private String correo;
    private String plataforma;
    private boolean isAdmin;
    private Integer software;
    private Date fecha;

    public Usuario(String correo, String plataforma, boolean isAdmin, Integer software, Date fecha) {
        this.correo = correo;
        this.plataforma = plataforma;
        this.isAdmin = isAdmin;
        this.software = software;
        this.fecha = fecha;
    }
}
