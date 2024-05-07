package com.corhuila.shoppingcar.IService;

import com.corhuila.shoppingcar.Document.Proveedor;

import java.util.List;
import java.util.Optional;

public interface IProveedorService {
    List<Proveedor> findAll();
    Optional<Proveedor> findById(String id);
    Proveedor save(Proveedor proveedor);
    void update(Proveedor proveedor, String id);
    void deleteLogical(Proveedor proveedor, String id);
    void delete(String id);

}
