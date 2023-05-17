import './styles.css';
import { IdeData } from 'types/ideData';
import { CategoryData } from 'types/categoryData';

type Props = {
  ides: IdeData[];
  category?: CategoryData;
};

const Ides = ({ ides, category }: Props) => {
  return (
    <section className="skills-ides-container">
      <h2>{`${category?.name}:`}</h2>
      <div className="row skills-ides-logos-container">
          {ides.sort((ideA, ideB) => ideA.id - ideB.id).map((ide) => (
            <figure className="col-sm-6 col-md-3 col-lg-2 skills-logo" key={ide.id}>
              <img src={ide.imgUrl} alt={ide.name} className={`logo-${ide.name}`}/>
            </figure>
          ))}
      </div>
    </section>
  );
};

export default Ides;
