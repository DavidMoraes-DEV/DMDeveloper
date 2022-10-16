import { CourseData } from 'types/courseData';
import './styles.css';

type Props = {
  course: CourseData;
}

const Courses = ( { course } : Props) => {
    return (
        <div className="col-lg-6 resume-courses-content">
          <div className="button-container">
          <a href={course.certificate} target="_blank" rel='noopener noreferrer'>
            <button className="btn base-button resume-course-button-container">
              CERTIFICADO
            </button>
          </a>
          </div>
          <div className="mb-2 resume-courses-info-content">
            <h4>
              Instituição:<span>{` ${course.institution}`}</span>
            </h4>
            <h4>
              Curso:<span>{` ${course.name}`}</span>
            </h4>
            <h4>
              Duração:<span>{` ${course.duration} horas`}</span>
            </h4>
          </div>
        </div>
    );
}

export default Courses;