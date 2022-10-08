import './styles.css';

const Courses = () => {
    return (
        <div className="col-lg-6 resume-courses-content">
          <div className="button-container">
            <button className="btn base-button resume-course-button-container">
              CERTIFICADO
            </button>
          </div>
          <div className="mb-2 resume-courses-info-content">
            <h4>
              Instituição: <span>Geek University</span>
            </h4>
            <h4>
              Curso: <span>Algoritmo e Lógica de Programação do Básico ao Avançado</span>
            </h4>
            <h4>
              Duração: <span>30,5 horas</span>
            </h4>
          </div>
        </div>
    );
}

export default Courses;