import axiosClient from "./axiosClient";

class PricingProductService {

  static async fetchData() {
    let datas = {}
    await axiosClient.get('/offers').then(function (response) {
      datas = response.data;
    })

    datas = datas.map( data => {
      return {
        nameOfferEn: data.nameOfferEn,
        nameOfferFr: data.nameOfferFr,
        priceOfferFr: data.priceOfferFr,
        priceOfferEn: data.priceOfferEn,
        planOfferFr: data.planOfferFr.split(","),
        planOfferEn: data.planOfferEn.split(","),
        callToActionFr: data.callToActionFr,
        callToActionEn: data.callToActionEn
      }
    })
    return datas;
  }

}

export default PricingProductService;
