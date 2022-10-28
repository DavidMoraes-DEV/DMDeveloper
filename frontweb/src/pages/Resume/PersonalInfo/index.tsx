import { FormationData } from 'types/formationData';
import { PersonalInfoData } from 'types/personalInfoData';
import './styles.css';

type Props = {
  info: PersonalInfoData;
  formations: FormationData[];
};

const PersonalInfo = ({ info, formations }: Props) => {
  const birthDate = new Date(info.birthDate);

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
    <article className="resume-info-container">
      <h2 className="mb-3">{info?.name}</h2>
      <div className="resume-personal-info-container">
        <article className="resume-info-content">
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
            Sexo: <span>{info?.genre}</span>
          </h4>
          <h4>
            Fone: <span>{info?.phone}</span>
          </h4>
          <h4>
            Email: <span>{info?.email}</span>
          </h4>
        </article>
        <article className="resume-info-content">
          <h4>
            Endereço: <span>{info?.address}</span>
          </h4>
          <h4>
            CEP: <span>{info?.cep}</span>
          </h4>
          <h4>
            Cidade/Estado:{' '}
            <span>{`${info?.city} - ${info?.state}`}</span>
          </h4>
          <h4>
            CNH Categoria(s): <span>{info?.cnh}</span>
          </h4>
          <h4>
            Trabalhando atualmente? <span>Não</span>
          </h4>
        </article>
      </div>
      <div className="resume-info-content">
        <h3>Formação:</h3>
        {formations.map((formation) => (
          <article key={formation.id}>
            <h4>
              Instituição:<span>{` ${formation.institution}`}</span>
            </h4>
            <div className="resume-info-course-container">
              <h4>
                Curso:<span>{` ${formation.name}`}</span>
              </h4>
              <aside className="resume-info-course-duration-container">
                <h4>
                  Inicio:<span>{` ${formationDate(formation.initFormation)}`}</span>
                </h4>
                <h4>
                  Término: <span>{` ${formationDate(formation.endFormation)}`}</span>
                </h4>
              </aside>
            </div>
            <aside className="resume-info-course-situation-container">
              <h4>
                Situação: <span>{` ${formation.status}`}</span>
              </h4>
              <h4>
                Duração: <span>{`${durationFormation(formation.initFormation, formation.endFormation)} Anos`}</span>
              </h4>
            </aside>
          </article>
        ))}
      </div>
    </article>
  );
};

export default PersonalInfo;
