import ContentLoader from 'react-content-loader';
import LoaderCourse from '../Courses/LoaderCourse';
import LoaderPersonalInfo from '../PersonalInfo/LoaderPersonalInfo';
import './styles.css';

const LoaderResume = () => {
  return (
    <div className="loader-container">
      <LoaderPersonalInfo />

      <div className="row base-card loader-course-container">
        <div className="loader-course-tittle">
          <ContentLoader
            width="210"
            height={30}
            viewBox="0 0 100% 100%"
            backgroundColor="#1f1f1f"
            foregroundColor="#2B2B2B"
            className="loader-course"
          >
            |--Título//FORMAÇÃO--|
            <rect x="0" y="0" rx="3" ry="3" width="100%" height="20" className="course-tittle" />
          </ContentLoader>
        </div>
        
        <LoaderCourse />
        <LoaderCourse />
        <LoaderCourse />
        <LoaderCourse />
      </div>
    </div>
  );
};

export default LoaderResume;
