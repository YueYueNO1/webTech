import { ajaxGet, cleaner, formatter } from "./requestController.js"

const signUpButton = document.getElementById('signUp')
const signInButton = document.getElementById('signIn')
const container = document.getElementById('container')
const studentSignIn = document.getElementById('studentSignIn')

//token
studentSignIn.onclick = async function () {
    const accountNum = document.getElementById("accountNum").value
    const password = document.getElementById("password").value
    const username = document.getElementById("username").value
    const obj = {
        user: 1
    }

    const { result } = (await (await fetch(`/users/register?accountNum=${accountNum}&username=${username}&password=${password}`)).json())

    if (result) {
        alert("注册成功")
        window.location.href = './login.html'
    }else{
        alert("账户已存在")
        cleaner(accountNum, password, username)
    }
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