import { CategoryData } from "./categoryData"

export type BackendData = {
    id: number,
    name: string,
    imgUrl: string,
    categories: CategoryData[]
}