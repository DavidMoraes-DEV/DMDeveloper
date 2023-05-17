import ContentLoader from 'react-content-loader';
import './styles.css';

const LoaderCourse = () => {
  return (
    <div className="col-xl-6 loader-course-container-content">
      <div className="loader-course-button-container">
        <ContentLoader
          width="135"
          height={40}
          viewBox="0 0 100% 100%"
          backgroundColor="#1f1f1f"
          foregroundColor="#2B2B2B"
          className="loader-course-button"
        >
          |-- botão currículo --|
          <rect x="0" y="0" rx="5" ry="5" width="135" height="30" className="course-button" />
        </ContentLoader>
      </div>

      <div className="loader-course-info-container">
        <div className="loader-course-content">
          <ContentLoader
            width="100%"
            height={70}
            viewBox="0 0 100% 100%"
            backgroundColor="#1f1f1f"
            foregroundColor="#2B2B2B"
            className="loader-course-info"
          >
            |-- Linhas texto 1--|
            <rect x="0" y="0" rx="3" ry="3" width="100%" height="10" className="course-content" />
            <rect x="0" y="20" rx="3" ry="3" width="100%" height="10" className="course-content" />
            <rect x="0" y="40" rx="3" ry="3" width="100%" height="10" className="course-content" />
          </ContentLoader>
        </div>
      </div>
    </div>
  );
};

export default LoaderCourse;
