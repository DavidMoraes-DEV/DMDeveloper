import ImageCard from 'assets/images/home-page-card.png';
import { NavLink } from 'react-router-dom';
import './styles.css';

const Home = () => {
  return (
    <div className="bg home-container">
      <div className="home-card-container">
        <h1>Bem Vindo, ao meu Portfólio!</h1>
        <div className="home-card-container-image">
          <img src={ImageCard} alt="Home Page Card" />
        </div>
        <div className='home-card-buttons-container'>
          <NavLink to='/projects'>
            <button className='base-button home-card-button'>PROJETOS</button>
          </NavLink>
          <NavLink to='/resume/1'>
            <button className='base-button home-card-button'>CURRÍCULO</button>
          </NavLink>
        </div>
      </div>
      <div className="home-image-container">
        <h1>Minha Foto</h1>
      </div>
    </div>
  );
};

export default Home;
