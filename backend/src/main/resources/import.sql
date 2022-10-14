INSERT INTO tb_personal_info (name, birth_date, genre, phone, email, address, cep, city, state, cnh) VALUES ('David Moraes de Oliveira', TIMESTAMP WITH TIME ZONE '1997-06-20T15:15:00Z', 'Masculino', '44 99158-5419', 'DavidMoraes-DEV@outlook.com', 'Rua Lucio Tozini, 11', '86610-000', 'Jaguapitã', 'PR', 'AB');

INSERT INTO tb_resume (file_url, personal_info_id) VALUES ('https://github.com/DavidMoraes-DEV/DMDeveloper/blob/master/frontweb/src/assets/files/curriculum-david.pdf', 1);

INSERT INTO tb_category (name) VALUES ('IDES');
INSERT INTO tb_category (name) VALUES ('Tools');
INSERT INTO tb_category (name) VALUES ('Backend');
INSERT INTO tb_category (name) VALUES ('Frontweb');

INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('h2', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-tools/logo-h2.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('mysql-workbench', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-tools/logo-mysql-workbench.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('postman', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-tools/logo-postman.png', 1);

INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('spring-tools', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-ides/logo-spring-tools.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('visual-studio-code', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-ides/logo-visual-studio-code.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('visual-studio', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-ides/logo-visual-studio.png', 1);

INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('java', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-java.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('jpa-hibernate', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-jpa-hibernate.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('junit5', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-junit-5.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('jwt', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-jwt.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('maven', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-maven.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('mockito', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-mockito.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('oauth2', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-oauth-2.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('spring-boot', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-spring-boot.png', 1);

INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('apex-charts', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-apex-charts.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('axios', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-axios.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('bootstrap', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-bootstrap.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('css', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-css.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('html', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-html.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('jest', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-jest.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('js', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-js.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('netlify', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-netlify.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('nodejs', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-nodejs.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('react-hook-form', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react-hook-form.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('react-hook', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react-hook.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('react-router', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react-router.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('react', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react.png', 1);
INSERT INTO tb_skill (name, img_url, resume_id) VALUES ('typescript', 'https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-typescript.png', 1);

INSERT INTO tb_skill_category (skill_id, category_id) VALUES (1, 2);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (2, 2);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (3, 2);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (4, 1);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (5, 1);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (6, 1);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (7, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (8, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (9, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (10, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (10, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (11, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (12, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (13, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (14, 3);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (15, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (16, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (17, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (18, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (19, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (20, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (21, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (22, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (23, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (24, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (25, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (26, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (27, 4);
INSERT INTO tb_skill_category (skill_id, category_id) VALUES (28, 4);

INSERT INTO tb_course (name, institution, duration, certificate, resume_id) VALUES ('Algoritmo e Lógica de Programação do Básico ao Avançado', 'Udemy - Geek University', 33.5, 'https://github.com/DavidMoraes-DEV/DMDeveloper/blob/master/frontweb/src/assets/files/certificado-algoritmo-logica-geek.pdf', 1);
INSERT INTO tb_course (name, institution, duration, certificate, resume_id) VALUES ('Algoritmo e Lógica de Programação(C, C++, C#, Java, Python', 'Udemy - Nélio Alves', 30.5, 'https://github.com/DavidMoraes-DEV/DMDeveloper/blob/master/frontweb/src/assets/files/certificado-algoritmo-logica-nelio', 1);
INSERT INTO tb_course (name, institution, duration, certificate, resume_id) VALUES ('Bootcamp Java - Spring Boot', 'DEV Superior', 160.0, 'https://github.com/DavidMoraes-DEV/DMDeveloper/blob/master/frontweb/src/assets/files/certificado-bootcamp-spring.pdf', 1);
INSERT INTO tb_course (name, institution, duration, certificate, resume_id) VALUES ('BootCamp TypeScript - React', 'DEV Superior', 160.0, 'https://github.com/DavidMoraes-DEV/DMDeveloper/blob/master/frontweb/src/assets/files/certificado-bootcamp-react.pdf', 1);

INSERT INTO tb_formation (name, institution, start, end, status, resume_id) VALUES ('Engenharia de Software', 'UNIFAMMA - Centro Universitário Metropolitano de Maringá', TIMESTAMP WITH TIME ZONE '2019-02-01T00:00:00Z', TIMESTAMP WITH TIME ZONE '2023-06-30T00:00:00Z', 'Ativo', 1);

INSERT INTO tb_project (name, description, git_url, project_url, project_image) VALUES ('DM Developer', 'Portfólio online para exibir todos os meus projetos de TI', 'https://github.com/DavidMoraes-DEV/DMDeveloper', 'https://meudominio.com', 'https://github.com/DavidMoraes-DEV/DMDeveloper/blob/master/frontweb/src/assets/images/projetcs/DM-Developer.png');