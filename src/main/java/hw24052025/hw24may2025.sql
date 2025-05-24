CREATE TABLE Departments (
                             Id INT AUTO_INCREMENT PRIMARY KEY,
                             Name NVARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Groups (
                        Id INT AUTO_INCREMENT PRIMARY KEY,
                        Name NVARCHAR(10) NOT NULL UNIQUE,
                        Year INT NOT NULL CHECK (Year BETWEEN 1 AND 5),
                        departmentId INT NOT NULL,
                        FOREIGN KEY (DepartmentId) REFERENCES Departments(Id)
);

CREATE TABLE Subjects (
                          Id INT AUTO_INCREMENT PRIMARY KEY,
                          Name NVARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Teachers (
                          Id INT AUTO_INCREMENT PRIMARY KEY,
                          Name NVARCHAR(50) NOT NULL,
                          Surname NVARCHAR(50) NOT NULL,
                          Salary INT NOT NULL CHECK (Salary >= 0)
);

INSERT INTO Groups (id, name, year, departmentId)
VALUES (1, 'JAVA411', 1,1);

SELECT * FROM Groups;

UPDATE Groups SET Year = 2024 WHERE Id = 1;

DELETE FROM Groups WHERE Id = 1;

INSERT INTO Subjects (Id, Name)
VALUES (1, 'Java-Разработка');

SELECT * FROM Subjects;

UPDATE Subjects SET  Name = 'Java-Development' WHERE Id = 1;

DELETE FROM Subjects WHERE Id = 1;

INSERT INTO Teachers (Id, Name, Surname, Salary)
VALUES (1, 'Фарид', 'Абдуллаев', 100000);

SELECT * FROM Teachers;

UPDATE Teachers SET Salary = 150000 WHERE Id = 1;

DELETE FROM Teachers WHERE Id = 1;