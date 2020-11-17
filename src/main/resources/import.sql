INSERT INTO users (id, login, name, password) VALUES(1, 'art_log', 'Artem','$2y$12$LyhrRRycOxSTI/AjJaEa.eyy7.aqA0y9pq4AB70F83wQBXge6kiuO');
INSERT INTO users (id, login, name, password) VALUES(2, 'max_log', 'Max','$2y$12$j5iJB9A0.HIfX982QZkqgu5N6nt6NnKVTIqv9qpKhKa1MyFa0PDMO');

INSERT INTO roles(id, name) VALUES (1, 'USER');
INSERT INTO roles(id, name) VALUES (2, 'ADMIN');

INSERT INTO user_roles(user_id, role_id) VALUES (1, 1);
INSERT INTO user_roles(user_id, role_id) VALUES (1, 2);
INSERT INTO user_roles(user_id, role_id) VALUES (2, 1);