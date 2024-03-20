package com.example.catpuccino_back.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="reserva", schema="catpuccino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="nombre_reserva")
    private String nombre_reserva;

    @Column(name="telefono")
    private String telefono;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="hora")
    private Time hora;

    @Column(name="reserva_activa")
    private Boolean reserva_activa = true;

    @Column(name="pagado")
    private Boolean pagado = false;

    @Column(name="total")
    private Double total;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_usuario")
    @JsonIgnore
    private Usuario id_usuario;
}