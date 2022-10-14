import { FormationData } from 'types/formationData';
import { PersonalInfoData } from 'types/personalInfoData';
import './styles.css';

type Props = {
  informations: PersonalInfoData;
  formations: FormationData[];
};

const PersonalInfo = ({ informations, formations }: Props) => {
  const birthDate = new Date(informations.birthDate);

  function formationDate(date: Date) {
    const newDate = new Date(date);
    return (
      `${`0${newDate.getMonth()+1}`}-${newDate.getFullYear()}`
    );
  }

  function durationFormation(dateStart: Date, dateEnd: Date) {
    const start = new Date(dateStart);
    const end = new Date(dateEnd);
    return (end.getFullYear()-start.getFullYear());
  }
  
  return (
    <div className="resume-info-container">
      <h2 className="mb-3">{informations?.name}</h2>
      <div className="resume-personal-info-container">
        <div className="resume-info-content">
          <h4>
            Nascimento:{' '}
            <span>{birthDate.toLocaleDateString().replaceAll('/', '-')}</span>
          </h4>
          <h4>
            Idade:{' '}
            <span>
              {new Date(Date.now()).getFullYear() - birthDate.getFullYear()}{' '}
              anos
            </span>
          </h4>
          <h4>
            Sexo: <span>{informations?.genre}</span>
          </h4>
          <h4>
            Fone: <span>{informations?.phone}</span>
          </h4>
          <h4>
            Email: <span>{informations?.email}</span>
          </h4>
        </div>
        <div className="resume-info-content">
          <h4>
            Endereço: <span>{informations?.address}</span>
          </h4>
          <h4>
            CEP: <span>{informations?.cep}</span>
          </h4>
          <h4>
            Cidade/Estado:{' '}
            <span>{`${informations?.city} - ${informations?.state}`}</span>
          </h4>
          <h4>
            CNH Categoria(s): <span>{informations?.cnh}</span>
          </h4>
          <h4>
            Trabalhando atualmente? <span>Não</span>
          </h4>
        </div>
      </div>
      <div className="resume-info-content">
        <h3>Formação:</h3>
        {formations.map((formation) => (
          <span key={formation.id}>
            <h4>
              Instituição:<span>{` ${formation.institution}`}</span>
            </h4>
            <span className="resume-info-course-container">
              <h4>
                Curso:<span>{` ${formation.name}`}</span>
              </h4>
              <span className="resume-info-course-duration-container">
                <h4>
                  Inicio:<span>{` ${formationDate(formation.start)}`}</span>
                </h4>
                <h4>
                  Término: <span>{` ${formationDate(formation.end)}`}</span>
                </h4>
              </span>
            </span>
            <span className="resume-info-course-situation-container">
              <h4>
                Situação: <span>{` ${formation.status}`}</span>
              </h4>
              <h4>
                Duração: <span>{`${durationFormation(formation.start, formation.end)} Anos`}</span>
              </h4>
            </span>
          </span>
        ))}
      </div>
    </div>
  );
};

export default PersonalInfo;
