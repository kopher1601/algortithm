package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

// A ~ : 65 ~ 90
// a ~ : 97 ~ 122

class Q02

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            val input = br.readLine()
            val result = input.chars()
                .map { ch ->
                    if (ch in 65..90) {
                        ch + 32
                    } else {
                        ch - 32
                    }
                }
                .toArray()
            val output = String(result, 0, result.size)
            println(output)
        }
    } catch (e: IOException) {
        throw RuntimeException(e)
    }
}