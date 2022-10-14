import { AxiosRequestConfig } from 'axios';
import { useEffect, useState } from 'react';
import { ResumeData } from 'types/resumeData';
import { requestBackend } from 'util/requests';
import Courses from './Courses';
import PersonalInfo from './PersonalInfo';
import Skills from './Skills';
import './styles.css';

const Resume = () => {
  const [resumeItem, setResume] = useState<ResumeData[]>([]);
  const params: AxiosRequestConfig = {
    method: 'GET',
    url: '/resume',
  };

  useEffect(() => {
    requestBackend(params).then((response) => {
      console.log(response.data);
      setResume(response.data);
    });
    // eslint-disable-next-line react-hooks/exhaustive-deps
  }, []);

  return (
    <>
      {resumeItem && resumeItem.map((resume) => (
        <div className="bg resume-container" key={resume.id}>
          <span className="resume-infos-container">
            <div className="base-card resume-card-container">
              <div className="resume-image-button-container">
                <div className="resume-image-container"></div>
                <button className="btn base-button resume-button-container">
                  BAIXAR CURRÍCULO
                </button>
              </div>
              {resumeItem && (
                <PersonalInfo informations={resume.personalInfo} formations={resume.formations}/>
              )}
            </div>

            <div className="base-card resume-courses-container">
              <h1>CURSOS COMPLEMENTARES:</h1>
              <div className="row">
                {resume.courses.map(course => (
                  <Courses course={course} key={course.id}/>
                ))}
                </div>
            </div>

            <div className="base-card skills-container">
              <h1>CONHECIMENTOS:</h1>
              <Skills skills={resume.skills}/>
            </div>
          </span>
        </div>
      ))}
    </>
  );
};

export default Resume;
