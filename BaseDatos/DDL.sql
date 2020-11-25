CREATE DATABASE extra_limpio;

USE extra_limpio;



/*
 * Tabla Region.
*/
CREATE TABLE REGION(
    cod_region INT PRIMARY KEY AUTO_INCREMENT,
    nombre_region VARCHAR(30) NOT NULL
);


/*
 * Tabla Ciudad.
*/
CREATE TABLE CIUDAD(
    cod_ciudad INT PRIMARY KEY AUTO_INCREMENT,
    nombre_ciudad VARCHAR(30) NOT NULL,
    cod_region INT NOT NULL,
    CONSTRAINT FK_CIUDAD FOREIGN KEY(cod_region) REFERENCES REGION(cod_region)
);


/*
 * Tabla Comuna.
*/
CREATE TABLE COMUNA(
    cod_comuna INT PRIMARY KEY AUTO_INCREMENT,
    nombre_comuna VARCHAR(30) NOT NULL,
    cod_ciudad INT NOT NULL,
    CONSTRAINT FK_COMUNA FOREIGN KEY(cod_ciudad) REFERENCES CIUDAD(cod_ciudad)
);




/*Tabla Sucursal. */
CREATE TABLE SUCURSAL(
    id_sucursal INT PRIMARY KEY AUTO_INCREMENT,
    direccion VARCHAR(30) NOT NULL,
    cod_comuna INT NOT NULL,
    CONSTRAINT FK_COMUNA_SUC FOREIGN KEY(cod_comuna) REFERENCES COMUNA(cod_comuna)
);


/*
 * Tabla Telefono_Sucursal.
*/
CREATE TABLE TELEFONO_SUCURSAL(
    cod_telefono_sucursal INT PRIMARY KEY AUTO_INCREMENT,
    tipo_telefono VARCHAR(30) NOT NULL,
    numero_telefono NUMERIC NOT NULL,
    id_sucursal INT NOT NULL,
    CONSTRAINT FK_TELEFONO_SUC FOREIGN KEY(id_sucursal) REFERENCES SUCURSAL(id_sucursal)
);

/*
 * Tabla Vendedor.
*/
CREATE TABLE VENDEDOR(
    id_vendedor INT PRIMARY KEY AUTO_INCREMENT,
    rut_vendedor VARCHAR(12) UNIQUE,
    nombres VARCHAR(30) NOT NULL,
    apellidoPat VARCHAR(30) NOT NULL,
    apellidoMat VARCHAR(30) NOT NULL,
    username VARCHAR(15) NOT NULL,
    password VARCHAR(15) NOT NULL,
    direccion VARCHAR(35) NOT NULL,
    email VARCHAR(35) NOT NULL,
    telefono VARCHAR(25) NOT NULL,  
    cod_comuna INT NOT NULL,
    id_sucursal INT NOT NULL,
    CONSTRAINT FK_VENDEDOR FOREIGN KEY(cod_comuna) REFERENCES COMUNA(cod_comuna),
    CONSTRAINT FK_VENDEDOR2 FOREIGN KEY(id_sucursal) REFERENCES SUCURSAL(id_sucursal)
);


/*
 * Tabla Cliente.
*/
CREATE TABLE CLIENTE(
    id_cliente INT PRIMARY KEY AUTO_INCREMENT,
    rut_cliente VARCHAR(12) UNIQUE,
    nombres VARCHAR(30),
    apellidoPat VARCHAR(30),
    apellidoMat VARCHAR(30),
    direccion VARCHAR(30) NOT NULL,
    email VARCHAR(30),
    cod_comuna INT NOT NULL,
    CONSTRAINT FK_CLIENTE FOREIGN KEY(cod_comuna) REFERENCES COMUNA(cod_comuna)
);


/*
 * Tabla Telefono Cliente.
*/
CREATE TABLE TELEFONO_CLIENTE(
    cod_telefonocli INT PRIMARY KEY AUTO_INCREMENT,
    tipo_telefono VARCHAR(30) NOT NULL,
    numero_telefono NUMERIC NOT NULL,
    id_cliente INT NOT NULL,
    CONSTRAINT FK_TELEFONO_CLI FOREIGN KEY(id_cliente) REFERENCES CLIENTE(id_cliente)
);


