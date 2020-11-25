/*==============================================================*/
/* Table: BOLETA                                                */
/*==============================================================*/
create table BOLETA
(
   ID_BOLETA            int not null,
   ID_METODO_PAGO       int not null,
   IDORDEN              int not null,
   NETO                 int not null,
   IVA                  int not null,
   primary key (ID_BOLETA)
);

/*==============================================================*/
/* Table: CIUDAD                                                */
/*==============================================================*/
create table CIUDAD
(
   ID_CIUDAD            int not null,
   ID_REGION            int not null,
   NOMBRE_CIUDAD        varchar(20) not null,
   primary key (ID_CIUDAD)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   ID_CLIENTE           int not null,
   ID_COMUNA            int not null,
   RUT_CLIENTE          varchar(10) not null,
   NOMBRE_CLIENTE       varchar(20) not null,
   APELLIDO_PATERNO_CLIENTE varchar(20),
   APELLIDO_MATERNO_CLIENTE varchar(20) not null,
   DIRECCION_CLIENTE    varchar(20) not null,
   CORREO_CLIENTE       varchar(20) not null,
   primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Table: COMUNA                                                */
/*==============================================================*/
create table COMUNA
(
   ID_COMUNA            int not null,
   ID_CIUDAD            int not null,
   NOMBRE_COMUNA        varchar(20) not null,
   primary key (ID_COMUNA)
);

/*==============================================================*/
/* Table: DETALLE_ORDEN                                         */
/*==============================================================*/
create table DETALLE_ORDEN
(
   IDDETALLE            int not null,
   IDORDEN              int not null,
   ID_TIPO_PRENDA       int not null,
   ID_ESTADO_DET        int not null,
   OBSERVACION_PRENDA   varchar(60),
   primary key (IDDETALLE)
);

/*==============================================================*/
/* Table: DETALLE_SERVICIO_PRENDA                               */
/*==============================================================*/
create table DETALLE_SERVICIO_PRENDA
(
   IDNUB_RECEPCION_SERVICIO int not null,
   ID_SERVICIO          int not null,
   IDDETALLE            int,
   primary key (IDNUB_RECEPCION_SERVICIO)
);

/*==============================================================*/
/* Table: ESTADO_DETALLE_ORDEN                                  */
/*==============================================================*/
create table ESTADO_DETALLE_ORDEN
(
   ID_ESTADO_DET        int not null,
   DESCRIPCION          varchar(20),
   primary key (ID_ESTADO_DET)
);

/*==============================================================*/
/* Table: ESTADO_ORDEN                                          */
/*==============================================================*/
create table ESTADO_ORDEN
(
   ID_ESTADO            int not null,
   NOMBRE_ESTADO        varchar(20) not null,
   primary key (ID_ESTADO)
);

/*==============================================================*/
/* Table: METODO_PAGO                                           */
/*==============================================================*/
create table METODO_PAGO
(
   ID_METODO_PAGO       int not null,
   NOMBRE_METODO_PAGO   varchar(20) not null,
   primary key (ID_METODO_PAGO)
);

/*==============================================================*/
/* Table: ORDEN_SERVICIO                                        */
/*==============================================================*/
create table ORDEN_SERVICIO
(
   IDORDEN              int not null,
   ID_CLIENTE           int not null,
   ID_VENDEDOR          int not null,
   ID_ESTADO            int not null,
   ID_BOLETA            int,
   FECHA_RECEPCION      datetime not null,
   FECHA_ENTREGA        datetime,
   primary key (IDORDEN)
);

/*==============================================================*/
/* Table: REGIONES                                              */
/*==============================================================*/
create table REGIONES
(
   ID_REGION            int not null,
   NOMBRE_REGION        varchar(20) not null,
   primary key (ID_REGION)
);

/*==============================================================*/
/* Table: SERVICIO                                              */
/*==============================================================*/
create table SERVICIO
(
   ID_SERVICIO          int not null,
   ID_TIPO_SERVICIO     int not null,
   PRECIO               int not null,
   DIAS                 int,
   primary key (ID_SERVICIO)
);

/*==============================================================*/
/* Table: SUCURSAL                                              */
/*==============================================================*/
create table SUCURSAL
(
   ID_SUCURSAL          int not null,
   ID_COMUNA            int not null,
   DIRECCION_SUCURSAL   varchar(20) not null,
   CORREO_SUCURSAL      varchar(20) not null,
   primary key (ID_SUCURSAL)
);

/*==============================================================*/
/* Table: TELEFONOS_CLIENTE                                     */
/*==============================================================*/
create table TELEFONOS_CLIENTE
(
   ID_TELEFONOS_CLIENTE int not null,
   ID_CLIENTE           int not null,
   NUMERO_CLIENTE       int not null,
   primary key (ID_TELEFONOS_CLIENTE)
);

/*==============================================================*/
/* Table: TELEFONOS_SUCURSAL                                    */
/*==============================================================*/
create table TELEFONOS_SUCURSAL
(
   ID_TELEFONOS_SUCURSAL int not null,
   ID_SUCURSAL          int not null,
   NUMERO_SUCURSAL      int not null,
   primary key (ID_TELEFONOS_SUCURSAL)
);

/*==============================================================*/
/* Table: TIPO_PRENDA                                           */
/*==============================================================*/
create table TIPO_PRENDA
(
   ID_TIPO_PRENDA       int not null,
   DESCRIPCION          varchar(20),
   primary key (ID_TIPO_PRENDA)
);

/*==============================================================*/
/* Table: TIPO_SERVICIO                                         */
/*==============================================================*/
create table TIPO_SERVICIO
(
   ID_TIPO_SERVICIO     int not null,
   NOMBRE_SERVICIO      varchar(20) not null,
   primary key (ID_TIPO_SERVICIO)
);

/*==============================================================*/
/* Table: VENDEDOR                                              */
/*==============================================================*/
create table VENDEDOR
(
   ID_VENDEDOR          int not null,
   ID_SUCURSAL          int not null,
   ID_COMUNA            int,
   RUT_VENDEDOR         varchar(15) not null,
   NOMBRE_VENDEDOR      varchar(20) not null,
   APELLIDO_PATERNO_VENDEDOR varchar(20) not null,
   APELLIDO_MATERNO_VENDEDOR varchar(20),
   DIRECCION_VENDEDOR   varchar(20) not null,
   TELEFONO_VENDEDOR    int,
   primary key (ID_VENDEDOR)
);

alter table BOLETA add constraint FK_PERMITE foreign key (ID_METODO_PAGO)
      references METODO_PAGO (ID_METODO_PAGO) on delete restrict on update restrict;

alter table BOLETA add constraint FK_SE_GENERA foreign key (IDORDEN)
      references ORDEN_SERVICIO (IDORDEN) on delete restrict on update restrict;

alter table CIUDAD add constraint FK_CONTIENE foreign key (ID_REGION)
      references REGIONES (ID_REGION) on delete restrict on update restrict;

alter table CLIENTE add constraint FK_POSEE_ foreign key (ID_COMUNA)
      references COMUNA (ID_COMUNA) on delete restrict on update restrict;

alter table COMUNA add constraint FK_POSEE foreign key (ID_CIUDAD)
      references CIUDAD (ID_CIUDAD) on delete restrict on update restrict;

alter table DETALLE_ORDEN add constraint FK_CONTROLA foreign key (ID_ESTADO_DET)
      references ESTADO_DETALLE_ORDEN (ID_ESTADO_DET) on delete restrict on update restrict;

alter table DETALLE_ORDEN add constraint FK_SE_CREAN foreign key (IDORDEN)
      references ORDEN_SERVICIO (IDORDEN) on delete restrict on update restrict;

alter table DETALLE_ORDEN add constraint FK_SE_ENCUENTRA foreign key (ID_TIPO_PRENDA)
      references TIPO_PRENDA (ID_TIPO_PRENDA) on delete restrict on update restrict;

alter table DETALLE_SERVICIO_PRENDA add constraint FK_DETALLE_PRENDA foreign key (IDDETALLE)
      references DETALLE_ORDEN (IDDETALLE) on delete restrict on update restrict;

alter table DETALLE_SERVICIO_PRENDA add constraint FK_DETALLE_SERVICIO foreign key (ID_SERVICIO)
      references SERVICIO (ID_SERVICIO) on delete restrict on update restrict;

alter table ORDEN_SERVICIO add constraint FK_CONTROLAN foreign key (ID_ESTADO)
      references ESTADO_ORDEN (ID_ESTADO) on delete restrict on update restrict;

alter table ORDEN_SERVICIO add constraint FK_GENERAN foreign key (ID_VENDEDOR)
      references VENDEDOR (ID_VENDEDOR) on delete restrict on update restrict;

alter table ORDEN_SERVICIO add constraint FK_SE_GENERA2 foreign key (ID_BOLETA)
      references BOLETA (ID_BOLETA) on delete restrict on update restrict;

alter table ORDEN_SERVICIO add constraint FK_SE_RESGISTRA foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE) on delete restrict on update restrict;

alter table SERVICIO add constraint FK_TIENEN foreign key (ID_TIPO_SERVICIO)
      references TIPO_SERVICIO (ID_TIPO_SERVICIO) on delete restrict on update restrict;

alter table SUCURSAL add constraint FK_AGRUPA foreign key (ID_COMUNA)
      references COMUNA (ID_COMUNA) on delete restrict on update restrict;

alter table TELEFONOS_CLIENTE add constraint FK_UTILIZAN foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE) on delete restrict on update restrict;

alter table TELEFONOS_SUCURSAL add constraint FK_UTILIZA foreign key (ID_SUCURSAL)
      references SUCURSAL (ID_SUCURSAL) on delete restrict on update restrict;

alter table VENDEDOR add constraint FK_RELATIONSHIP_19 foreign key (ID_COMUNA)
      references COMUNA (ID_COMUNA) on delete restrict on update restrict;

alter table VENDEDOR add constraint FK_SE_UTILIZAN foreign key (ID_SUCURSAL)
      references SUCURSAL (ID_SUCURSAL) on delete restrict on update restrict;