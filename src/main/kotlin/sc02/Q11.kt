package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

/**
 * Input
 * KKHSSSSSSSE
 *
 *
 * Output
 * K2HS7E
 */
fun main() {

    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            var answer = ""
            val s = br.readLine() + " "
            var cnt = 1

            for (i in 0..<s.length - 1) {
                if (s[i] == s[i + 1]) {
                    cnt++
                } else {
                    answer += s[i]
                    if (cnt > 1) {
                        answer += cnt.toString()
                    }
                    cnt = 1
                }
            }
            println(answer)
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }
}