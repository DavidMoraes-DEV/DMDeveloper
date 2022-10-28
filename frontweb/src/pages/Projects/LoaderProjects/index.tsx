import LoaderProject from '../ProjectCard/LoaderProject';
import './styles.css';

const LoaderProjects = () => {
  return (
    <div className="row loader-projects-container">
      <LoaderProject />
      <LoaderProject />
      <LoaderProject />
      <LoaderProject />
    </div>
  );
};

export default LoaderProjects;
