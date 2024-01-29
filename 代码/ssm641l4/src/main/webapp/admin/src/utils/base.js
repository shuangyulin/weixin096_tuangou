const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm641l4/",
            name: "ssm641l4",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm641l4/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "社区团购小程序"
        } 
    }
}
export default base
