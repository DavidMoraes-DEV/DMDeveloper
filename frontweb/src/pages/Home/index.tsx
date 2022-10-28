import ImageProfile from 'assets/images/image-profile-home.png';
import { NavLink } from 'react-router-dom';
import './styles.css';

const Home = () => {
  return (
    <section className="bg home-container">
      <h1>OLÁ, SEJA BEM VINDO!</h1>
      <main className="home-apresentation-container">
          <figure className="home-image-content">
            <img src={ImageProfile} alt="" />
          </figure>

          <article className="home-apresentation-content">
            <h2>David Moraes de Oliveira</h2>
            <h3>Desenvolvedor Web</h3>
            <p>
              Estudando e expandindo sempre meus conhecimentos nesse incrível
              universo do desenvolvimento web! <br />
              <br />
              Em busca da primeira oportunidade na área de desenvolvimento!
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
