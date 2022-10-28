import ContentLoader from 'react-content-loader';
import './styles.css';

const LoaderPersonalInfo = () => {
  return (
    <div className=" base-card loader-personal-info-container">
      <div className='loader-image-button-container'>
        <div className='loader-image-container'>
            <ContentLoader
                width="100%"
                height={195}
                viewBox="0 0 100% 100%"
                backgroundColor="#1f1f1f"
                foregroundColor="#2B2B2B"
                className="loader-image"
            >
                |-- Foto currículo --|
                <rect x="0" y="0" rx="5" ry="5" width="155" height="150" className='personal-info-image'/>
            </ContentLoader>
        </div>
        
        <div className='loader-button-container'>
            <ContentLoader
                width="100%"
                height={40}
                viewBox="0 0 100% 100%"
                backgroundColor="#1f1f1f"
                foregroundColor="#2B2B2B"
                className="loader-button"
            >
                |-- botão currículo --|
                <rect x="0" y="0" rx="5" ry="5" width="155" height="30" className='personal-info-button' />
            </ContentLoader>
        </div>
      </div>

      <div className="loader-infos-container">
        <div className='loader-personal-info-content'>
            <div className="loader-personal-info-name">
                <ContentLoader
                    width="100%"
                    height={20}
                    viewBox="0 0 100% 100%"
                    backgroundColor="#1f1f1f"
                    foregroundColor="#2B2B2B"
                    className="loader-info-name"
                >
                    |--Título/Nome--|
                    <rect x="0" y="0" rx="3" ry="3" width="100%" height="20" className='personal-info-tittle'/>
                </ContentLoader>
            </div>

            <div className='loader-infos-content'>
            <div className="loader-personal-info-1">
                <ContentLoader
                    width="100%"
                    height={100}
                    viewBox="0 0 100% 100%"
                    backgroundColor="#1f1f1f"
                    foregroundColor="#2B2B2B"
                >
                    |-- Linhas texto 1--|
                    <rect x="0" y="10" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                    <rect x="0" y="30" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                    <rect x="0" y="50" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                    <rect x="0" y="70" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                    <rect x="0" y="90" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                </ContentLoader>
            </div>

            <div className="loader-personal-info-2">
                <ContentLoader
                    width="100%"
                    height={100}
                    viewBox="0 0 100% 100%"
                    backgroundColor="#1f1f1f"
                    foregroundColor="#2B2B2B"
                >
                    |-- Linhas texto 2--|
                    <rect x="0" y="10" rx="3" ry="3" width="100%" height="10" />
                    <rect x="0" y="30" rx="3" ry="3" width="100%" height="10" />
                    <rect x="0" y="50" rx="3" ry="3" width="100%" height="10" />
                    <rect x="0" y="70" rx="3" ry="3" width="100%" height="10" />
                    <rect x="0" y="90" rx="3" ry="3" width="100%" height="10" />
                </ContentLoader>
            </div>
            </div>
        </div>

        <div>
            <div className='loader-formation-tittle'>
                <ContentLoader
                    width="100%"
                    height={35}
                    viewBox="0 0 100% 100%"
                    backgroundColor="#1f1f1f"
                    foregroundColor="#2B2B2B"
                    className="loader-formation"
                >
                    |--Título//FORMAÇÃO--|
                    <rect x="0" y="0" rx="3" ry="3" width="100%" height="20" className='formation-tittle'/>
                </ContentLoader>
            </div>
            <div className='loader-formation-content'>
                <ContentLoader
                    width="100%"
                    height={70}
                    viewBox="0 0 100% 100%"
                    backgroundColor="#1f1f1f"
                    foregroundColor="#2B2B2B"
                    className="loader-formation"
                >
                    |-- Linhas texto 1--|
                    <rect x="0" y="0" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                    <rect x="0" y="20" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                    <rect x="0" y="40" rx="3" ry="3" width="100%" height="10" className='resume-content'/>
                </ContentLoader>
            </div>
        </div>
      </div>
    </div>
  );
};

export default LoaderPersonalInfo;
