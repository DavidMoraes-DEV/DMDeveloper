import ContentLoader from 'react-content-loader';
import './styles.css';

const LoaderProject = () => {
  return (
    <div className="col-sm-6 col-lg-12 loader-project-container">
      <div className="base-card loader-project-content">
        <div className='loader-project-image-container'>
          <ContentLoader
            width={"100%"}
            height={170}
            viewBox="0 0 100% 100%"
            backgroundColor="#1f1f1f"
            foregroundColor="#2B2B2B"
            className="loader-project-image"
          >
            |--Título//FORMAÇÃO--|
            <rect x="0" y="0" rx="0" ry="0" width="100%" height="100%" className="project-image" />
          </ContentLoader>
        </div>

        <div className="loader-project-info-container">
          <div className='loader-project-info-tittle'>
            <ContentLoader
              width={"100%"}
              height={30}
              viewBox="0 0 100% 100%"
              backgroundColor="#1b1b1b"
              foregroundColor="#2e2e2e"
              className="loader-project-tittle"
            >
              |--Título//FORMAÇÃO--|
              <rect x="0" y="0" rx="0" ry="0" width="100%" height="100%" className="project-tittle" />
            </ContentLoader>
          </div>

          <div className='loader-project-info-content'>
            <ContentLoader
              width={"100%"}
              height={12}
              viewBox="0 0 100% 100%"
              backgroundColor="#1f1f1f"
              foregroundColor="#2B2B2B"
              className="loader-project-description-tittle"
            >
              |--Título//FORMAÇÃO--|
              <rect x="0" y="0" rx="3" ry="3" width="100px" height="100%" className="project-description-tittle" />
            </ContentLoader>
            
            <ContentLoader
              width={"100%"}
              height={80}
              viewBox="0 0 100% 100%"
              backgroundColor="#1f1f1f"
              foregroundColor="#2B2B2B"
              className="loader-project-description"
            >
              |--Título//FORMAÇÃO--|
              <rect x="0" y="0" rx="3" ry="3" width="100%" height="100%" className="project-description" />
            </ContentLoader>

            <div className='loader-project-info-button-container'>
              <ContentLoader
                width="100%"
                height={30}
                viewBox="0 0 100% 100%"
                backgroundColor="#1f1f1f"
                foregroundColor="#2B2B2B"
                className="loader-project-info-button-1"
              >
                |--Título//FORMAÇÃO--|
                <rect x="0" y="0" rx="3" ry="3" width="110px" height="100%" className="project-info-button-1" />
              </ContentLoader>

              <ContentLoader
                width="100%"
                height={30}
                viewBox="0 0 100% 100%"
                backgroundColor="#1f1f1f"
                foregroundColor="#2B2B2B"
                className="loader-project-info-button-2"
              >
                |--Título//FORMAÇÃO--|
                <rect x="0" y="0" rx="3" ry="3" width="110px" height="100%" className="project-info-button-2" />
              </ContentLoader>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};

export default LoaderProject;
