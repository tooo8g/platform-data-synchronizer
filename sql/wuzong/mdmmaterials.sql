create table MDMMATERIALS(
	PRODUCTCD  VARCHAR2(36),
	SPECS  VARCHAR2(36),
	PRODDETAILS  VARCHAR2(50),
	PRODUCTNM   VARCHAR2(36),
	PRODUCTSNM  VARCHAR2(36),
	UNITCD  VARCHAR2(36),
	STOPFLAG  CHAR(1),
	RECTYPE    CHAR(1),
	RECCREATETIME  DATE,
	RECUPDATETIME  DATE	,
	MATERIALCODE   VARCHAR2(36),
	PRIMARY KEY (PRODUCTCD)
);