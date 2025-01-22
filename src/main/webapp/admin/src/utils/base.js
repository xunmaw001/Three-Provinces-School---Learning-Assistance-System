const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmgp6yp/",
            name: "ssmgp6yp",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmgp6yp/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "三省学堂—学习辅助系统"
        } 
    }
}
export default base
