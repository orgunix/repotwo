package com.aaa.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

/**
 * fileName:TestRedisClusterConnect
 * description:
 * author:zz
 * createTime:2019/3/4 17:23
 */
public class TestRedisClusterConnect {
    public static void main(String[] args){
        //创建一个Set集合
        Set<HostAndPort> hps=new HashSet<>();

        hps.add(new HostAndPort("192.168.204.140",7001));
        hps.add(new HostAndPort("192.168.204.140",7002));
        hps.add(new HostAndPort("192.168.204.140",7003));
        hps.add(new HostAndPort("192.168.204.141",7004));
        hps.add(new HostAndPort("192.168.204.141",7005));
        hps.add(new HostAndPort("192.168.204.141",7006));
        JedisCluster jedisCluter=new JedisCluster(hps);
        jedisCluter.set("eee","555");
        jedisCluter.set("aaa","111");
         String s=jedisCluter.get("eee");
        String a=jedisCluter.get("aaa");
        System.out.println(s);
        System.out.println(a);

    }
}
