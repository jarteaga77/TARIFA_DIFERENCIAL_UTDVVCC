--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: tb_foto_vehiculos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_foto_vehiculos (
    id_foto integer NOT NULL,
    id character(6),
    nombre character(64),
    foto_archivo bytea,
    id_te integer,
    fecha_registro timestamp without time zone DEFAULT now() NOT NULL
);


ALTER TABLE public.tb_foto_vehiculos OWNER TO postgres;

--
-- Name: foto_vehiculos_id_foto_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE foto_vehiculos_id_foto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.foto_vehiculos_id_foto_seq OWNER TO postgres;

--
-- Name: foto_vehiculos_id_foto_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE foto_vehiculos_id_foto_seq OWNED BY tb_foto_vehiculos.id_foto;


--
-- Name: tb_marca; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_marca (
    id_marca integer NOT NULL,
    nombre_marca character varying NOT NULL
);


ALTER TABLE public.tb_marca OWNER TO postgres;

--
-- Name: marca_id_marca_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE marca_id_marca_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.marca_id_marca_seq OWNER TO postgres;

--
-- Name: marca_id_marca_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE marca_id_marca_seq OWNED BY tb_marca.id_marca;


--
-- Name: tb_renovacion; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_renovacion (
    id_renovacion integer NOT NULL,
    id_tarjetas_especiales integer NOT NULL,
    fecha_renovacion timestamp without time zone NOT NULL,
    motivo_renovacion character varying NOT NULL,
    observacion character varying NOT NULL,
    id_usuario integer,
    fecha_mod timestamp without time zone,
    id_usuario_mod integer NOT NULL
);


ALTER TABLE public.tb_renovacion OWNER TO postgres;

--
-- Name: renovacion_id_renovacion_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE renovacion_id_renovacion_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.renovacion_id_renovacion_seq OWNER TO postgres;

--
-- Name: renovacion_id_renovacion_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE renovacion_id_renovacion_seq OWNED BY tb_renovacion.id_renovacion;


--
-- Name: tb_bloqueo_placa; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_bloqueo_placa (
    id_blq_placa integer NOT NULL,
    fecha_bloqueo date NOT NULL,
    fecha_registro timestamp with time zone DEFAULT now() NOT NULL,
    id_tipo_blq integer,
    descripcion character varying,
    id_usuario integer,
    id_te integer
);


ALTER TABLE public.tb_bloqueo_placa OWNER TO postgres;

--
-- Name: tb_bloqueo_placa_id_blq_placa_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_bloqueo_placa_id_blq_placa_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_bloqueo_placa_id_blq_placa_seq OWNER TO postgres;

--
-- Name: tb_bloqueo_placa_id_blq_placa_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_bloqueo_placa_id_blq_placa_seq OWNED BY tb_bloqueo_placa.id_blq_placa;


--
-- Name: tb_categoria; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_categoria (
    id_categoria integer NOT NULL,
    categoria character varying NOT NULL
);


ALTER TABLE public.tb_categoria OWNER TO postgres;

--
-- Name: tb_categoria_id_categoria_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_categoria_id_categoria_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_categoria_id_categoria_seq OWNER TO postgres;

--
-- Name: tb_categoria_id_categoria_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_categoria_id_categoria_seq OWNED BY tb_categoria.id_categoria;


--
-- Name: tb_data_vehiculo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_data_vehiculo (
    id_data_vehiculo integer NOT NULL,
    id_tarjetas_especiales integer NOT NULL,
    id_categoria integer NOT NULL,
    id_linea_marca integer NOT NULL,
    color character varying,
    nombre_titular character varying,
    cedula_titular character varying,
    id_usuario integer NOT NULL,
    fecha_mod timestamp without time zone,
    id_usuario_mod integer,
    fecha_registro timestamp without time zone DEFAULT now() NOT NULL,
    anio integer,
    id_tipo_vehiculo integer NOT NULL
);


ALTER TABLE public.tb_data_vehiculo OWNER TO postgres;

--
-- Name: tb_data_vehiculo_id_data_vehiculo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_data_vehiculo_id_data_vehiculo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_data_vehiculo_id_data_vehiculo_seq OWNER TO postgres;

