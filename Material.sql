DROP DATABASE IF EXISTS CMS;

CREATE DATABASE CMS;

\connect CMS

CREATE TABLE public.Material (
    file_name varchar NOT NULL,
	file_path varchar NOT NULL,
    course_name varchar NOT NULL,
	id int NOT NULL GENERATED ALWAYS AS IDENTITY,
	CONSTRAINT material_pk PRIMARY KEY (id)
);

CREATE TABLE public.Course (
    course_name varchar NOT NULL,
    description varchar NOT NULL,
    catagory varchar NOT NULL,
    id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    CONSTRAINT course_pk PRIMARY KEY(id)
);
CREATE TABLE public.Student (
    first_name varchar NOT NULL,
    last_name varchar NOT NULL,
    gender varchar NOT NULL,
    average int NOT NULL,
    grade varchar NOT NULL,    
    id int NOT NULL GENERATED ALWAYS AS IDENTITY,
    CONSTRAINT student_pk PRIMARY KEY(id)
);

