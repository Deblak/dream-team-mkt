import axiosClient from "./axiosClient";

class PricingsProduct {

  static async fetchData() {
    let datas = {}
    await axiosClient.get('/offers').then(function (response) {
      datas = response.data;
    })
    return datas;
  }

  static async updateData(data) {
    await axiosClient.patch('offers', data)
  }

}

export default PricingsProduct;
