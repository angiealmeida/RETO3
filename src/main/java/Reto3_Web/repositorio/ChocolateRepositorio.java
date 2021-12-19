/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_Web.repositorio;

import Reto3_Web.modelo.Chocolate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto3_Web.interfaces.InterfaceChocolate;

/**
 *
 * @author Angie Almeida
 */
@Repository
public class ChocolateRepositorio {

    @Autowired
    private InterfaceChocolate repository;

    /**
     * Lista
     *
     * @return
     */
    public List<Chocolate> getAll() {
        return repository.findAll();
    }

    /**
     * Optional
     *
     * @param reference
     * @return
     */
    public Optional<Chocolate> getClothe(String reference) {
        return repository.findById(reference);
    }

    /**
     * Crear
     *
     * @param clothe
     * @return
     */
    public Chocolate create(Chocolate clothe) {
        return repository.save(clothe);
    }

    /**
     * Actualizar
     *
     * @param clothe
     */
    public void update(Chocolate clothe) {
        repository.save(clothe);
    }

    /**
     * Eliminar
     *
     * @param clothe
     */
    public void delete(Chocolate clothe) {
        repository.delete(clothe);
    }
}