--
-- Name: tb_data_vehiculo_id_data_vehiculo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_data_vehiculo_id_data_vehiculo_seq OWNED BY tb_data_vehiculo.id_data_vehiculo;


--
-- Name: tb_desbloque_te; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_desbloque_te (
    id_desb_te integer NOT NULL,
    fecha_desb timestamp with time zone DEFAULT now() NOT NULL,
    id_te integer NOT NULL,
    descripcion character varying NOT NULL,
    id_usuario integer NOT NULL
);


ALTER TABLE public.tb_desbloque_te OWNER TO postgres;

--
-- Name: tb_desbloque_te_id_desb_te_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_desbloque_te_id_desb_te_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_desbloque_te_id_desb_te_seq OWNER TO postgres;

--
-- Name: tb_desbloque_te_id_desb_te_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_desbloque_te_id_desb_te_seq OWNED BY tb_desbloque_te.id_desb_te;


--
-- Name: tb_doc_vehiculo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_doc_vehiculo (
    id_doc integer NOT NULL,
    fecha_doc timestamp with time zone DEFAULT now() NOT NULL,
    cer boolean NOT NULL,
    cc boolean NOT NULL,
    tp boolean NOT NULL,
    fo boolean NOT NULL,
    ac boolean NOT NULL,
    sp boolean NOT NULL,
    idusuario integer NOT NULL,
    observacion character varying NOT NULL,
    id_te integer NOT NULL
);


ALTER TABLE public.tb_doc_vehiculo OWNER TO postgres;

--
-- Name: COLUMN tb_doc_vehiculo.cer; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_doc_vehiculo.cer IS 'Certificado de residencia';


--
-- Name: COLUMN tb_doc_vehiculo.cc; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_doc_vehiculo.cc IS 'Documento de identidad';


--
-- Name: COLUMN tb_doc_vehiculo.tp; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_doc_vehiculo.tp IS 'Tarjeta de Propiedad';


--
-- Name: COLUMN tb_doc_vehiculo.fo; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_doc_vehiculo.fo IS 'Formulario';


--
-- Name: COLUMN tb_doc_vehiculo.ac; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_doc_vehiculo.ac IS 'acta';


--
-- Name: COLUMN tb_doc_vehiculo.sp; Type: COMMENT; Schema: public; Owner: postgres
--

COMMENT ON COLUMN tb_doc_vehiculo.sp IS 'Servicio Publico';


--
-- Name: tb_doc_vehiculo_id_doc_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_doc_vehiculo_id_doc_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_doc_vehiculo_id_doc_seq OWNER TO postgres;

--
-- Name: tb_doc_vehiculo_id_doc_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_doc_vehiculo_id_doc_seq OWNED BY tb_doc_vehiculo.id_doc;


--
-- Name: tb_linea_marca; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_linea_marca (
    id_linea_marca integer NOT NULL,
    id_marca integer NOT NULL,
    descripcion character varying NOT NULL
);


ALTER TABLE public.tb_linea_marca OWNER TO postgres;

--
-- Name: tb_linea_marca_id_linea_marca_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_linea_marca_id_linea_marca_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_linea_marca_id_linea_marca_seq OWNER TO postgres;

--
-- Name: tb_linea_marca_id_linea_marca_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_linea_marca_id_linea_marca_seq OWNED BY tb_linea_marca.id_linea_marca;


--
-- Name: tb_pasadas_validas; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_pasadas_validas (
    id integer NOT NULL,
    fecha timestamp without time zone DEFAULT now() NOT NULL,
    placa character varying NOT NULL,
    id_usuario integer NOT NULL
);


ALTER TABLE public.tb_pasadas_validas OWNER TO postgres;

--
-- Name: tb_pasadas_validas_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_pasadas_validas_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_pasadas_validas_id_seq OWNER TO postgres;

--
-- Name: tb_pasadas_validas_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_pasadas_validas_id_seq OWNED BY tb_pasadas_validas.id;


--
-- Name: tb_perfil; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_perfil (
    id integer NOT NULL,
    nombre_perfil character varying NOT NULL,
    descripcion character varying
);


