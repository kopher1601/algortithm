package jp.co.kopher.sc02

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

fun main() {
    try {
        BufferedReader(InputStreamReader(System.`in`)).use { br ->
            val strs = br.readLine().split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val chars = strs[0].toCharArray()
            val target = strs[1][0]
            val result = IntArray(chars.size)
            var count = 1000
            for (i in chars.indices) {
                if (target == chars[i]) {
                    count = 0
                    result[i] = count
                    count++
                    continue
                }
                result[i] = count
                count++
            }

            count = 1000
            for (j in chars.indices.reversed()) {
                if (target == chars[j]) {
                    count = 0
                    result[j] = count
                    count++
                    continue
                }
                if (result[j] > count) {
                    result[j] = count
                }
                count++
            }
            for (i in result) {
                print("$i ")
            }
        }
    } catch (e: IOException) {
        throw RuntimeException(e)
    }
}