import axiosClient from "./axiosClient";

class IdentityProductService {

  static async fetchData() {
    let data = {};
    await axiosClient.get('/dreamteam')
    .then(response => {
       data = response.data;
    });
    return data;
  }

  static async updateData(data) {
    let returnData = {}
    returnData = await axiosClient.post("/dreamteam/updateData",
      data
    )
    return returnData.data;
  }
}

export default IdentityProductService;
