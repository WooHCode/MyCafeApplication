package kr.tutorials.mycafeapplication.login.login

data class LoginResult(
        val success:LoggedInUserView? = null,
        val error:Int?=null
)


