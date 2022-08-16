package net.codejava.Repositorio;

import org.springframework.data.repository.CrudRepository;
import net.codejava.Entidad.Factura;


/**
 * Esta Interfaz permite agregar funcionalidades CRUD a la entidad RepositorioFactura permitiendo definir tambien sus propios querys hacia la DB de Oracle por medio de la sintaxis que define JDBC
 *
 */
public interface RepositorioFactura extends CrudRepository< Factura, Integer> {

}
