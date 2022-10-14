import { CourseData } from "./courseData"
import { FormationData } from "./formationData"
import { PersonalInfoData } from "./personalInfoData"
import { SkillData } from "./skill"

export type ResumeData = {
    id: number,
    fileUrl: string,
    personalInfo: PersonalInfoData,
    formations: FormationData[],
    courses: CourseData[],
    skills: SkillData[]
}
