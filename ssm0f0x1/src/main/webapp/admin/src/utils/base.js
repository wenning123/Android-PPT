const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm0f0x1/",
            name: "ssm0f0x1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm0f0x1/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于Android关于PPT需求委托平台"
        } 
    }
}
export default base