ALTER TABLE public.tb_perfil OWNER TO postgres;

--
-- Name: tb_perfil_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_perfil_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_perfil_id_seq OWNER TO postgres;

--
-- Name: tb_perfil_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_perfil_id_seq OWNED BY tb_perfil.id;


--
-- Name: tb_tarjetas_especiales; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_tarjetas_especiales (
    id_tarjetas_especiales integer NOT NULL,
    placa character varying NOT NULL,
    estado boolean DEFAULT true,
    data_complet boolean DEFAULT false,
    fecha_registro timestamp without time zone DEFAULT now(),
    id_usuario integer NOT NULL,
    form character varying NOT NULL,
    foto boolean DEFAULT false
);


ALTER TABLE public.tb_tarjetas_especiales OWNER TO postgres;

--
-- Name: tb_tarjetas_especiales_id_tarjetas_especiales_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_tarjetas_especiales_id_tarjetas_especiales_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_tarjetas_especiales_id_tarjetas_especiales_seq OWNER TO postgres;

--
-- Name: tb_tarjetas_especiales_id_tarjetas_especiales_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_tarjetas_especiales_id_tarjetas_especiales_seq OWNED BY tb_tarjetas_especiales.id_tarjetas_especiales;


--
-- Name: tb_tipo_bloqueo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_tipo_bloqueo (
    id integer NOT NULL,
    descripcion character varying NOT NULL
);


ALTER TABLE public.tb_tipo_bloqueo OWNER TO postgres;

--
-- Name: tb_tipo_bloqueo_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_tipo_bloqueo_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_tipo_bloqueo_id_seq OWNER TO postgres;

--
-- Name: tb_tipo_bloqueo_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_tipo_bloqueo_id_seq OWNED BY tb_tipo_bloqueo.id;


--
-- Name: tb_tipo_vehiculo; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_tipo_vehiculo (
    id_tipo_vehiculo integer NOT NULL,
    descripcion character varying NOT NULL
);


ALTER TABLE public.tb_tipo_vehiculo OWNER TO postgres;

--
-- Name: tb_tipo_vehiculo_id_tipo_vehiculo_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_tipo_vehiculo_id_tipo_vehiculo_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_tipo_vehiculo_id_tipo_vehiculo_seq OWNER TO postgres;

--
-- Name: tb_tipo_vehiculo_id_tipo_vehiculo_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_tipo_vehiculo_id_tipo_vehiculo_seq OWNED BY tb_tipo_vehiculo.id_tipo_vehiculo;


--
-- Name: tb_usuario; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE tb_usuario (
    id integer NOT NULL,
    cedula character varying NOT NULL,
    nombre_usuario character varying NOT NULL,
    usuario character varying NOT NULL,
    contrasena character varying NOT NULL,
    estado boolean DEFAULT true NOT NULL,
    "creadoPor" character varying NOT NULL,
    "creadoEn" timestamp with time zone DEFAULT now() NOT NULL,
    "modificadoPor" character varying,
    "modificadoEn" timestamp with time zone,
    id_perfil integer NOT NULL
);


ALTER TABLE public.tb_usuario OWNER TO postgres;

--
-- Name: tb_usuario_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tb_usuario_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.tb_usuario_id_seq OWNER TO postgres;

--
-- Name: tb_usuario_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tb_usuario_id_seq OWNED BY tb_usuario.id;


--
-- Name: id_blq_placa; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_bloqueo_placa ALTER COLUMN id_blq_placa SET DEFAULT nextval('tb_bloqueo_placa_id_blq_placa_seq'::regclass);


--
-- Name: id_categoria; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_categoria ALTER COLUMN id_categoria SET DEFAULT nextval('tb_categoria_id_categoria_seq'::regclass);


--
-- Name: id_data_vehiculo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_data_vehiculo ALTER COLUMN id_data_vehiculo SET DEFAULT nextval('tb_data_vehiculo_id_data_vehiculo_seq'::regclass);


--
-- Name: id_desb_te; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_desbloque_te ALTER COLUMN id_desb_te SET DEFAULT nextval('tb_desbloque_te_id_desb_te_seq'::regclass);


