create table MDMMATSORTS(
	materialsortnm    VARCHAR2(36),
	materialsortcode    VARCHAR2(30),
	materialsortname    VARCHAR2(512),
	materialsortpath    VARCHAR2(36),
	spetype    VARCHAR2(2),
	layer    INTEGER,
	isdetail    CHAR(1),
	ishistory    CHAR(1),
	createtime    DATE,
	lastmodifiedtime    DATE,
	PRIMARY KEY (materialsortnm)
);