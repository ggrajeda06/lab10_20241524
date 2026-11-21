
package com.example.webapphr3.Daos;

import com.example.webapphr3.Beans.equipored;
import com.example.webapphr3.Dtos.listadoDTO;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EquipoDao extends DaoBase {

    public ArrayList<listadoDTO> () {

        String sql = "SELECT id_equipo, hostname, tipo, ip_gestion " +
                "FROM equipos_red e inner join sedes s on e.destino = d.id_sede" +
                "order by e.id_equipo";
            try (Connection conn = this.getConection();

             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM equipos_red")) {

            }
        } catch (SQLException ex) {
            Logger.getLogger(listadoDTO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listadoDTO;
    }

    public void crearEquipo(int id_equipo, String hostname, String Tipo, String ipGestion, String sede, String ciudad) throws SQLException {

        String sql = "INSERT INTO equipo_red (id_equipo,hostname,tipo,ipgestion,sede) "
                + "VALUES (?,?,?,?,?)";

        try (Connection conn = this.getConection();
             PreparedStatement pstmt = conn.prepareStatement(sql);) {
            pstmt.setString(1, id_equipo);
            pstmt.setString(2, hostname);
            pstmt.setInt(3, Tipo);
            pstmt.setInt(4, ipGestion);
            pstmt.setInt(5, sede);
            pstmt.executeUpdate();
        }
    }
}
