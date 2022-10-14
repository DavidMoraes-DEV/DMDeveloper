import { BackendData } from 'types/backendData';
import { CategoryData } from 'types/categoryData';
import './styles.css';

type Props = {
  backendTecs: BackendData[]
  category?: CategoryData;
};

const Backend = ({ backendTecs, category }: Props) => {
  return (
    <div className="skills-backend-container">
      <div className="skills-tittle-container">
        <h2>{`${category?.name}:`}</h2>
      </div>
      <div className="row skills-logos-container">
        {backendTecs.map((backendTec) => (
          <span className="col-6 col-sm-4 col-md-3 skills-logo" key={backendTec.id}>
            <img
              src={backendTec.imgUrl}
              alt={backendTec.name}
              className={`logo-${backendTec.name}`}
            />
          </span>
        ))}
      </div>
    </div>
  );
};

export default Backend;
