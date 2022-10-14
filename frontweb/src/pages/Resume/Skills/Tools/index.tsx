import { ToolData } from 'types/toolData';
import { CategoryData } from 'types/categoryData';
import './styles.css';

type Props = {
  tools: ToolData[];
  category?: CategoryData;
};

const Tools = ({ tools, category }: Props) => {
  return (
    <div className="skills-tools-container">
      <div className="skills-tittle-container">
        <h2>{`${category?.name}:`}</h2>
      </div>
      <div className="skills-tools-logos-container">
        <span className="skills-tools-logos-db">
          {tools.map((tool) => (
            <span className={`logo-${tool.name}`} key={tool.id}>
              <img src={tool.imgUrl} alt={tool.name} />
            </span>
          ))}
        </span>

        {tools
          .filter((tool) => tool.name === 'postman')
          .map((postman) => (
            <span className="skills-tools-postman" key={postman.id}>
              <img src={postman.imgUrl} alt={postman.name} />
            </span>
          ))}
      </div>
    </div>
  );
};

export default Tools;
