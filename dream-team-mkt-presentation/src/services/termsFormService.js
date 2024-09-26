import axiosClient from "./axiosClient";

class TermsFormService {

  static async fetchData() {
    let data = {}
    await axiosClient.get("/dreamteam").then( function(response) {
      data = response.data;
    })
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

export default TermsFormService;