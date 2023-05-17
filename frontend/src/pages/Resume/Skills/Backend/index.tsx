import { BackendData } from 'types/backendData';
import { CategoryData } from 'types/categoryData';
import './styles.css';

type Props = {
  backendTecs: BackendData[]
  category?: CategoryData;
};

const Backend = ({ backendTecs, category }: Props) => {
  return (
    <section className="skills-backend-container">
      <h2>{`${category?.name}:`}</h2>
      <div className="row skills-backend-logos-container">
        {backendTecs.sort((backA, backB) => backA.id - backB.id).map((backendTec) => (
          <figure className="col-6 col-sm-4 col-md-3 skills-logo" key={backendTec.id}>
            <img
              src={backendTec.imgUrl}
              alt={backendTec.name}
              className={`logo-${backendTec.name}`}
            />
          </figure>
        ))}
      </div>
    </section>
  );
};

export default Backend;
