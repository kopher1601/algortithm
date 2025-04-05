package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.InputStreamReader

/*
Input

3
good
Time
Big

Output

doog
emiT
giB

 */

class Q04

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            val count = br.readLine().toInt()
            for (i in 0..<count) {
                val word = br.readLine()
                val answer = StringBuilder()
                val chars = word.toCharArray()
                for (j in chars.size downTo 1) {
                    answer.append(chars[j - 1])
                }
                println(answer)
            }
        }
    } catch (ex: Exception) {
        ex.printStackTrace()
    }
}