-- Department
INSERT INTO department(id, department_name)
VALUES (1,'Computer Science');

-- Students
INSERT INTO student(id, student_name, department_id)
VALUES (1,'Rahul',1);

INSERT INTO student(id, student_name, department_id)
VALUES (2,'Anita',1);

-- Courses
INSERT INTO course(id, course_name, student_id)
VALUES (1,'Java',1);

INSERT INTO course(id, course_name, student_id)
VALUES (2,'Spring Boot',1);

INSERT INTO course(id, course_name, student_id)
VALUES (3,'Database',2);