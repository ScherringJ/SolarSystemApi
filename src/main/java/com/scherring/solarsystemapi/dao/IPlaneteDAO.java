package com.scherring.solarsystemapi.dao;

import com.scherring.solarsystemapi.model.Planete;

import java.util.List;

public interface IPlaneteDAO {

    List<Planete> findAll();
    Planete findByID(int id);
    void save(Planete planete);
}
