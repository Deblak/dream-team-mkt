import axiosClient from "./axiosClient";

class PricingProductService {

  static async fetchData() {
    let datas = {}
    await axiosClient.get('/offers').then(function (response) {
      datas = response.data;
    })
    return datas;
  }

  static async updateData(data) {
    await axiosClient.post('offers/update', data)
  }

}

export default PricingProductService;
