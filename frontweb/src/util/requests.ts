import axios, { AxiosRequestConfig } from "axios";

export const BASE_URL = process.env.REACT_APP_BACKEND_URL ?? "https://api-dm-developer-spring.herokuapp.com";

export const requestBackend = (config: AxiosRequestConfig) => {
    return axios({ ...config, baseURL: BASE_URL });
};