package com.springflu.fluconnection.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//for getter and setter method add lombok anotation
@AllArgsConstructor//lombok anno
@NoArgsConstructor
@Entity//to create the table
@Table(name = "bookappo")//for the table name

public class Booking {
    @Id//for id to be primary key
    //below annotation to auto increment the id value
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String gender;

    private String mobile;

    private String address;
    private Integer age;
    private String problem;
    private String date;
    private String time;
}
