package com.pruebatecnica.rolly.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "tbl_persona")
@Getter
@Setter
public class Persona {
    @JsonProperty("dni")
    private String dni;
    @JsonProperty("appMaterno")
    private String appMaterno;
    @JsonProperty("appPaterno")
    private String appPaterno;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
