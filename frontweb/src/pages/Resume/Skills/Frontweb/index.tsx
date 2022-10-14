import './styles.css';
import { CategoryData } from 'types/categoryData';
import { FrontwebData } from 'types/frontwebData';

type Props = {
  frontwebTecs: FrontwebData[];
  category?: CategoryData;
};

const Frontweb = ({ frontwebTecs, category }: Props) => {
  return (
    <div className="skills-frontweb-container">
      <div className="skills-tittle-container">
        <h2>{`${category?.name}:`}</h2>
      </div>
      <div className="row skills-logos-container">
        {frontwebTecs.map((frontwebTec) => (
          <span className="col-6 col-sm-4 col-md-3 col-lg-2 skills-logo" key={frontwebTec.id}>
            <img
              src={frontwebTec.imgUrl}
              alt={frontwebTec.name}
              className={`logo-${frontwebTec.name}`}
            />
          </span>
        ))}
      </div>
    </div>
  );
};

export default Frontweb;
