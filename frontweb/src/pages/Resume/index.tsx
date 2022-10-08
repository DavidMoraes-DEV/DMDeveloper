import Courses from './Courses';
import PersonalInfo from './PersonalInfo';
import Skills from './Skills';
import './styles.css';

const Resume = () => {
  return (
    <div className="bg resume-container">
      <span className="resume-infos-container">
        <div className="base-card resume-card-container">
          <div className="resume-image-button-container">
            <div className="resume-image-container"></div>
            <button className="btn base-button resume-button-container">
              BAIXAR CURRÍCULO
            </button>
          </div>
          <PersonalInfo />
        </div>

        <div className="base-card resume-courses-container">
          <h1>CURSOS COMPLEMENTARES:</h1>
          <div className='row'>
            <Courses />
            <Courses />
            <Courses />
            <Courses />
          </div>
        </div>

        <div className="base-card skills-container">
          <h1>CONHECIMENTOS:</h1>
          <Skills />
        </div>
      </span>
    </div>
  );
};

export default Resume;
