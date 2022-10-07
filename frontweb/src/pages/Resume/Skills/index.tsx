import SpringImage from 'assets/images/logo-tecnologias/softwares/logo-spring-tools.png';
import VisualCode from 'assets/images/logo-tecnologias/softwares/logo-visual-studio.png';
import VisualStudio from 'assets/images/logo-tecnologias/softwares/logo-visual-studio-code.png';
import DBH2 from 'assets/images/logo-tecnologias/softwares/logo-h2.png';
import PostMan from 'assets/images/logo-tecnologias/softwares/logo-postman.png';
import MySQLWork from 'assets/images/logo-tecnologias/softwares/logo-mysql-workbench.png';
import Java from 'assets/images/logo-tecnologias/tecnologias-backend/logo-java.png';
import Jpa from 'assets/images/logo-tecnologias/tecnologias-backend/logo-jpa-hibernate.png';
import JUnit from 'assets/images/logo-tecnologias/tecnologias-backend/logo-junit-5.png';
import Jwt from 'assets/images/logo-tecnologias/tecnologias-backend/logo-jwt.png';
import Maven from 'assets/images/logo-tecnologias/tecnologias-backend/logo-maven.png';
import Mockito from 'assets/images/logo-tecnologias/tecnologias-backend/logo-mockito.png';
import OAuth from 'assets/images/logo-tecnologias/tecnologias-backend/logo-oauth-2.png';
import SpringBoot from 'assets/images/logo-tecnologias/tecnologias-backend/logo-spring-boot.png';
import Apex from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-apex-charts.png';
import Axios from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-axios.png';
import Bootstrap from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-bootstrap.png';
import CssImage from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-css.png';
import HtmlImage from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-html.png';
import Jest from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-jest.png';
import JS from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-js.png';
import Netlify from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-netlify.png';
import Nodejs from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-nodejs.png';
import ReactImage from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-react.png';
import ReackHook from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-react-hook.png';
import ReackHookForm from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-react-hook-form.png';
import ReactRouter from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-react-router.png';
import TypeScript from 'assets/images/logo-tecnologias/tecnologias-frontweb/logo-typescript.png';
import './styles.css';
import './styles-logos.css';

const Skills = () => {
  return (
    <div className="skills-container-content">
      <div className="skills-ides-container">
        <div className="skills-tittle-container">
          <h2>IDES:</h2>
        </div>
        <div className="skills-ides-logos-container">
          <span className="skills-ides-logos-content-1">
            <img src={SpringImage} alt="Spring Tools" />
            <img src={VisualCode} alt="Visual Studio Code" />
            <span className="logo-visual-studio">
              <img src={VisualStudio} alt="Visual Studio" />
            </span>
          </span>
          <span className='skills-ides-visual-studio'>
          <img src={VisualStudio} alt="Visual Studio" />
          </span>
        </div>
      </div>

      <div className="skills-tools-container">
        <div className="skills-tittle-container">
          <h2>FERRAMENTAS:</h2>
        </div>
        <div className="skills-tools-logos-container">
          <span className="skills-tools-logos-db">
            <img src={DBH2} alt="Banco de dados H2" />
            <img src={MySQLWork} alt="MySQL WorkBench" />
            <span className="logo-postman">
              <img src={PostMan} alt="Postman" />
            </span>
          </span>
          <span className="skills-tools-postman">
            <img src={PostMan} alt="Postman" />
          </span>
        </div>
      </div>

      <div className="skills-backend-container">
        <div className="skills-tittle-container">
          <h2>TECNOLOGIAS BACKEND:</h2>
        </div>
        <div className="skills-backend-logos-container">
          <span className="skills-backend-logos-content">
            <span className="logos-backend-container">
              <img src={Java} alt="Linguagem Java" className="logo-java" />
              <img
                src={SpringBoot}
                alt="Spring Boot"
                className="logo-spring-boot"
              />
            </span>
            <span className="logos-backend-container">
              <img src={Maven} alt="Maven" className="logo-maven" />
              <img src={Jwt} alt="JWT" className="logo-jwt" />
            </span>
          </span>
          <span className="skills-backend-logos-content">
            <span className="logos-backend-container">
              <img src={OAuth} alt="OAuth 2" className="logo-oauth" />
              <img
                src={Jpa}
                alt="JPA Hibernate"
                className="logo-jpa-hibernate"
              />
            </span>
            <span className="logos-backend-container">
              <img src={JUnit} alt="JUnit 5" className="logo-junit" />
              <img src={Mockito} alt="Mockito" className="logo-mockito" />
            </span>
          </span>
        </div>
      </div>

      <div className="skills-backend-container">
        <div className="skills-tittle-container">
          <h2>TECNOLOGIAS FRONTWEB:</h2>
        </div>
        <div className="skills-backend-logos-container">
          <span className="skills-frontweb-content">
            <span className="logos-backend-container">
              <img src={HtmlImage} alt="HTML" className="logo-html" />
              <img src={CssImage} alt="CSS" className="logo-css" />
              <img src={JS} alt="Java Script" className="logo-js" />
            </span>

            <span className="logos-backend-container">
              <img src={ReactImage} alt="Logo React" className="logo-react" />
              <img src={Bootstrap} alt="Bootstrap" className="logo-bootstrap" />
            </span>
          </span>

          <span className="skills-frontweb-content">
            <span className="logos-backend-container">
              <img
                src={ReackHook}
                alt="React Hook"
                className="logo-react-hook"
              />
              <img src={Nodejs} alt="Node JS" className="logo-nodejs" />
            </span>

            <span className="logos-backend-container">
              <img
                src={ReackHookForm}
                alt="React Hook Form"
                className="logo-react-hook-form"
              />
              <img src={TypeScript} alt="TypeScript" className="logo-ts" />
            </span>
          </span>

          <span className="skills-frontweb-content">
            <span className="logos-backend-container">
              <img
                src={ReactRouter}
                alt="React Router"
                className="logo-react-router"
              />
              <img src={Axios} alt="Axios" className="logo-axios" />
            </span>
            <span className="logos-backend-container">
              <img src={Apex} alt="Apex Charts" className="logo-apex" />
            </span>
          </span>

          <span className="logos-backend-container">
            <img src={Netlify} alt="Netlify" className="logo-netlify" />
            <img src={Jest} alt="Jest" className="logo-jest" />
          </span>
        </div>
      </div>
    </div>
  );
};

export default Skills;
