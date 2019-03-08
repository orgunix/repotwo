package com.aaa.util;

import redis.clients.jedis.Jedis;

/**
 * fileName:TestRedisConnect
 * description:
 * author:zz
 * createTime:2019/3/4 10:37
 */
public class TestRedisConnect {
    public static void main(String[] args) {
        Jedis jedis =  new Jedis("192.168.204.140",6379);
        System.out.println(jedis.ping());
        System.out.println(SerializeUtil.serialize("userList"));

    }
}
