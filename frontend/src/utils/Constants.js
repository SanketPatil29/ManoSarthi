export const BASE_URL = "http://192.168.120.54:9090/";
export const getToken = () => {
    return localStorage.getItem("JWT");
}

export const getUserId = () => {
    return localStorage.getItem("User_Id");
}