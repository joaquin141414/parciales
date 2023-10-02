-- Eliminar las tablas si ya existen
DROP TABLE IF EXISTS loans CASCADE;
DROP TABLE IF EXISTS library_items CASCADE;
DROP TABLE IF EXISTS users CASCADE;

-- Crear la tabla users
CREATE TABLE users (
                       user_id SERIAL PRIMARY KEY,
                       username VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL,
                       email VARCHAR(255) NOT NULL,
                       user_type VARCHAR(255) NOT NULL CHECK (user_type IN ('Student', 'Professor'))
);

-- Poblar la tabla users
INSERT INTO users (username, password, email, user_type) VALUES
                                                             ('linus', 'linux123', 'linus@linux.com', 'Professor'),
                                                             ('billg', 'windows95', 'bill@microsoft.com', 'Professor'),
                                                             ('dhh', 'rails123', 'dhh@rails.com', 'Professor'),
                                                             ('guido', 'python123', 'guido@python.org', 'Professor'),
                                                             ('john_student', 'student123', 'john@student.com', 'Student'),
                                                             ('mary_student', 'student123', 'mary@student.com', 'Student'),
                                                             ('paul_student', 'student123', 'paul@student.com', 'Student'),
                                                             ('lisa_student', 'student123', 'lisa@student.com', 'Student'),
                                                             ('mike_student', 'student123', 'mike@student.com', 'Student'),
                                                             ('kate_student', 'student123', 'kate@student.com', 'Student');

-- Crear la tabla library_items
CREATE TABLE library_items (
                               item_id SERIAL PRIMARY KEY,
                               title VARCHAR(255) NOT NULL,
                               item_type VARCHAR(255) NOT NULL CHECK (item_type IN ('Book', 'Magazine')),
                               author VARCHAR(255),  -- Solo para libros
                               publication_year INTEGER,  -- Solo para libros
                               editor VARCHAR(255),  -- Solo para revistas
                               issue_date DATE  -- Solo para revistas
);

-- Poblar la tabla library_items
INSERT INTO library_items (title, item_type, author, publication_year, editor, issue_date) VALUES
                                                                                               ('Clean Code', 'Book', 'Robert C. Martin', 2008, NULL, NULL),
                                                                                               ('The Pragmatic Programmer', 'Book', 'Andy Hunt and Dave Thomas', 1999, NULL, NULL),
                                                                                               ('Design Patterns', 'Book', 'Erich Gamma et al.', 1994, NULL, NULL),
                                                                                               ('Refactoring', 'Book', 'Martin Fowler', 1999, NULL, NULL),
                                                                                               ('JavaScript: The Good Parts', 'Book', 'Douglas Crockford', 2008, NULL, NULL),
                                                                                               ('Software Developer Life', 'Magazine', NULL, NULL, 'John Doe', '2023-09-30'),
                                                                                               ('Coding World', 'Magazine', NULL, NULL, 'Jane Doe', '2023-09-15'),
                                                                                               ('Frontend Magazine', 'Magazine', NULL, NULL, 'Mike Developer', '2023-09-01'),
                                                                                               ('Backend Developer', 'Magazine', NULL, NULL, 'Alice Developer', '2023-08-20'),
                                                                                               ('Full Stack Developer', 'Magazine', NULL, NULL, 'Bob Developer', '2023-08-10');

-- Crear la tabla loans
CREATE TABLE loans (
                       loan_id SERIAL PRIMARY KEY,
                       user_id INTEGER REFERENCES users(user_id),
                       item_id INTEGER REFERENCES library_items(item_id),
                       loan_date DATE NOT NULL,
                       return_date DATE NOT NULL
);

-- Poblar la tabla loans
INSERT INTO loans (user_id, item_id, loan_date, return_date) VALUES
                                                                 (1, 1, '2023-09-01', '2023-09-15'),
                                                                 (2, 2, '2023-09-02', '2023-09-16'),
                                                                 (3, 3, '2023-09-03', '2023-09-17'),
                                                                 (4, 4, '2023-09-04', '2023-09-18'),
                                                                 (5, 5, '2023-09-05', '2023-09-19'),
                                                                 (6, 6, '2023-09-06', '2023-09-20'),
                                                                 (7, 7, '2023-09-07', '2023-09-21'),
                                                                 (8, 8, '2023-09-08', '2023-09-22'),
                                                                 (9, 9, '2023-09-09', '2023-09-23'),
                                                                 (10, 10, '2023-09-10', '2023-09-24');
