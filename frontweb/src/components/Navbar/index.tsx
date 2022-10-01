import MainImage from 'assets/images/logo-dmdeveloper.png';
import { Link, NavLink } from 'react-router-dom';
import './styles.css';

const Navbar = () => {
  return (
    <div className="navbar navbar-expand-md navbar-dark bg-primary main-nav">
      <div className="container-fluid">
        <Link to={'/'}>
          <img src={MainImage} alt="Logo Principal" className='logo-container'/>
        </Link>

        <button
          className="navbar-toggler"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#dscatalog-navbar"
          aria-controls="dscatalog-navbar"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className='collapse navbar-collapse navbar-container' id='dmdeveloper-navbar'>
            <ul className='navbar-nav offset-md-2 main-menu'>
                <li>
                    <NavLink to="/projects" activeClassName="active" exact>
                        PROJETOS
                    </NavLink>
                </li>
                <li>
                    <NavLink to="/resume" activeClassName="active" exact>
                        CURRÍCULO
                    </NavLink>
                </li>
                <li>
                    <NavLink to="/about" activeClassName="active" exact>
                        SOBRE MIM
                    </NavLink>
                </li>
            </ul>
        </div>
      </div>
    </div>
  );
};

export default Navbar;
