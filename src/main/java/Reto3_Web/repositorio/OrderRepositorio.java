/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Web.repositorio;

import Reto3_Web.interfaces.InterfaceOrder;
import Reto3_Web.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Angie Almeida
 */
@Repository
public class OrderRepositorio {

    @Autowired
    private InterfaceOrder interfaceOrder;

    /**
     * Lista
     * @return 
     */
    public List<Order> getAll() {
        return (List<Order>) interfaceOrder.findAll();
    }

    /**
     * Optional
     * @param id
     * @return 
     */
    public Optional<Order> getOrder(int id) {
        return interfaceOrder.findById(id);
    }

    /**
     * Crear
     * @param order
     * @return 
     */
    public Order create(Order order) {
        return interfaceOrder.save(order);
    }

    /**
     * Actualizar
     * @param order 
     */
    public void update(Order order) {
        interfaceOrder.save(order);
    }

    /**
     * Eliminar
     * @param order 
     */
    public void delete(Order order) {
        interfaceOrder.delete(order);
    }

    /**
     * Optional
     * @return 
     */
    public Optional<Order> lastUserId() {
        return interfaceOrder.findTopByOrderByIdDesc();
    }

    /**
     * Lista
     * @param zona
     * @return 
     */
    public List<Order> findByZone(String zona) {
        return interfaceOrder.findByZone(zona);
    }

}
