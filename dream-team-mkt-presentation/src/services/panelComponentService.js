import axiosClient from "./axiosClient";

class PanelComponentService {

  static async fetchData() {
    let data = {}
    await axiosClient.get("/dreamteam").then( function(response) {
      data = response.data;
    })
    console.log(data);
    return data;
  }

}

export default PanelComponentService;
