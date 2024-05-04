DROP TABLE IF EXISTS AgenceTravel;

CREATE TABLE`AgenceTravel`( `codeagence` varchar(20) NOT NULL, `nameAgence` varchar(255) DEFAULT NULL,
 `nameCEO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codeagence`)
);