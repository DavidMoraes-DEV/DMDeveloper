import { ProjectData } from 'types/projectData';
import './styles.css';

type Props = {
    project?: ProjectData
}

const ProjectCard = ( {project}: Props ) => {
    return (
        <article className='base-card project-card-container'>
            <figure className='project-card-image-container'>
                <img src={project?.projectImage} alt={project?.name} />
            </figure>
            <section className='project-card-info-container'>
                <h1>{project?.name}</h1>
                <div className='project-card-info-content'>
                    <h4>Descrição: </h4>
                    <p>{project?.description}</p>
                    <aside className='project-card-buttons-container'>
                        <a href={project?.gitUrl} target="_blank" rel='noopener noreferrer' className='project-card-button'>
                            <button className='btn base-button project-card-button-content'>
                                CÓDIGO GITHUB
                            </button>
                        </a>
                        <a href={project?.projectUrl} target="_blank" rel='noopener noreferrer' className={`project-card-button ${project?.name === "DM Developer" ? "d-none" : ""}`}>
                            <button className='btn base-button'>
                                ABRIR PROJETO
                            </button>
                        </a>
                    </aside>
                </div>
            </section>
        </article>
    );
}

export default ProjectCard;