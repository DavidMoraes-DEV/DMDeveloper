import MainImage from 'assets/images/logo-dmdeveloper.png';
import { Link, NavLink, useLocation } from 'react-router-dom';
import 'bootstrap/js/src/collapse.js';
import './styles.css';

const Navbar = () => {
  const location = useLocation();

  return (
    <header className="navbar navbar-expand-md navbar-dark bg-primary main-nav">
      <section className="container-fluid">
        <Link to={'/'}>
          <img
            src={MainImage}
            alt="Logo Principal"
            className="logo-container"
          />
        </Link>

        <button
          className={`navbar-toggler ${
            location.pathname === '/' ? 'd-none' : ''
          }`}
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#dmdeveloper-navbar"
          aria-controls="dmdeveloper-navbar"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <nav
          className="collapse navbar-collapse navbar-container"
          id="dmdeveloper-navbar"
        >
          <ul
            className={`navbar-nav offset-md-2 main-menu ${
              location.pathname === '/' ? 'd-none' : ''
            }`}
          >
            <NavLink to="/projects" exact className="main-menu-link">
              <li className="main-menu-item">PROJETOS</li>
            </NavLink>
            <NavLink to="/resume" exact className="main-menu-link">
              <li className="main-menu-item">CURRÍCULO</li>
            </NavLink>
          </ul>
        </nav>
      </section>
    </header>
  );
};

export default Navbar;
