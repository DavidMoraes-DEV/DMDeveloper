import axios, { AxiosRequestConfig } from "axios";

export const BASE_URL = process.env.REACT_APP_BACKEND_URL ?? "http://localhost:8080";

export const requestBackend = (config: AxiosRequestConfig) => {
    return axios({ ...config, baseURL: BASE_URL });
};