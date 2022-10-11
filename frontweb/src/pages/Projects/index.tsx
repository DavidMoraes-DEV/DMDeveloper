import ProjectCard from './ProjectCard/index';
import './styles.css';

const Projects = () => {
  return (
    <div className="bg projects-container">
      <div className="row projects-itens-container">
        <div className='col-sm-6 col-lg-12 projects-item-container'>
          <ProjectCard />
        </div>
        <div className='col-sm-6 col-lg-12 projects-item-container'>
          <ProjectCard />
        </div>
        <div className='col-sm-6 col-lg-12 projects-item-container'>
          <ProjectCard />
        </div>
        <div className='col-sm-6 col-lg-12 projects-item-container'>
          <ProjectCard />
        </div>
      </div>
    </div>
  );
};

export default Projects;
