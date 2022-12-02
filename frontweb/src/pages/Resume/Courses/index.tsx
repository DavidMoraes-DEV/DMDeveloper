import { CourseData } from 'types/courseData';
import './styles.css';

type Props = {
  course: CourseData;
};

const Courses = ({ course }: Props) => {
  return (
    <section
      className={`col-xl-6 resume-courses-content ${
        course.id % 2 === 1 ? 'course-grid-odd' : 'course-grid-pair'
      }`}
    >
      <div className="button-container">
        <a href={course.certificateUrl} target="_blank" rel="noopener noreferrer">
          <button className="btn base-button resume-course-button-container">
            CERTIFICADO
          </button>
        </a>
      </div>
      <article className="mb-2 resume-courses-info-content">
        <h4>
          Instituição:<span>{` ${course.institution}`}</span>
        </h4>
        <h4>
          Curso:<span>{` ${course.name}`}</span>
        </h4>
        <h4>
          Duração:<span>{` ${course.duration} horas`}</span>
        </h4>
      </article>
    </section>
  );
};

export default Courses;
