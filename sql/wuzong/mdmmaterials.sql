create table MDMMATERIALS(
	materialnm         VARCHAR2(36),
	spesorts           VARCHAR2(500),
	materialcode       VARCHAR2(30),
	materialname       VARCHAR2(1024),
	specs              VARCHAR2(2000),
	materialsortnm     VARCHAR2(36),
	primaryunitnm      VARCHAR2(36),
	stopflag           CHAR(1),
	createtime         DATE,
	lastmodifiedtime   DATE,
	PRIMARY KEY (materialnm)
);