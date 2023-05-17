import ContentLoader from 'react-content-loader';
import './styles.css';

const LoaderCourses = () => {
  return (
    <>
        <div className='loader-course-tittle'>
                <ContentLoader
                    width="210"
                    height={30}
                    viewBox="0 0 100% 100%"
                    backgroundColor="#1f1f1f"
                    foregroundColor="#2B2B2B"
                    className="loader-course"
                >
                    |--Título//FORMAÇÃO--|
                    <rect x="0" y="0" rx="3" ry="3" width="100%" height="20" className='course-tittle'/>
                </ContentLoader>
        </div>
        <div className='loader-course-container-content'>
            <div className='loader-course-button-container'>
                <ContentLoader
                    width="135"
                    height={40}
                    viewBox="0 0 100% 100%"
                    backgroundColor="#1f1f1f"
                    foregroundColor="#2B2B2B"
                    className="loader-course-button"
                >
                    |-- botão currículo --|
                    <rect x="0" y="0" rx="5" ry="5" width="135" height="30" className='course-button' />
                </ContentLoader>
            </div>

            <div className="loader-course-info-container">
                    <div className='loader-course-content'>
                        <ContentLoader
                            width="100%"
                            height={70}
                            viewBox="0 0 100% 100%"
                            backgroundColor="#1f1f1f"
                            foregroundColor="#2B2B2B"
                            className="loader-COURSE-INFO"
                        >
                            |-- Linhas texto 1--|
                            <rect x="0" y="0" rx="3" ry="3" width="100%" height="10" className='course-content'/>
                            <rect x="0" y="20" rx="3" ry="3" width="100%" height="10" className='course-content'/>
                            <rect x="0" y="40" rx="3" ry="3" width="100%" height="10" className='course-content'/>
                        </ContentLoader>
                    </div>
            </div>
      </div>
    </>
  );
};

export default LoaderCourses;
