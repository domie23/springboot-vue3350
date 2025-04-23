const base = {
    get() {
        return {
            url : "http://localhost:8080/shiyanshipaike/",
            name: "shiyanshipaike",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/shiyanshipaike/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "实验室预约管理"
        } 
    }
}
export default base
