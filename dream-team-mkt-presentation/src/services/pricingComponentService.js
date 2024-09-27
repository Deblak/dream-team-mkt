import axiosClient from "./axiosClient";

class PricingComponentProductService {

    static async fetchData() {
        let datas ={}
        await axiosClient.get('/pricing').then(function(response) {
            datas = response.data
        })
        return datas;
    };

    static async updateData(data) {
             await axiosClient.patch('/pricing',data, {
                headers: {'Content-Type': 'application/json'}
            });
  
    }

}
export default PricingComponentProductService