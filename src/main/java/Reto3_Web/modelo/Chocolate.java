/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Web.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Angie Almeida
 */
@Document(collection = "chocolate")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Chocolate {

    @Id

    /**
     * Referencia
     */
    private String reference;

    /**
     * Categoria
     */
    private String category;

    /**
     * Descripción
     */
    private String description;

    /**
     * Estado
     */
    private boolean availability = true;

    /**
     * Precio
     */
    private double price;

    /**
     * Cantidad
     */
    private int quantity;

    /**
     * Foto
     */
    private String photography;
}
