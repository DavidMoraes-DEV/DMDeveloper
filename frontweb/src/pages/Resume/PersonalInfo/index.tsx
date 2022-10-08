import './styles.css';

const PersonalInfo = () => {
  return (
    <div className="resume-info-container">
      <h2 className="mb-3">David Moraes de Oliveira</h2>
      <div className="resume-personal-info-container">
        <div className="resume-info-content">
          <h4>
            Nascimento: <span>20/06/1997</span>
          </h4>
          <h4>
            Idade: <span>25 anos</span>
          </h4>
          <h4>
            Sexo: <span>Masculino</span>
          </h4>
          <h4>
            Fone: <span>(44) 99158-5419</span>
          </h4>
          <h4>
            Email: <span>DavidMoraes-DEV@outlook.com</span>
          </h4>
        </div>
        <div className="resume-info-content">
          
          <h4>
            Estado Civil: <span>Solteiro</span>
          </h4>
          <h4>
            Endereço: <span>Rua Lucio Tozini, nº 11</span>
          </h4>
          <h4>
            CEP: <span>86610-000 - Jaguapitã - PR</span>
          </h4>
          <h4>
            CNH Categoria(s): <span>AB</span>
          </h4>
          <h4>
            Trabalhando atualmente? <span>Não</span>
          </h4>
        </div>
      </div>
      <div className="resume-info-content">
        <h3>Formação:</h3>
        <h4>
          Instituição:{' '}
          <span>UNIFAMMA - Faculdade Metropolitana de Maringá</span>
        </h4>
        <span className="resume-info-course-container">
          <h4>
            Curso: <span>Engenharia de Software</span>
          </h4>
          <span className='resume-info-course-duration-container'>
            <h4>
              Inicio: <span>02/2019</span>
            </h4>
            <h4>
              Término: <span>06/2023</span>
            </h4>
          </span>
        </span>
        <span className='resume-info-course-situation-container'>
        <h4>
          Situação: <span>Cursando</span>
        </h4>
        <h4>
          Duração: <span>4 Anos</span>
        </h4>
        </span>
      </div>
    </div>
  );
};

export default PersonalInfo;
