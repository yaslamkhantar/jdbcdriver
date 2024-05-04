package ys.elmoukhantar.jdbcclient.web;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ys.elmoukhantar.jdbcclient.entity.AgenceTravel;

import java.util.List;

@RestController

@AllArgsConstructor
public class AgenceTravelController {


    private JdbcClient jdbcClient1;// j'ai utulisé l'anootation @allargsconstrucor pour l'injection

    @PostMapping(value = "/addAgence")
    public String AddAgenceTravel(@RequestBody AgenceTravel agenceTravel) {

        jdbcClient1.sql("INSERT INTO agenceTravel(codeagence,nameAgence,nameCEO)  values(?,?,?)").
                param(List.of(agenceTravel.getCodeagence(),agenceTravel.getNameAgence()
                        ,agenceTravel.getNameCEO())).update();

        return "True" ;

    }

    @GetMapping("/ListAgence")
    public List<AgenceTravel> getAgenceTravels() {
        return jdbcClient1.sql("SELECT codeagence,nameAgence,nameCEO FROM AgenceTravel").
                query(AgenceTravel.class).list();
    }



}
