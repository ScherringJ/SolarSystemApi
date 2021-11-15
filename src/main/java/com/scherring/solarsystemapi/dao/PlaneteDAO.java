package com.scherring.solarsystemapi.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.scherring.solarsystemapi.model.planete.Root;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Repository
public class PlaneteDAO implements IPlaneteDAO {


    @Override
    public List<Root> findAll() {
        return readJsonAll();
    }

    @Override
    public Root findByID(int id) {
        return getPlaneteID(id);
    }

    @Override
    public void save(Root planete) {
      savePlanete(planete);
    }

    @Override
    public void delete(int id) {
        deletePlanete(id);
    }

    @Override
    public void update(int id, Root planete) {
        updatePlanete(id, planete);
    }

    private List<Root> readJsonAll() {
        List<Root> roots = null;
        try {
            ObjectMapper om = new ObjectMapper();
            List<Root> root = om.readValue(new File("src/main/resources/static/donnees-systeme-solaire-solar-system-data.json"),
                    new TypeReference<List<Root>>(){});
            roots = root;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roots;
    }

    private Root getPlaneteID(int id) {
        List<Root> roots = readJsonAll();
        Root root = new Root();
        for (Root r : roots) {
            if (r.getId() == id) {
                root = r;
            }
        }
        return root;
    }

    private void savePlanete(Root planete) {
        List<Root> roots = readJsonAll();
        roots.add(planete);
        try {
            ObjectMapper om = new ObjectMapper();
            om.writeValue(new File("src/main/resources/static/donnees-systeme-solaire-solar-system-data.json"), roots);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deletePlanete(int id) {
        List<Root> roots = readJsonAll();
        roots.removeIf(root -> root.getId() == id);

        try {
            ObjectMapper om = new ObjectMapper();
            om.writeValue(new File("src/main/resources/static/donnees-systeme-solaire-solar-system-data.json"), roots);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updatePlanete(int id, Root Planete) {
        List<Root> roots = readJsonAll();
       for (int i = 0; i < roots.size(); i++) {
           if (roots.get(i).getId() == id) {
               roots.set(i, Planete);
           }
       }

        try {
            ObjectMapper om = new ObjectMapper();
            om.writeValue(new File("src/main/resources/static/donnees-systeme-solaire-solar-system-data.json"), roots);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
