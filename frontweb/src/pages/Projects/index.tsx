import { AxiosRequestConfig } from 'axios';
import { useEffect, useState } from 'react';
import { ProjectData } from 'types/prejectData';
import { requestBackend } from 'util/requests';
import ProjectCard from './ProjectCard/index';
import './styles.css';

const Projects = () => {

  const [projects, setProjects] = useState<ProjectData[]>([]);

  const params: AxiosRequestConfig = {
    method: 'GET',
    url: "/projects"
  };

  useEffect(() => {
    requestBackend(params).then(response => {
      setProjects(response.data);
      console.log(response.data);
    });
  // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  return (
    <div className="bg projects-container">
      <div className="row projects-itens-container">
        {projects.map(project => (
          <div className='col-sm-6 col-lg-12 projects-item-container' key={project.id}>
            <ProjectCard project={project}/>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Projects;
