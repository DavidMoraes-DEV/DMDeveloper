import { ProjectData } from 'types/prejectData';
import './styles.css';

type Props = {
    project?: ProjectData
}

const ProjectCard = ( {project}: Props ) => {
    return (
        <div className='base-card project-card-container'>
            <div className='project-card-image-container'>
                <img src={project?.projectImage} alt={project?.name} />
            </div>
            <div className='project-card-info-container'>
                <span className='project-card-info-title'>
                    <h1>{project?.name}</h1>
                </span>
                <span className='project-card-info-content'>
                    <h4>Descrição: </h4>
                    <p>{project?.description}</p>
                    <span className='project-card-buttons-container'>
                        <a href={project?.gitUrl} target="_blank" rel='noopener noreferrer'>
                            <button className='base-button'>
                                CÓDIGO GITHUB
                            </button>
                        </a>
                        <a href={project?.projectUrl} target="_blank" rel='noopener noreferrer'>
                            <button className='base-button'>
                                ABRIR PROJETO
                            </button>
                        </a>
                    </span>
                </span>
            </div>
        </div>
    );
}

export default ProjectCard;