--
-- Name: id_doc; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_doc_vehiculo ALTER COLUMN id_doc SET DEFAULT nextval('tb_doc_vehiculo_id_doc_seq'::regclass);


--
-- Name: id_foto; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_foto_vehiculos ALTER COLUMN id_foto SET DEFAULT nextval('foto_vehiculos_id_foto_seq'::regclass);


--
-- Name: id_linea_marca; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_linea_marca ALTER COLUMN id_linea_marca SET DEFAULT nextval('tb_linea_marca_id_linea_marca_seq'::regclass);


--
-- Name: id_marca; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_marca ALTER COLUMN id_marca SET DEFAULT nextval('marca_id_marca_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_pasadas_validas ALTER COLUMN id SET DEFAULT nextval('tb_pasadas_validas_id_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_perfil ALTER COLUMN id SET DEFAULT nextval('tb_perfil_id_seq'::regclass);


--
-- Name: id_renovacion; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_renovacion ALTER COLUMN id_renovacion SET DEFAULT nextval('renovacion_id_renovacion_seq'::regclass);


--
-- Name: id_tarjetas_especiales; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_tarjetas_especiales ALTER COLUMN id_tarjetas_especiales SET DEFAULT nextval('tb_tarjetas_especiales_id_tarjetas_especiales_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_tipo_bloqueo ALTER COLUMN id SET DEFAULT nextval('tb_tipo_bloqueo_id_seq'::regclass);


--
-- Name: id_tipo_vehiculo; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_tipo_vehiculo ALTER COLUMN id_tipo_vehiculo SET DEFAULT nextval('tb_tipo_vehiculo_id_tipo_vehiculo_seq'::regclass);


--
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_usuario ALTER COLUMN id SET DEFAULT nextval('tb_usuario_id_seq'::regclass);


--
-- Name: foto_vehiculos_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_foto_vehiculos
    ADD CONSTRAINT foto_vehiculos_pkey PRIMARY KEY (id_foto);


--
-- Name: marca_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_marca
    ADD CONSTRAINT marca_pkey PRIMARY KEY (id_marca);


--
-- Name: renovacion_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_renovacion
    ADD CONSTRAINT renovacion_pkey PRIMARY KEY (id_renovacion);


--
-- Name: tb_bloqueo_placa_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_bloqueo_placa
    ADD CONSTRAINT tb_bloqueo_placa_pkey PRIMARY KEY (id_blq_placa);


--
-- Name: tb_categoria_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_categoria
    ADD CONSTRAINT tb_categoria_pkey PRIMARY KEY (id_categoria);


--
-- Name: tb_data_vehiculo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_data_vehiculo
    ADD CONSTRAINT tb_data_vehiculo_pkey PRIMARY KEY (id_data_vehiculo);


--
-- Name: tb_desbloque_te_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_desbloque_te
    ADD CONSTRAINT tb_desbloque_te_pkey PRIMARY KEY (id_desb_te);


--
-- Name: tb_doc_vehiculo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_doc_vehiculo
    ADD CONSTRAINT tb_doc_vehiculo_pkey PRIMARY KEY (id_doc);


--
-- Name: tb_linea_marca_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_linea_marca
    ADD CONSTRAINT tb_linea_marca_pkey PRIMARY KEY (id_linea_marca);


--
-- Name: tb_pasadas_validas_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_pasadas_validas
    ADD CONSTRAINT tb_pasadas_validas_pkey PRIMARY KEY (id);


--
-- Name: tb_perfil_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_perfil
    ADD CONSTRAINT tb_perfil_pkey PRIMARY KEY (id);


--
-- Name: tb_tarjetas_especiales_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_tarjetas_especiales
    ADD CONSTRAINT tb_tarjetas_especiales_pkey PRIMARY KEY (id_tarjetas_especiales);


--
-- Name: tb_tarjetas_especiales_placa_key; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_tarjetas_especiales
    ADD CONSTRAINT tb_tarjetas_especiales_placa_key UNIQUE (placa);


--
-- Name: tb_tipo_bloqueo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_tipo_bloqueo
    ADD CONSTRAINT tb_tipo_bloqueo_pkey PRIMARY KEY (id);


--
-- Name: tb_tipo_vehiculo_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_tipo_vehiculo
    ADD CONSTRAINT tb_tipo_vehiculo_pkey PRIMARY KEY (id_tipo_vehiculo);


--
-- Name: tb_usuario_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_usuario
    ADD CONSTRAINT tb_usuario_pkey PRIMARY KEY (id);


--
-- Name: unique_marca; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY tb_marca
    ADD CONSTRAINT unique_marca UNIQUE (nombre_marca);


--
-- Name: fk_categoria; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_data_vehiculo
    ADD CONSTRAINT fk_categoria FOREIGN KEY (id_categoria) REFERENCES tb_categoria(id_categoria);


--
-- Name: fk_id_perfil; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_usuario
    ADD CONSTRAINT fk_id_perfil FOREIGN KEY (id_perfil) REFERENCES tb_perfil(id);


--
-- Name: fk_id_tipo; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_data_vehiculo
    ADD CONSTRAINT fk_id_tipo FOREIGN KEY (id_tipo_vehiculo) REFERENCES tb_tipo_vehiculo(id_tipo_vehiculo);


--
-- Name: fk_id_us_mod; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_renovacion
    ADD CONSTRAINT fk_id_us_mod FOREIGN KEY (id_usuario_mod) REFERENCES tb_usuario(id);


--
-- Name: fk_id_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_tarjetas_especiales
    ADD CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id);


--
-- Name: fk_id_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_renovacion
    ADD CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id);


