const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot0t1t7/",
            name: "springboot0t1t7",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot0t1t7/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "汽车票网上预订系统"
        } 
    }
}
export default base
