package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id;
    private String name;
    private String f_lastname;
    private String m_lastname;
    private String rfc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_p")
    public String getFatherLastName() {
        return f_lastname;
    }

    public void setFatherLastName(String f_lastname) {
        this.f_lastname = f_lastname;
    }

    @ColumnName("apellido_m")
    public String getMotherLastName() {
        return m_lastname;
    }

    public void setMotherLastName(String m_lastname) {
        this.m_lastname = m_lastname;
    }

    @ColumnName("RFC")
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

}
