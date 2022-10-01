import MainImage from 'assets/images/logo-dmdeveloper.png';
import { Link, NavLink } from 'react-router-dom';
import 'bootstrap/js/src/collapse.js';
import './styles.css';

const Navbar = () => {
  return (
    <div className="navbar navbar-expand-md navbar-dark bg-primary main-nav">
      <div className="container-fluid">
        <Link to={'/'}>
          <img
            src={MainImage}
            alt="Logo Principal"
            className="logo-container"
          />
        </Link>

        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#dmdeveloper-navbar"
          aria-controls="dmdeveloper-navbar"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div
          className="collapse navbar-collapse navbar-container"
          id="dmdeveloper-navbar"
        >
          <ul className="navbar-nav offset-md-2 main-menu">
            <NavLink to="/projects" exact className='main-menu-link'>
              <li className="main-menu-item">PROJETOS</li>
            </NavLink>
            <NavLink to="/resume" exact className='main-menu-link'>
              <li className="main-menu-item">CURRÍCULO</li>
            </NavLink>

            <NavLink to="/about" exact className='main-menu-link'>
              <li className="main-menu-item">SOBRE MIM</li>
            </NavLink>
          </ul>
        </div>
      </div>
    </div>
  );
};

export default Navbar;
