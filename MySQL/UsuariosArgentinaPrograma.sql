use argentina_programa;
CREATE TABLE Usuarios(
   id INT PRIMARY KEY AUTO_INCREMENT,
   usuario VARCHAR(20),
   nombre VARCHAR(20),
   sexo VARCHAR(1),
   nivel TINYINT,
   email VARCHAR(50),
   telefono VARCHAR(20),
   marca VARCHAR(20),
   compania VARCHAR(20),
   saldo FLOAT,
   activo BOOLEAN
);
INSERT INTO Usuarios 
VALUES 
('1','BRE2271','BRENDA','M','2','brenda@live.com','655-330-5736','SAMSUNG','IUSACELL','100','1'),
('2','OSC4677','OSCAR','H','3','oscar@gmail.com','655-143-4181','LG','TELCEL','0','1'),
('3','JOS7086','JOSE','H','3','francisco@gmail.com','655-143-3922','NOKIA','MOVISTAR','150','1'),
('4','LUI6115','LUIS','H','0','enrique@outlook.com','655-137-1279','SAMSUNG','TELCEL','50','1'),
('5','LUI7072','LUIS','H','1','luis@hotmail.com','655-100-8260','NOKIA','IUSACELL','50','0'),
('6','DAN2832','DANIEL','H','0','daniel@outlook.com','655-145-2586','SONY','UNEFON','100','1'),
('7','JAQ5351','JAQUELINE','M','0','jaqueline@outlook.com','655-330-5514','BLACKBERRY','AXEL','0','1'),
('8','ROM6520','ROMAN','H','2','roman@gmail.com','655-330-3263','LG','IUSACELL','50','1'),
('9','BLA9739','BLAS','H','0','blas@hotmail.com','655-330-3871','LG','UNEFON','100','1'),
('10','JES4752','JESSICA','M','1','jessica@hotmail.com','655-143-6861','SAMSUNG','TELCEL','500','1'),
('11','DIA6570','DIANA','M','1','diana@live.com','655-143-3952','SONY','UNEFON','100','0'),
('12','RIC8283','RICARDO','H','2','ricardo@hotmail.com','655-145-6049','MOTOROLA','IUSACELL','150','1'),
('13','VAL6882','VALENTINA','M','0','valentina@live.com','655-137-4253','BLACKBERRY','AT&T','50','0'),
('14','BRE8106','BRENDA','M','3','brenda2@gmail.com','655-100-1351','MOTOROLA','NEXTEL','150','1'),
('15','LUC4982','LUCIA','M','3','lucia@gmail.com','655-145-4992','BLACKBERRY','IUSACELL','0','1'),
('16','JUA2337','JUAN','H','0','juan@outlook.com','655-100-6517','SAMSUNG','AXEL','0','0'),
('17','ELP2984','ELPIDIO','H','1','elpidio@outlook.com','655-145-9938','MOTOROLA','MOVISTAR','500','1'),
('18','JES9640','JESSICA','M','3','jessica2@live.com','655-330-5143','SONY','IUSACELL','200','1'),
('19','LET4015','LETICIA','M','2','leticia@yahoo.com','655-143-4019','BLACKBERRY','UNEFON','100','1'),
('20','LUI1076','LUIS','H','3','luis2@live.com','655-100-5085','SONY','UNEFON','150','1'),
('21','HUG5441','HUGO','H','2','hugo@live.com','655-137-3935','MOTOROLA','AT&T','500','1');
-- Listar los nombres de los usuarios
select Nombre from Usuarios;
-- Calcular es saldo maximo de los usuarios de sexo "mujer"
SELECT MAX(saldo) FROM Usuarios WHERE sexo = 'M';
-- Listar los nombre y telefono de los usuarios con telefono NOKIA, BLACBERRY O SONY
SELECT Nombre, marca FROM Usuarios WHERE marca = 'MOTOROLA' OR marca = 'Nokia' OR marca = 'SONY';
-- Contar los usuarios sin saldo o inactivos
SELECT COUNT(nombre) from Usuarios WHERE saldo = 0 OR activo = FALSE;
-- Listar el login de los usuarios con nivel 1, 2 o 3
SELECT usuario, nivel FROM Usuarios WHERE nivel >= 1;
-- Listar los numeros de telefono con saldo menor o igual a 300
SELECT nombre, telefono FROM Usuarios WHERE saldo <= 300;
-- Calcular la suma de los saldos de los usuarios de la compañia telefonica NEXTEL
SELECT SUM(saldo) FROM Usuarios WHERE compania = 'NEXTEL';
-- Contar el numero de usuarios por compañia telefonica
SELECT compania, COUNT(*) FROM Usuarios GROUP BY compania;
-- Contar el numero de usuarios por nivel
SELECT nivel, COUNT(*) FROM Usuarios GROUP BY nivel;
-- 10 Listar el LOGIN de los usuarios nivel 2
SELECT usuario FROM Usuarios WHERE nivel = 2;
-- Mostrar el email de los usuarios que usen gmail
SELECT usuario, email FROM Usuarios WHERE email LIKE '%gmail%' ;
-- Listar nombre y telefono de los usuarios con telefono LG, SAMSUNG O MOTOROLA.
SELECT nombre, telefono FROM Usuarios WHERE marca = 'LG' OR marca = 'SAMSUNG' OR marca = 'MOTOROLA';
-- Listar nombre y telefono de los usuarios con telefono que no sea LG o SAMSUNG.
SELECT nombre, telefono, marca FROM Usuarios WHERE NOT marca = 'LG' AND NOT marca = 'SAMSUNG';
-- Listar el login y telefono de los usuarios con compañia telefonica USACELL
SELECT usuario, telefono FROM usuarios where compania = 'IUSACELL';
-- Listar el login y telefono de los usuarios con compañia telefonica no sea TELCEL
SELECT usuario, telefono, compania FROM usuarios WHERE NOT compania = 'TELCEL';
-- Calcular el saldo promedio de los usuarios que tienen telefono marca NOKIA
SELECT AVG(saldo) FROM usuarios WHERE marca = 'NOKIA';
-- Listar el login y telefono de los usuarios con compañia telefonica IUSACELL o AXEL
SELECT usuario, telefono, compania FROM usuarios WHERE compania = 'IUSACELL' OR compania = 'AXEL';
-- Mostrar el email de los usuarios que no usan yahoo
SELECT email FROM usuarios WHERE NOT email LIKE('%yahoo%');
-- Listar el login y teléfono de los usuarios con compañía telefónica que no sea TELCEL o IUSACELL
SELECT usuario, telefono, compania FROM usuarios WHERE NOT compania = 'TELCEL' AND NOT compania = 'IUSACELL';
-- Listar el login y teléfono de los usuarios con compañía telefónica UNEFON
SELECT usuario, telefono, compania FROM usuarios WHERE compania = 'UNEFON';
-- Listar las diferentes marcas de celular en orden alfabético descendentemente
SELECT DISTINCT marca FROM usuarios ORDER BY marca ASC;
-- Listar las diferentes compañías en orden alfabético aleatorio
SELECT DISTINCT compania FROM Usuarios ORDER BY RAND();
-- Listar el login de los usuarios con nivel 0 o 2
SELECT usuario, nivel FROM usuarios WHERE nivel = 0 OR nivel = 2;
-- Calcular el saldo promedio de los usuarios que tienen teléfono marca LG
SELECT AVG(saldo) FROM usuarios WHERE marca = 'LG';
-- Listar el login de los usuarios con nivel 1 o 3
SELECT usuario, nivel FROM usuarios WHERE nivel = 1 OR nivel = 3 ORDER BY nivel ASC;
-- Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca BLACKBERRY
SELECT nombre, telefono, marca FROM usuarios WHERE  marca != 'BLACKBERRY';
-- Listar el login de los usuarios con nivel 3
SELECT usuario, nivel FROM usuarios WHERE nivel = 3;
-- Listar el login de los usuarios con nivel 0
SELECT usuario, nivel FROM usuarios WHERE nivel = 0;
-- Listar el login de los usuarios con nivel 1
SELECT usuario, nivel FROM usuarios WHERE nivel = 1;
-- Contar el número de usuarios por sexo
SELECT sexo, COUNT(usuario) FROM usuarios GROUP BY sexo;
-- Listar el login y teléfono de los usuarios con compañía telefónica AT&T
SELECT usuario, telefono, compania FROM usuarios WHERE compania = 'AT&T';
-- Listar las diferentes compañías en orden alfabético descendentemente
SELECT DISTINCT compania FROM usuarios ORDER BY compania ASC;
-- Listar el login de los usuarios inactivos
SELECT usuario, estado FROM usuarios WHERE compania = 'AT&T';
-- Listar los números de teléfono sin saldo
SELECT telefono, saldo FROM usuarios WHERE saldo <= 0;
-- Calcular el saldo mínimo de los usuarios de sexo “Hombre”
SELECT MIN(saldo) FROM usuarios WHERE sexo = 'H';
-- Listar los números de teléfono con saldo mayor a 300
SELECT usuario, telefono, saldo FROM usuarios WHERE saldo >= 300;
-- Contar el número de usuarios por marca de teléfono
SELECT marca, COUNT(usuario) FROM usuarios GROUP BY marca;
-- Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca LG
SELECT nombre, telefono, marca FROM usuarios WHERE marca != 'LG';
-- Listar las diferentes compañías en orden alfabético ascendentemente
SELECT DISTINCT compania FROM usuarios ORDER BY compania ASC;
-- Calcular la suma de los saldos de los usuarios de la compañía telefónica UNEFON
SELECT SUM(saldo) FROM usuarios WHERE compania = 'UNEFON'; 
-- Mostrar el email de los usuarios que usan hotmail
SELECT usuario, email FROM usuarios WHERE email LIKE '%hotmail%';
-- Listar los nombres de los usuarios sin saldo o inactivos
SELECT nombre, saldo, activo FROM usuarios WHERE saldo = 0 OR activo = FALSE;
-- Listar el login y teléfono de los usuarios con compañía telefónica IUSACELL o TELCEL
SELECT usuario, telefono, compania 
FROM usuarios 
WHERE compania = 'IUSACELL' OR compania = 'TELCEL' 
ORDER BY compania ASC;
-- Listar las diferentes marcas de celular en orden alfabético ascendentemente
SELECT DISTINCT marca 
FROM usuarios
ORDER BY marca ASC;
-- Listar las diferentes marcas de celular en orden alfabético aleatorio
SELECT DISTINCT marca 
FROM usuarios
ORDER BY 
RAND();
-- Listar el login y teléfono de los usuarios con compañía telefónica IUSACELL o UNEFON
SELECT usuario, telefono, compania FROM usuarios WHERE compania = 'IUSACELL' OR compania = 'UNEFON' ORDER BY compania ASC;
-- Listar nombre y teléfono de los usuarios con teléfono que no sea de la marca MOTOROLA o NOKIA
SELECT usuario, telefono, marca FROM usuarios WHERE compania != 'MOTOROLA' OR compania != 'NOKIA' ORDER BY marca ASC;
-- Calcular la suma de los saldos de los usuarios de la compañía telefónica TELCEL
SELECT SUM(saldo) FROM Usuarios  WHERE compania = 'TELCEL';






