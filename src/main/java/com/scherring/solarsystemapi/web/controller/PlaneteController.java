package com.scherring.solarsystemapi.web.controller;

import com.scherring.solarsystemapi.dao.IPlaneteDAO;
import com.scherring.solarsystemapi.model.planete.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlaneteController {

    @Autowired
    private IPlaneteDAO dao;

    @GetMapping(value="/Planete")
    public List<Root> getAllPlanetes() {
        return dao.findAll();
    }

    @GetMapping(value = "/Planete/{id}")
    public Root getPlanete(@PathVariable int id) {
        return dao.findByID(id);
    }

    @PostMapping(value = "/Planete")
    public void addPlanete(@RequestBody Root p) {
        dao.save(p);
    }

    @DeleteMapping (value = "/Planete/{id}")
    public void deletePlanete(@PathVariable int id) {
        dao.delete(id);
    }

    @PutMapping (value = "/Planete/{id}")
    public void updatePlanete(@PathVariable int id, @RequestBody Root p) {
        dao.update(id, p);
    }
}
