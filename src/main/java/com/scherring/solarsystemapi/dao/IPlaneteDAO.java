package com.scherring.solarsystemapi.dao;

import com.scherring.solarsystemapi.model.planete.Root;

import java.util.List;

public interface IPlaneteDAO {

    List<Root> findAll();
    Root findByID(int id);
    void save(Root planete);
    void delete(int id);
    void update(int id, Root planete);
}
