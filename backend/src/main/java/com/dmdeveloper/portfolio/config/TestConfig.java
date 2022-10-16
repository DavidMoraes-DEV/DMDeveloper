package com.dmdeveloper.portfolio.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.dmdeveloper.portfolio.entities.Category;
import com.dmdeveloper.portfolio.entities.Course;
import com.dmdeveloper.portfolio.entities.Formation;
import com.dmdeveloper.portfolio.entities.PersonalInfo;
import com.dmdeveloper.portfolio.entities.Project;
import com.dmdeveloper.portfolio.entities.Resume;
import com.dmdeveloper.portfolio.entities.Skill;
import com.dmdeveloper.portfolio.repositories.CategoryRepository;
import com.dmdeveloper.portfolio.repositories.CourseRepository;
import com.dmdeveloper.portfolio.repositories.FormationRepository;
import com.dmdeveloper.portfolio.repositories.ProjectRepository;
import com.dmdeveloper.portfolio.repositories.ResumeRepository;
import com.dmdeveloper.portfolio.repositories.SkillRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private ResumeRepository resumeRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private SkillRepository skillRepository;

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private FormationRepository formationRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Resume resume = new Resume(null, "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/files/curriculum-david.pdf");
		resumeRepository.saveAll(Arrays.asList(resume));
		
		PersonalInfo personalinfo = new PersonalInfo(null, "David Moraes de Oliveira", Instant.parse("1997-06-20T15:15:00Z"), "Masculino", "44 99158-5419", "DavidMoraes-DEV@outlook.com", "Rua Lucio Tozini, 11", "86610-000", "Jaguapitã", "PR", "AB", resume);
		
		resume.setPersonalInfo(personalinfo);
		resumeRepository.save(resume);
		
		Category catg1 = new Category(null, "IDES");
		Category catg2 = new Category(null, "Tools");
		Category catg3 = new Category(null, "Backend");
		Category catg4 = new Category(null, "Frontweb");
		
		Skill skill1 = new Skill(null, "h2", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-tools/logo-h2.png", resume);
		Skill skill2 = new Skill(null, "mysql-workbench", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-tools/logo-mysql-workbench.png", resume);
		Skill skill3 = new Skill(null, "postman", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-tools/logo-postman.png", resume);
		
		Skill skill4 = new Skill(null, "spring-tools", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-ides/logo-spring-tools.png", resume);
		Skill skill5 = new Skill(null, "visual-studio-code", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-ides/logo-visual-studio-code.png", resume);
		Skill skill6 = new Skill(null, "visual-studio", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-ides/logo-visual-studio.png", resume);
		
		Skill skill7 = new Skill(null, "java", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-java.png", resume);
		Skill skill8 = new Skill(null, "jpa-hibernate", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-jpa-hibernate.png", resume);
		Skill skill9 = new Skill(null, "junit5", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-junit-5.png", resume);
		Skill skill10 = new Skill(null, "jwt", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-jwt.png", resume);
		Skill skill11 = new Skill(null, "maven", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-maven.png", resume);
		Skill skill12 = new Skill(null, "mockito", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-mockito.png", resume);
		Skill skill13 = new Skill(null, "oauth2", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-oauth-2.png", resume);
		Skill skill14 = new Skill(null, "spring-boot", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-backend/logo-spring-boot.png", resume);
		
		Skill skill15 = new Skill(null, "apex-charts", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-apex-charts.png", resume);
		Skill skill16 = new Skill(null, "axios", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-axios.png", resume);
		Skill skill17 = new Skill(null, "bootstrap", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-bootstrap.png", resume);
		Skill skill18 = new Skill(null, "css", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-css.png", resume);
		Skill skill19 = new Skill(null, "html", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-html.png", resume);
		Skill skill20 = new Skill(null, "jest", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-jest.png", resume);
		Skill skill21 = new Skill(null, "js", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-js.png", resume);
		Skill skill22 = new Skill(null, "netlify", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-netlify.png", resume);
		Skill skill23 = new Skill(null, "nodejs", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-nodejs.png", resume);
		Skill skill24 = new Skill(null, "react-hook-form", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react-hook-form.png", resume);
		Skill skill25 = new Skill(null, "react-hook", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react-hook.png", resume);
		Skill skill26 = new Skill(null, "react-router", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react-router.png", resume);
		Skill skill27 = new Skill(null, "react", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-react.png", resume);
		Skill skill28 = new Skill(null, "typescript", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/logos-technologies/tec-frontweb/logo-typescript.png", resume);
		
		categoryRepository.saveAll(Arrays.asList(catg1, catg2, catg3, catg4));
		skillRepository.saveAll(Arrays.asList(skill1, skill2,skill3, skill4, skill5, skill6, skill7, skill8, skill9, skill10, skill11, skill12, skill13, skill14, skill15, skill16, skill17, skill18, skill19, skill20, skill21, skill22, skill23, skill24, skill25, skill26, skill27, skill28));
		
		skill1.getCategories().add(catg2);
		skill2.getCategories().add(catg2);
		skill3.getCategories().add(catg2);
		
		skill4.getCategories().add(catg1);
		skill5.getCategories().add(catg1);
		skill6.getCategories().add(catg1);
		
		skill7.getCategories().add(catg3);
		skill8.getCategories().add(catg3);
		skill9.getCategories().add(catg3);
		skill10.getCategories().addAll(Arrays.asList(catg3, catg4));
		skill11.getCategories().add(catg3);
		skill12.getCategories().add(catg3);
		skill13.getCategories().add(catg3);
		skill14.getCategories().add(catg3);
		
		skill15.getCategories().add(catg4);
		skill16.getCategories().add(catg4);
		skill17.getCategories().add(catg4);
		skill18.getCategories().add(catg4);
		skill19.getCategories().add(catg4);
		skill20.getCategories().add(catg4);
		skill21.getCategories().add(catg4);
		skill22.getCategories().add(catg4);
		skill23.getCategories().add(catg4);
		skill24.getCategories().add(catg4);
		skill25.getCategories().add(catg4);
		skill26.getCategories().add(catg4);
		skill27.getCategories().add(catg4);
		skill28.getCategories().add(catg4);
		
		skillRepository.saveAll(Arrays.asList(skill1, skill2,skill3, skill4, skill5, skill6, skill7, skill8, skill9, skill10, skill11, skill12, skill13, skill14, skill15, skill16, skill17, skill18, skill19, skill20, skill21, skill22, skill23, skill24, skill25, skill26, skill27, skill28));
		
		Course course1 = new Course(null, "Algoritmo e Lógica de Programação do Básico ao Avançado", "Udemy - Geek University", 33.5, "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/files/certificado-algoritmo-logica-geek.pdf", resume);
		Course course2 = new Course(null, "Algoritmo e Lógica de Programação(C, C++, C#, Java, Python", "Udemy - Nélio Alves", 30.5, "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/files/certificado-algoritmo-logica-nelio.pdf", resume);
		Course course3 = new Course(null, "BootCamp TypeScript - React", "DEV Superior", 160.0, "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/files/certificado-bootcamp-react.pdf", resume);
		Course course4 = new Course(null, "Bootcamp Java - Spring Boot", "DEV Superior", 160.0, "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/files/certificado-bootcamp-spring.pdf", resume);
		
		courseRepository.saveAll(Arrays.asList(course1, course2, course3, course4));
		
		Formation formation1 = new Formation(null, "Engenharia de Software", "UNIFAMMA - Centro Universitário Metropolitano de Maringá", Instant.parse("2019-02-01T00:00:00Z"), Instant.parse("2023-06-30T00:00:00Z"), "Ativo", resume);
		
		formationRepository.saveAll(Arrays.asList(formation1));
		
		Project project1 = new Project(null, "DS Catalog", "Projeto desenvolvido com o objetivo de ser um catálogo de produtos online para venda, com um CRUD completo para administrar os produtos com controle de acesso", "https://github.com/DavidMoraes-DEV/ProjectDSCatalog", "https://meudominiodscatalog.com", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/projects/ds-catalog.png");
		Project project2 = new Project(null, "Movie Flix", "Projeto desenvolvido com a finalidade de exibir filmes para que usuários membros realize uma avaliação dos filmes, os demais usuários que não possua o perfil membro não consegue enviar uma avaliação, apenas visualizar os dados dos filmes e as avaliações", "https://github.com/DavidMoraes-DEV/DSMovieFlix", "https://meudominiomovieflix.com", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/projects/movie-flix.png");
		Project project3 = new Project(null, "Top Cars", "Projeto desenvolvido para  reunir e divulgar automóveis a venda por meio de um catálogo", "https://github.com/DavidMoraes-DEV/DSTopCars", "https://meudominiotopcars.com", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/projects/top-cars.png");
		Project project4 = new Project(null, "DM Developer", "Portfólio online para exibir todos os meus projetos de TI", "https://github.com/DavidMoraes-DEV/DMDeveloper", "https://meudominiodmdeveloper.com", "https://raw.githubusercontent.com/DavidMoraes-DEV/DMDeveloper/master/frontweb/src/assets/images/projects/dm-developer.png");
		
		projectRepository.saveAll(Arrays.asList(project1, project2, project3, project4));
	}
	
}