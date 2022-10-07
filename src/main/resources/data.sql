INSERT INTO roles (role_id, role_name) VALUES (1, 'ADMIN');
INSERT INTO users (email, enabled, full_name, password, phone_number, username)
    VALUES ('admin@gmail.com', true, 'Admin', 'pass', 12345, 'admin');
INSERT INTO user_roles (user_id, role_id) VALUES (1, 1);