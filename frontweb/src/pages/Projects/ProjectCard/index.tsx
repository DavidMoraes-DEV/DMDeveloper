import DMDeveloperImage from 'assets/images/projetcs/DM-Developer.png';
import './styles.css';

const ProjectCard = () => {
    return (
        <div className='base-card project-card-container'>
            <div className='project-card-image-container'>
                <img src={DMDeveloperImage} alt="DM Developer, Portfólio de David Moraes de Oliveira" />
            </div>
            <div className='project-card-info-container'>
                <span className='project-card-info-title'>
                    <h1>NOME DO PROJETO</h1>
                </span>
                <span className='project-card-info-content'>
                    <h4>Descrição: </h4>
                    <p>Descrição do conceito do projeto e suas tecnologias utilizadas para desenvolve-lo.</p>
                    <span className='project-card-buttons-container'>
                        <button className='base-button'>
                            CÓDIGO GITHUB
                        </button>
                        <button className='base-button'>
                            ABRIR PROJETO
                        </button>
                    </span>
                </span>
            </div>
        </div>
    );
}

export default ProjectCard;