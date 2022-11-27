-- Stworzenie tabeli
-- IDENTITY oznacza, że ta wartośc będzie się sama inkrementować i wypełniać, nie trzeba jej wpisywać jawnie przy wstawianiu
-- PRIMARY KEY oznacza, że jest to klucz główny tej tabeli, musi być unikalny
-- NOT NULL oznacza, że pole musi być wypełnione

CREATE TABLE Persons (
    PersonID int NOT NULL IDENTITY PRIMARY KEY,
    LastName varchar(255),
    FirstName varchar(255),
	Age int NOT NULL,
    Address varchar(255),
    City varchar(255)
);