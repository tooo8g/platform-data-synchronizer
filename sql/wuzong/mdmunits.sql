create table MDMUNITS(
	unitnm    VARCHAR2(36),
	unitcode    VARCHAR2(30),
	unitname    VARCHAR2(10),
	ishistory    CHAR(1),
	createtime    DATE,
	lastmodifiedtime    DATE,
	PRIMARY KEY (unitnm) 
);