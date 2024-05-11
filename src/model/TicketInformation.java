package model;

public class TicketInformation {
    String NombreUsuario;
    Integer id_usuario;
    Integer id_vuelo;
    Integer id_tiquete;
    Integer id_reserva;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    String descripcion;
    String observaciones;

    public TicketInformation(String nombreUsuario, Integer id_usuario, Integer id_vuelo, Integer id_tiquete, Integer id_reserva, String descripcion, String observaciones) {
        NombreUsuario = nombreUsuario;
        this.id_usuario = id_usuario;
        this.id_vuelo = id_vuelo;
        this.id_tiquete = id_tiquete;
        this.id_reserva = id_reserva;
        this.descripcion = descripcion;
        this.observaciones = observaciones;
    }


    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(Integer id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public Integer getId_tiquete() {
        return id_tiquete;
    }

    public void setId_tiquete(Integer id_tiquete) {
        this.id_tiquete = id_tiquete;
    }

    public Integer getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }
}
