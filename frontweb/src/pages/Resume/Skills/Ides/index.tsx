import './styles.css';
import { IdeData } from 'types/ideData';
import { CategoryData } from 'types/categoryData';

type Props = {
  ides: IdeData[];
  category?: CategoryData;
};

const Ides = ({ ides, category }: Props) => {
  return (
    <div className="skills-ides-container">
      <div className="skills-tittle-container">
        <h2>{`${category?.name}:`}</h2>
      </div>

      <div className="skills-ides-logos-container">
        <span className="skills-ides-logos-content-1">
          {ides.map((ide) => (
            <span className={`logo-${ide.name}`} key={ide.id}>
              <img src={ide.imgUrl} alt={ide.name} />
            </span>
          ))}
        </span>

        {ides
          .filter((ide) => ide.name === 'visual-studio-code')
          .map((visualCode) => (
            <span className="skills-ides-visual-studio" key={visualCode.id}>
              <img src={visualCode.imgUrl} alt={visualCode.name} />
            </span>
          ))}
      </div>
    </div>
  );
};

export default Ides;
