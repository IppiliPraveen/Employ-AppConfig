--SQL SCRPT

-- Drop and create the database
DROP DATABASE IF EXISTS employ_management_db;
CREATE DATABASE employ_management_db;
USE employ_management_db;

-- We'll prefix table names if needed, but here we just use the DB.

-- Drop existing tables if they exist
DROP TABLE IF EXISTS emp_dtl_tb;
DROP TABLE IF EXISTS emp_login_tb;

-- Create emp_dtl_tb table with ENUM
CREATE TABLE emp_dtl_tb (
    e_emp_id VARCHAR(10) NOT NULL,
    e_nam VARCHAR(50),
    e_gender ENUM('MALE', 'FEMALE'),
    e_dept VARCHAR(30),
    e_desig VARCHAR(30),
    e_basic INT,
    e_status VARCHAR(1), -- NEW COLUMN ADDED
    PRIMARY KEY (e_emp_id)
);

-- Insert data into emp_dtl_tb
-- Insert data into emp_dtl_tb
INSERT INTO emp_dtl_tb (e_emp_id, e_nam, e_gender, e_dept, e_desig, e_basic, e_status) VALUES
('EHYD001', 'kiran kumar', 'MALE', 'java', 'developer', 42233, 'A'),
('EHYD002', 'Vishnu Vardhan', 'MALE', 'dotnet', 'programmer', 42133, 'A'),
('EHYD003', 'Ram Kishan', 'MALE', 'java', 'developer', 82233, 'A'),
('EHYD004', 'Vandhana', 'FEMALE', 'dotnet', 'programmer', 52234, 'A'),
('EHYD005', 'Sheik Sulthan', 'FEMALE', 'dotnet', 'developer', 42555, 'A');


-- Create l_login_tb table
CREATE TABLE emp_login_tb (
    l_user_id VARCHAR(20) NOT NULL,
    l_pswd VARCHAR(20),
    l_acs_ty VARCHAR(10),
    PRIMARY KEY (l_user_id)
);

-- Insert data into l_login_tb
INSERT INTO emp_login_tb (l_user_id, l_pswd, l_acs_ty) VALUES
('Praveen', 'Ippili!0909', 'normal'),
('Naveen', 'Naveen!0601', 'normal'),
('Ippili', 'Ippili@0909', 'admin');

select * from emp_dtl_tb;

select * from emp_login_tb;