/*Tablas de Marca.*/
CREATE TABLE MARCA(
   cod_marca INT PRIMARY KEY,
   nombre VARCHAR(20) NOT NULL
);

CREATE TABLE TIPO_INSUMO(
   cod_tipoinsumo INT PRIMARY KEY,
   descripcion VARCHAR(30) NOT NULL
);

CREATE TABLE INSUMOS(
    cod_insumo INT PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    precio INT NOT NULL,
    FK_TIPO_INSUMO INT NOT NULL,
    FK_MARCA INT NOT NULL,
    CONSTRAINT FK_INSUMOS FOREIGN KEY(FK_TIPO_INSUMO) REFERENCES TIPO_INSUMO(cod_tipoinsumo),
    CONSTRAINT FK_INSUMOS2 FOREIGN KEY(FK_MARCA) REFERENCES MARCA(cod_marca)
);

CREATE TABLE MARCA_INSUMO(
    cod_marca INT NOT NULL,
    cod_insumo INT NOT NULL,
    CONSTRAINT PK_MARCA_INSUMO PRIMARY KEY(cod_marca, cod_insumo),
    CONSTRAINT FK_MARCA_INSUMO1 FOREIGN KEY(cod_marca) REFERENCES MARCA(cod_marca),
    CONSTRAINT FK_MARCA_INSUMO2 FOREIGN KEY(cod_insumo) REFERENCES  INSUMOS(cod_insumo)
);

CREATE TABLE PROVEEDORES(
    id_proveedor INT,
    nombre VARCHAR(30) NOT NULL,
    dirección VARCHAR(20) NOT NULL,
    cod_comuna INT NOT NULL,
    CONSTRAINT PK_PROVEEDORES PRIMARY KEY(id_proveedor),
    CONSTRAINT FK_PROVEEDORES FOREIGN KEY(cod_comuna) REFERENCES COMUNA(cod_comuna)
);

CREATE TABLE INSUMO_PROVEEDOR(
    id_proveedor INT NOT NULL,
    cod_insumo INT NOT NULL,
    CONSTRAINT PK_INSUMO_PROVEEDOR PRIMARY KEY(id_proveedor, cod_insumo),
    CONSTRAINT FK_INSUMO_PROVEEDOR FOREIGN KEY(id_proveedor) REFERENCES PROVEEDORES(id_proveedor),
    CONSTRAINT FK_INSUMO_PROVEEDOR2 FOREIGN KEY(cod_insumo) REFERENCES INSUMOS(cod_insumo) 
);

CREATE TABLE GUIA_DESPACHO(
    cod_guiadesp INT PRIMARY KEY AUTO_INCREMENT,
    fecha DATETIME NOT NULL,
    id_sucursal INT NOT NULL,
    CONSTRAINT FK_GUIA_DESPACHO_SUCURSAL FOREIGN KEY(id_sucursal) REFERENCES SUCURSAL(id_sucursal)
);

CREATE TABLE GUIA_DETALLE(
    cod_guiadesp INT NOT NULL,
    cod_insumo INT NOT NULL,
    cantidad INT NOT NULL,
    CONSTRAINT PK_GUIA_DETALLE PRIMARY KEY(cod_guiadesp),
    CONSTRAINT FK_GUIA_DETALLE_DESP FOREIGN KEY(cod_guiadesp) REFERENCES GUIA_DESPACHO(cod_guiadesp),
    CONSTRAINT FK_GUIA_DETALLE_INSUMOS FOREIGN KEY(cod_insumo) REFERENCES INSUMOS(cod_insumo)
);

CREATE TABLE SUCURSAL_INSUMO(
    id_sucursal_insumo INT NOT NULL,
    cod_insumo INT NOT NULL,
    stock INT NOT NULL,
    CONSTRAINT PK_SUCURSAL_INSUMO PRIMARY KEY(id_sucursal_insumo),
    CONSTRAINT FK_SUCURSAL_INSUMO_SUC FOREIGN KEY(id_sucursal_insumo) REFERENCES SUCURSAL(id_sucursal),
    CONSTRAINT FK_SUCURSAL_INSUMO_INS FOREIGN KEY(cod_insumo) REFERENCES INSUMOS(cod_insumo)
);

