import { CourseData } from "./courseData"
import { FormationData } from "./formationData"
import { PersonalInfoData } from "./personalInfoData"
import { SkillData } from "./skillData"

export type ResumeData = {
    id: number,
    fileUrl: string,
    personalInfos: PersonalInfoData[],
    formations: FormationData[],
    courses: CourseData[],
    skills: SkillData[]
}
