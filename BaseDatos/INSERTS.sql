

/* Insert a la tabla regiones */
/* Comienzo el llenado real de las Ubicaciones Geograficas */

insert into region (cod_region, nombre_region)
values(null ,'Tarapaca'),
(null ,'Antofagasta'),
(null ,'Atacama'),
(null ,'Region Metropolitana'),
(null ,'Los Lagos');







/* Insert a la tabla ciudad */
insert into ciudad(cod_ciudad, nombre_ciudad, cod_region)
values (null, 'Gran Santiago', 4);





/* Inser a la comuna*/
insert into comuna(cod_comuna, nombre_comuna, cod_ciudad)
values 
(null, 'Santiago', 1),
(null, 'Cerrillos', 1),
(null, 'Cerro Navia', 1),
(null, 'Conchalí', 1),
(null, 'El Bosque', 1),
(null, 'Estación Central', 1),
(null, 'Huechuraba', 1),
(null, 'Independencia', 1),
(null, 'La Cisterna', 1),
(null, 'La Florida', 1),
(null, 'La Granja', 1),
(null, 'La Pintana', 1),
(null, 'La Reina', 1),
(null, 'Las Condes', 1),
(null, 'Ñuñoa', 1),
(null, 'Peñalolén', 1),
(null, 'Quinta Normal', 1),
(null, 'Recoleta', 1);



/* Insert a la tabla Sucursal */
insert into sucursal(id_sucursal, direccion, cod_comuna)
values (null, 'Santos Dumont 1244', 8),
(null, 'Av. Pdte. Kennedy Lateral 9001', 14),
(null, 'Vicuña Mackenna 7110', 10);


/* Insert a la tabla Vendedor */
insert into vendedor(id_vendedor, rut_vendedor, nombres, apellidoPat, apellidoMat, username, password, direccion,
email, telefono, cod_comuna, id_sucursal)
values(null, '19243198-0', 'Francisco Ignacio', 'Berwart', 'Ramirez', 'pancho', 'admin', 'Longitudinal 2824',
'franciscoignaciob2106@gmail.com', 33836519, 15, 3),
(null, '8703816-5', 'Carlos Patricio', 'Guajardo', 'Gutiérrez', 'profe', 'profe', 'Desconocida',
'carlos.guajardo13@inacapmail.cl', 55688475, 15, 3);


