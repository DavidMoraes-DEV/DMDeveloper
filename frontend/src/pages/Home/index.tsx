import ImageProfile from 'assets/images/image-profile-home.png';
import { NavLink } from 'react-router-dom';
import './styles.css';

const Home = () => {
  return (
    <section className="bg home-container">
      <main className="home-apresentation-container">
          <figure className="home-image-content">
            <img src={ImageProfile} alt="" />
          </figure>

          <article className="home-apresentation-content">
            <h2>David Moraes de Oliveira</h2>
            <h3>Desenvolvedor Web</h3>
            <p>
              Estudante de Engenharia de Software com foco no desenvolvimento web fullstack, utilizando tecnologias como: Java - Spring Boot - TypeScript - React.
              Diariamente estou desenvolvendo projetos pessoais, me empenhando para aperfeiçoar os meus conhecimentos e
              buscando sempre novos conhecimentos que agreguem valor ao meu perfil de desenvolvedor. <br />
            </p>

            <aside className="home-apresentation-buttons-container">
              <NavLink to="/projects">
                <button className="btn base-button home-card-button">
                  PROJETOS
                </button>
              </NavLink>

              <NavLink to="/resume">
                <button className="btn base-button home-card-button">
                  CURRÍCULO
                </button>
              </NavLink>
            </aside>
          </article>
      </main>
    </section>
  );
};

export default Home;
