import { AxiosRequestConfig } from 'axios';
import { useEffect, useState } from 'react';
import { ProjectData } from 'types/projectData';
import { requestBackend } from 'util/requests';
import LoaderProjects from './LoaderProjects';
import ProjectCard from './ProjectCard/index';
import './styles.css';

const Projects = () => {

  const [projects, setProjects] = useState<ProjectData[]>([]);
  const [isLoading, setIsLoading] = useState(false);

  const params: AxiosRequestConfig = {
    method: 'GET',
    url: "/projects"
  };

  useEffect(() => {
    setIsLoading(true);
    requestBackend(params).then(response => {
      setProjects(response.data);
      console.log(response.data);
    }).finally(() => {
      setTimeout(() => (setIsLoading(false)), 5000);
    });
  // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  return (
    <main className="bg projects-container">
      {isLoading ? (
        <LoaderProjects />
      ) : (
      <div className="row projects-itens-container">
        {projects.map(project => (
          <section className='col-sm-6 col-lg-12 projects-item-container' key={project.id}>
            <ProjectCard project={project}/>
          </section>
        ))}
      </div>
      )}
    </main>
  );
};

export default Projects;
