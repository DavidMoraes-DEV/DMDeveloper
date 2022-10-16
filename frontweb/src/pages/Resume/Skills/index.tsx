import { SkillData } from 'types/skillData';
import { CategoryData } from 'types/categoryData';
import Ides from './Ides';
import Tools from './Tools';
import Backend from './Backend';
import Frontweb from './Frontweb';
import './styles.css';
import './styles-logos.css';

type Props = {
  skills: SkillData[];
}

const Skills = ( { skills } : Props) => {

  function categorySkill(categoriesSkill: CategoryData[]) {
    
    const categoriesAll = new Array<CategoryData>();
    categoriesSkill.forEach(category => categoryAdd(category));
    
    function categoryAdd (category: CategoryData) {
      if((categoriesAll.find(cat => cat.id === category.id)) === undefined) {
        categoriesAll.push(category);
      }
    }

    return (categoriesAll);
  }

  categorySkill(skills.map(skill => skill.categories[0]));

  function filterSkillsCategory(skills: SkillData[], categoryId: Number) {

    const skillsCategory =
    skills.filter(
      skill => skill.categories[
          categoryIndex(skill.categories)
      ].id === categoryId
    )

    function categoryIndex(categorySkill: CategoryData[]) {

      const category = categorySkill;
      const result = category.findIndex(category => category.id === categoryId);
      
      if (result === -1) {
        return 0;
      }

      return (result);
    }

    return (skillsCategory);
  }

  filterSkillsCategory(skills, 4);

  return (
    <div className="skills-container-content">
      
      <Ides
        ides={filterSkillsCategory(skills, 1)}
        category={categorySkill(skills.map(
          skill => skill.categories[0])
        ).find(category => category.id === 1)}
      />

      <Tools 
        tools={filterSkillsCategory(skills, 2)}
        category={categorySkill(skills.map(
          skill => skill.categories[0])
        ).find(category => category.id === 2)} 
      />

      <Backend
        backendTecs={filterSkillsCategory(skills, 3)}
        category={categorySkill(skills.map(
          skill => skill.categories[0])
        ).find(category => category.id === 3)}
      />

      <Frontweb 
        frontwebTecs={filterSkillsCategory(skills, 4)}
        category={categorySkill(skills.map(
          skill => skill.categories[0])
        ).find(category => category.id === 4)}
      />
    </div>
  );
};

export default Skills;
