import { AxiosRequestConfig } from 'axios';
import { useEffect, useState } from 'react';
import { ResumeData } from 'types/resumeData';
import { requestBackend } from 'util/requests';
import Courses from './Courses';
import LoaderResume from './LoaderResume';
import PersonalInfo from './PersonalInfo';
import Skills from './Skills';
import ImageProfile from '../../assets/images/image-profile.png';
import './styles.css';

const Resume = () => {
  const [resumeItem, setResume] = useState<ResumeData[]>([]);
  const params: AxiosRequestConfig = {
    method: 'GET',
    url: '/resume',
  };
  const [isLoading, setIsLoading] = useState(false);

  useEffect(() => {
    setIsLoading(true);
    requestBackend(params)
      .then((response) => {
        console.log(response.data);
        setResume(response.data);
      })
      .finally(() => {
        setTimeout(() => (setIsLoading(false)), 3000);
      });
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  return (
    <main className="bg resume-container">
      {isLoading ? (
        <LoaderResume />
      ) : (
        resumeItem !== undefined &&
        resumeItem.map((resume) => (
          <div className="resume-infos-container" key={resume.id}>
            <section className="base-card resume-card-container">
              <div className="resume-image-button-container">
                <figure className="resume-image-container">
                  <img src={ImageProfile} alt="" />
                </figure>
                <a
                  href={resume.fileUrl}
                  target="_blank"
                  rel="noopener noreferrer"
                >
                  <button className="btn base-button resume-button-container">
                    BAIXAR CURRÍCULO
                  </button>
                </a>
              </div>
              {resume.personalInfos.map((personalInfo) => (
                <PersonalInfo
                  info={personalInfo}
                  formations={resume.formations}
                  key={personalInfo.id}
                />
              ))}
            </section>

            <section className="base-card resume-courses-container">
              <h1>CURSOS COMPLEMENTARES:</h1>
              <div className="row resume-courses-grid-container">
                {resume.courses
                  .sort((courseA, courseB) => courseA.id - courseB.id)
                  .map((course) => (
                    <Courses course={course} key={course.id} />
                  ))}
              </div>
            </section>

            <section className="base-card skills-container">
              <h1>CONHECIMENTOS BÁSICOS EM:</h1>
              <Skills skills={resume.skills} />
            </section>
          </div>
        ))
      )}
    </main>
  );
};

export default Resume;
