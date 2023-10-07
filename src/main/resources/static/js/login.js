import { ajaxGet, cleaner, formatter } from "./requestController.js"

const signUpButton = document.getElementById('signUp')
const signInButton = document.getElementById('signIn')
const container = document.getElementById('container')
const studentSignIn = document.getElementById('studentSignIn')

//在页面加载的时候调用getCaptchaBase64接口
function getCaptchaBase64() {
    ajaxGet("/getCaptchaBase64").then((res) => {
        res = JSON.parse(res)
        if (res.url) {

            document.getElementById("imgCheck").setAttribute("src", res.url)
        }
    }).catch((err) => {
        console.log(err);
    })
}
//token
studentSignIn.onclick = async function () {
    const captcha = document.getElementById("captcha").value
    const res = JSON.parse(await (await fetch("/checkCaptcha?code=" + captcha)).text())
    if (res) {
        const accountNum = document.getElementById("accountNum").value
        const password = document.getElementById("password").value
        const { user, message } = JSON.parse(await ajaxGet("/users/login?accountNum=" + accountNum + "&password=" + password))
        if (!(/错误/.test(message))) {
            sessionStorage.setItem("user", user.username)
            alert("登录成功")
             window.location.href = "index.html"
        }else {
            alert("账号或密码错误")
        }
    }else{
        alert("验证码错误");
    }
}


window.onload = function () {
    getCaptchaBase64();
}





var signInSuccess = function () {
    window.location.href = '../pages/news.html'
}

var signInFail = function (n, p) {
    alert('账号或密码错误!请重新输入')
    n.value = ''
    p.value = ''
    cleaner(n, p);
}