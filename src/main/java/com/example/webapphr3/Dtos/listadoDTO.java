package com.example.webapphr3.Dtos;

public class listadoDTO {
        private int id_equipo;
        private String hostname;
        private String Tipo;
        private String ipGestion;
        private String sede;
        private String ciudad;

    public int getId() { return id_equipo; }
    public void setId(int id) { this.id_equipo= id; }

    public String getHostname() { return hostname; }
    public String setHostname(String region) { this.hostname = hostname; }

    public String getTipo() {return Tipo};
    public String setTipo(int tipo) {this.Tipo = Tipo};

    public String getIpGestion() {
        return ipGestion;
    }

    public void setIpGestion(String ipGestion) {
        this.ipGestion = ipGestion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
