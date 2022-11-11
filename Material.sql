DROP DATABASE IF EXISTS CMS;

CREATE DATABASE CMS;

\connect CMS

CREATE TABLE public.Material (
    file_name varchar NOT NULL,
	file_path varchar NOT NULL,
    course_name varchar NOT NULL,
	id int4 NOT NULL GENERATED ALWAYS AS IDENTITY,
	CONSTRAINT material_pk PRIMARY KEY (id)
);
