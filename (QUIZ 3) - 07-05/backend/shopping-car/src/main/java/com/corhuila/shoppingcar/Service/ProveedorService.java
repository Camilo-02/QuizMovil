package com.corhuila.shoppingcar.Service;


import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IRepository.IProveedorRepository;
import com.corhuila.shoppingcar.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorService implements IProveedorService {

    @Autowired
    private IProveedorRepository repository;

    @Override
    public List<Proveedor> findAll() {return repository.findAll();}

    @Override
    public Optional<Proveedor> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    @Override
    public void update(Proveedor proveedor, String id) {
        Optional<Proveedor> ps = repository.findById(id);

        if (!ps.isEmpty()) {
            Proveedor proveedorUpdate = ps.get();
            proveedorUpdate.setNombre(proveedor.getNombre());
            proveedorUpdate.setDireccion(proveedor.getDireccion());
            proveedorUpdate.setCodigo(proveedor.getCodigo());

            repository.save(proveedorUpdate);
        } else {
            System.out.println("No existe el proveedor");
        }
    }

    @Override
    public void deleteLogical(Proveedor proveedor, String id) {
        Optional<Proveedor> ps = repository.findById(id);

        if (!ps.isEmpty()){
            Proveedor proveedorUpdate = ps.get();

            repository.save(proveedorUpdate);
        } else {
            System.out.println("No existe el proveedor");
        }
    }

    @Override
    public void delete(String id) {repository.deleteById(id);}
}