--
-- Name: fk_id_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_bloqueo_placa
    ADD CONSTRAINT fk_id_usuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id);


--
-- Name: fk_id_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_doc_vehiculo
    ADD CONSTRAINT fk_id_usuario FOREIGN KEY (idusuario) REFERENCES tb_usuario(id);


--
-- Name: fk_idte; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_desbloque_te
    ADD CONSTRAINT fk_idte FOREIGN KEY (id_te) REFERENCES tb_tarjetas_especiales(id_tarjetas_especiales);


--
-- Name: fk_idte; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_foto_vehiculos
    ADD CONSTRAINT fk_idte FOREIGN KEY (id_te) REFERENCES tb_tarjetas_especiales(id_tarjetas_especiales);


--
-- Name: fk_idusuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_desbloque_te
    ADD CONSTRAINT fk_idusuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id);


--
-- Name: fk_idusuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_pasadas_validas
    ADD CONSTRAINT fk_idusuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id);


--
-- Name: fk_linea; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_data_vehiculo
    ADD CONSTRAINT fk_linea FOREIGN KEY (id_linea_marca) REFERENCES tb_linea_marca(id_linea_marca);


--
-- Name: fk_marca; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_linea_marca
    ADD CONSTRAINT fk_marca FOREIGN KEY (id_marca) REFERENCES tb_marca(id_marca);


--
-- Name: fk_te; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_bloqueo_placa
    ADD CONSTRAINT fk_te FOREIGN KEY (id_te) REFERENCES tb_tarjetas_especiales(id_tarjetas_especiales);


--
-- Name: fk_te; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_doc_vehiculo
    ADD CONSTRAINT fk_te FOREIGN KEY (id_te) REFERENCES tb_tarjetas_especiales(id_tarjetas_especiales);


--
-- Name: fk_te; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_data_vehiculo
    ADD CONSTRAINT fk_te FOREIGN KEY (id_tarjetas_especiales) REFERENCES tb_tarjetas_especiales(id_tarjetas_especiales);


--
-- Name: fk_tipo_blq; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_bloqueo_placa
    ADD CONSTRAINT fk_tipo_blq FOREIGN KEY (id_tipo_blq) REFERENCES tb_tipo_bloqueo(id);


--
-- Name: fk_usuario; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_data_vehiculo
    ADD CONSTRAINT fk_usuario FOREIGN KEY (id_usuario) REFERENCES tb_usuario(id);


--
-- Name: fk_usuariomod; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tb_data_vehiculo
    ADD CONSTRAINT fk_usuariomod FOREIGN KEY (id_usuario_mod) REFERENCES tb_usuario(id);


--
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

