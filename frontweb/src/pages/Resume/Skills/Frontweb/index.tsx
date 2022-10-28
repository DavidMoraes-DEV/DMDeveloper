import './styles.css';
import { CategoryData } from 'types/categoryData';
import { FrontwebData } from 'types/frontwebData';

type Props = {
  frontwebTecs: FrontwebData[];
  category?: CategoryData;
};

const Frontweb = ({ frontwebTecs, category }: Props) => {
  return (
    <section className="skills-frontweb-container">
      <h2>{`${category?.name}:`}</h2>
      <div className="row skills-frontweb-logos-container">
        {frontwebTecs.sort((frontA, frontB) => frontA.id - frontB.id).map((frontwebTec) => (
          <figure className="col-6 col-sm-4 col-md-3 col-lg-2 skills-logo" key={frontwebTec.id}>
            <img
              src={frontwebTec.imgUrl}
              alt={frontwebTec.name}
              className={`logo-${frontwebTec.name}`}
            />
          </figure>
        ))}
      </div>
    </section>
  );
};

export default Frontweb;
