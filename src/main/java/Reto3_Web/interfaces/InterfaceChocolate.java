/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3_Web.interfaces;

import Reto3_Web.modelo.Chocolate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Angie Almeida
 */
public interface InterfaceChocolate extends MongoRepository<Chocolate, String> {

}
