//Tabla para guardar la info del token de refresco: token que es cuando en el trabajo te piden darle mas tiempo a tu token sin tener que desloguearte
create table oauth_refresh_token (
  token_id VARCHAR(256),
  token bytea,
  authentication bytea
);
//para ir probando
select * from oauth_access_token;

select * from oauth_refresh_token;

PARA OBTENER EL TOKEN DE REFRESCO DE POSTMAN, DEBEN OBTENER EL TOKEN COMO SIEMPRE

delete from oauth_access_token;

delete from oauth_refresh_token;

select * from reset_token;

//PARA PAGINACIÓN DE PACIENTES
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CARLOS', 'RUIZ', '72302301' , 'carlos@gmail.com', '991855511');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('ANDRES', 'RUIZ', '72301302' , 'carlos@gmail.com', '991855512');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('ANA', 'RUIZ', '72301303' , 'carlos@gmail.com', '991855513');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MARIA', 'RUIZ', '72301304' , 'carlos@gmail.com', '991855514');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('KAREN', 'RUIZ', '72301305' , 'carlos@gmail.com', '991855512');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('LUIS', 'RUIZ', '72301306' , 'carlos@gmail.com', '991855513');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('JOSE', 'RUIZ', '72301307' , 'carlos@gmail.com', '991855514');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('EDGAR', 'RUIZ', '72301308' , 'carlos@gmail.com', '991855588');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('ROBERTO', 'RUIZ', '72301309' , 'carlos@gmail.com', '991855522');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MIA', 'RUIZ', '72301310' , 'carlos@gmail.com', '991855566');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('JEREMY', 'RUIZ', '72301322' , 'carlos@gmail.com', '991855557');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('PEPE', 'RUIZ', '72301312' , 'carlos@gmail.com', '991855541');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('KATHY', 'RUIZ', '72301313' , 'carlos@gmail.com', '991855565');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MANUEL', 'RUIZ', '72301314' , 'carlos@gmail.com', '991855561');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MARCOS', 'RUIZ', '72301316' , 'carlos@gmail.com', '991855562');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('KARLA', 'RUIZ', '72301391' , 'carlos@gmail.com', '991855563');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CARLOS', 'RUIZ', '72301801' , 'carlos@gmail.com', '991855564');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('EDUARDO', 'RUIZ', '72308301' , 'carlos@gmail.com', '991855565');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('LESTER', 'RUIZ', '72301901' , 'carlos@gmail.com', '991855566');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('ERIKA', 'RUIZ', '72301381' , 'carlos@gmail.com', '991855567');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('TOMAS', 'RUIZ', '72301311' , 'carlos@gmail.com', '991855568');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('TOMASA', 'RUIZ', '72301491' , 'carlos@gmail.com', '991855569');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('TITO', 'RUIZ', '72301353' , 'carlos@gmail.com', '991855570');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('YAHAIRA', 'RUIZ', '72301341' , 'carlos@gmail.com', '991855571');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('BRAYAN', 'RUIZ', '72301342' , 'carlos@gmail.com', '991855572');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('KEVIN', 'RUIZ', '72301343' , 'carlos@gmail.com', '991855573');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('BRITTANY', 'RUIZ', '72301344' , 'carlos@gmail.com', '991855574');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('JULIO', 'RUIZ', '72301345' , 'carlos@gmail.com', '991855575');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('JULIA', 'RUIZ', '72301346' , 'carlos@gmail.com', '991855576');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CESAR', 'RUIZ', '72301347' , 'carlos@gmail.com', '991855577');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('PAOLO', 'RUIZ', '72301348' , 'carlos@gmail.com', '991855578');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('PAOLA', 'RUIZ', '72301349' , 'carlos@gmail.com', '991855579');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('YOSHIMAR', 'RUIZ', '72301350' , 'carlos@gmail.com', '991855580');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('LIONEL', 'RUIZ', '72301351' , 'carlos@gmail.com', '991855581');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('SERGIO', 'RUIZ', '72301352' , 'carlos@gmail.com', '991855582');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('JOHAN', 'RUIZ', '72301353' , 'carlos@gmail.com', '991855583');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('NEYMAR', 'RUIZ', '72301354' , 'carlos@gmail.com', '991855584');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('LUKA', 'RUIZ', '72301355' , 'carlos@gmail.com', '991855585');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('GERARD', 'RUIZ', '72301356' , 'carlos@gmail.com', '991855586');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('RAFAEL', 'RUIZ', '72301357' , 'carlos@gmail.com', '991855587');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('LUIS', 'RUIZ', '72301358' , 'carlos@gmail.com', '991855588');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MIGUEL', 'RUIZ', '72301359' , 'carlos@gmail.com', '991855589');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CRISTIAN', 'RUIZ', '72301360' , 'carlos@gmail.com', '991855590');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CRISTINA', 'RUIZ', '72301361' , 'carlos@gmail.com', '991855591');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('PEPA', 'RUIZ', '72301362' , 'carlos@gmail.com', '991855592');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('PEPI', 'RUIZ', '72301363' , 'carlos@gmail.com', '991855593');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('PEPO', 'RUIZ', '72301364' , 'carlos@gmail.com', '991855594');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('PEPU', 'RUIZ', '72301365' , 'carlos@gmail.com', '991855595');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MARA', 'RUIZ', '72301366' , 'carlos@gmail.com', '991855596');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CLAUDIO', 'RUIZ', '72309367' , 'carlos@gmail.com', '991855597');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CLAUDIA', 'RUIZ', '72301368' , 'carlos@gmail.com', '991855598');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('EDSON', 'RUIZ', '72301369' , 'carlos@gmail.com', '991855599');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('HUGO', 'RUIZ', '72301370' , 'carlos@gmail.com', '991855544');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('HUMBERTO', 'RUIZ', '72301371' , 'carlos@gmail.com', '991855541');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('FIORELA', 'RUIZ', '72301372' , 'carlos@gmail.com', '991855542');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('TIFFANY', 'RUIZ', '72301373' , 'carlos@gmail.com', '991855543');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('CHUKY', 'RUIZ', '72301374' , 'carlos@gmail.com', '991855545');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('FEFE', 'RUIZ', '72301375' , 'carlos@gmail.com', '991855546');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MARQUINHOS', 'RUIZ', '72301376' , 'carlos@gmail.com', '991855547');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MAX', 'RUIZ', '72301377' , 'carlos@gmail.com', '991855548');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MAXA', 'RUIZ', '72301378' , 'carlos@gmail.com', '991855549');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MAXI', 'RUIZ', '72301379' , 'carlos@gmail.com', '991855550');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('MAXO', 'RUIZ', '72301380' , 'carlos@gmail.com', '991855571');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('GUSTAVO', 'RUIZ', '72301381' , 'carlos@gmail.com', '991855572');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('DELIA', 'RUIZ', '72301382' , 'carlos@gmail.com', '991855573');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('DEWI', 'RUIZ', '72301383' , 'carlos@gmail.com', '991855574');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('KUN', 'RUIZ', '72301384' , 'carlos@gmail.com', '991855575');
INSERT INTO paciente(nombres, apellidos, dni, email, telefono) VALUES('KUN', 'RUIZO', '72301385' , 'carlosz@gmail.com', '991855576');