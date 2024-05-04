package ys.elmoukhantar.jdbcclient.entity;

import lombok.*;
import org.springframework.jdbc.core.simple.JdbcClient;

@NoArgsConstructor @AllArgsConstructor @Getter
@Setter @ToString
public class AgenceTravel  {

    private String codeagence;
    private String nameAgence;
    private String nameCEO;

}
