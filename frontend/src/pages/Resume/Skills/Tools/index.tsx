import { ToolData } from 'types/toolData';
import { CategoryData } from 'types/categoryData';
import './styles.css';

type Props = {
  tools: ToolData[];
  category?: CategoryData;
};

const Tools = ({ tools, category }: Props) => {
  return (
    <section className="skills-tools-container">
      <h2>{`${category?.name}:`}</h2>
      <div className="row skills-tools-logos-container">
        {tools
          .sort((toolA, toolB) => toolA.id - toolB.id)
          .map((tool) => (
            <figure className="col-6 col-sm-4 col-md-3 col-lg-2 skills-logo" key={tool.id} >
              <img src={tool.imgUrl} alt={tool.name} className={`logo-${tool.name}`}/>
            </figure>
          ))}
      </div>
    </section>
  );
};

export default Tools;
