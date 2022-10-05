import SpringImage from 'assets/images/logo-tecnologias/softwares/logo-spring-tools.png';
import VisualCode from 'assets/images/logo-tecnologias/softwares/logo-visual-studio.png';
import VisualStudio from 'assets/images/logo-tecnologias/softwares/logo-visual-studio-code.png';
import DBH2 from 'assets/images/logo-tecnologias/softwares/logo-h2.png';
import PostMan from 'assets/images/logo-tecnologias/softwares/logo-postman.png';
import MySQLWork from 'assets/images/logo-tecnologias/softwares/logo-mysql-workbench.png';
import './styles.css';

const Skills = () => {
  return (
    <div className="skills-container-content">
      <div className="skills-ides-container">
        <div className="skills-tittle-container">
          <h2>IDES:</h2>
        </div>
        <div className="skills-ides-logos-container">
          <img src={SpringImage} alt="Spring Tools" />
          <img src={VisualCode} alt="Visual Studio Code" />
          <img src={VisualStudio} alt="Visual Studio" />
        </div>
      </div>

      <div className="skills-tools-container">
        <div className="skills-tittle-container">
          <h2>FERRAMENTAS:</h2>
        </div>
        <div className="skills-tools-logos-container">
          <div className="skills-tools-logos-db">
            <img src={DBH2} alt="Banco de dados H2" />
            <img src={MySQLWork} alt="MySQL WorkBench" />
          </div>
          <div className="skills-tools-postman">
            <img src={PostMan} alt="Postman" />
          </div>
        </div>
      </div>
    </div>
  );
};

export default Skills;
