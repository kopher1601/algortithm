package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.InputStreamReader

/*
it is time to study -> study
Hello my name is Yaro -> Hello
 */

class Q03

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            var str = br.readLine()

            var answer = ""
            var pos = 0
            var max = 0
            while ((str.indexOf(" ").also { pos = it }) != -1) {
                val tmp = str.substring(0, pos)
                val len = tmp.length
                if (len > max) {
                    max = len
                    answer = tmp
                }
                str = str.substring(pos + 1)
            }
            if (str.length > max) {
                answer = str
            }
            println(answer)
        }
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}