CREATE TABLE SERVICIOS(
    cod_servicio INT PRIMARY KEY,
    nombre_servicio VARCHAR(30) NOT NULL,
    descripcion VARCHAR(30) NOT NULL,
    precio INT NOT NULL,
    dias INT NOT NULL
);

CREATE TABLE INSUMO_SERVICIO(
    cod_servicio INT NOT NULL,
    cod_insumo INT NOT NULL,
    CONSTRAINT PK_INSUMO_SERVICIO PRIMARY KEY(cod_servicio),
    CONSTRAINT FK_INSUMO_SERVICIO_SER FOREIGN KEY(cod_servicio) REFERENCES SERVICIOS(cod_servicio),
    CONSTRAINT FK_INSUMO_SERVICIO_INS FOREIGN KEY(cod_insumo) REFERENCES INSUMOS(cod_insumo)
);




/*
Tabla Orden_Servicio.
*/
CREATE TABLE ORDEN_SERVICIO(
    cod_ordservicio INT PRIMARY KEY AUTO_INCREMENT,
    descripcion VARCHAR(120),
    precio_total INT,
    fecha_inicio DATETIME NOT NULL,
    fecha_entrega DATETIME NOT NULL,
    id_vendedor INT NOT NULL,
    id_cliente  INT NOT NULL,
    codigo_estado_ord INT NOT NULL,
    CONSTRAINT FK_ORDEN_SERVICIO_VEND FOREIGN KEY (id_vendedor)  REFERENCES VENDEDOR(id_vendedor),
    CONSTRAINT FK_ORDEN_SERVICIO_CLI FOREIGN KEY(id_cliente) REFERENCES CLIENTE(id_cliente)
);




/* Tabla Tipo Pago */
CREATE TABLE TIPO_PAGO(
	cod_tipo_pago INT PRIMARY KEY AUTO_INCREMENT,
    tipo_pago_descripcion VARCHAR(120)
);



/* Tabla Pago */
CREATE TABLE PAGO(
	cod_pago INT PRIMARY KEY AUTO_INCREMENT,
    monto_pago INT NOT NULL,
    fecha_pago DATETIME NOT NULL,
    cod_tipo_pago INT NOT NULL,
    CONSTRAINT FK_PAGO_TIPPAGO FOREIGN KEY(cod_tipo_pago) REFERENCES TIPO_PAGO(cod_tipo_pago)
);



/* Tabla Boleta */
CREATE TABLE BOLETA(
    cod_boleta INT PRIMARY KEY AUTO_INCREMENT,
    neto INT NOT NULL,
    iva INT NOT NULL,
    total INT NOT NULL,
    cod_ordservicio INT NOT NULL,
    cod_pago INT NOT NULL,
    CONSTRAINT FK_BOLETA_PAGO FOREIGN KEY (cod_pago) REFERENCES PAGO(cod_pago),
    CONSTRAINT FK_BOLETA_ORDEN_SERVICIO FOREIGN KEY(cod_ordservicio) REFERENCES ORDEN_SERVICIO(cod_ordservicio) 
);


/* Tabla Tipo Prenda */
CREATE TABLE TIPO_PRENDA(
    cod_tipPrenda INT PRIMARY KEY AUTO_INCREMENT,
    tipo_prenda INT NOT NULL
);

/*Tabla Prenda*/
CREATE TABLE PRENDA(
    cod_prenda INT PRIMARY KEY AUTO_INCREMENT,
    descripcion VARCHAR(120) NOT NULL,
    color VARCHAR(20) NOT NULL,
    cod_tipPrenda INT NOT NULL,
    CONSTRAINT FK_PRENDA FOREIGN KEY (cod_tipPrenda) REFERENCES TIPO_PRENDA(cod_tipPrenda)
);

/*Tabla Prenda Servicios*/
CREATE TABLE PRENDA_SERVICIOS(
    cod_servicio INT NOT NULL,
    cod_prenda INT NOT NULL,
    CONSTRAINT PK_PRENDA_SERVICIOS PRIMARY KEY(cod_servicio),
    CONSTRAINT FK_PRENDA_SERVICIOS_SER FOREIGN KEY(cod_servicio) REFERENCES SERVICIOS(cod_servicio),
    CONSTRAINT FK_PRENDA_SERVICIOS_PRE FOREIGN KEY(cod_prenda) REFERENCES PRENDA(cod_prenda)
);

