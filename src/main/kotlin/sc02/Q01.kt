package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            val sentence = br.readLine().lowercase()
            val ch = br.readLine().lowercase()[0]

            var count = 0
            for (c in sentence.toCharArray()) {
                if (c == ch) {
                    count++
                }
            }
            println(count)
        }
    } catch (e: IOException) {
        throw RuntimeException(e)
    }
}