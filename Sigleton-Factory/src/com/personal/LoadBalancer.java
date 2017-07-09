package com.personal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mac on 09/07/2017.
 * Load Balancer : singleton class,
 * this class very complex in prod environment, include a lot of instance work and business method,
 * consider the readability of the code and easy to understand,
 * only part of the model associated with the core code
 *
 * @author zhiyong.feng
 */
public class LoadBalancer {
    // private static member variable, store a unique instance
    private static LoadBalancer instance = null;

    // server list
    private List serverList = null;

    // private constructor
    public LoadBalancer() {
        serverList = new ArrayList();
    }

    // public static member method, return a unique instance
    public static LoadBalancer getLoadBalancer() {
        if (instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    // add server
    public void addServer(String server) {
        serverList.add(server);
    }

    // delete server
    public void deleteServer(String server) {
        serverList.remove(server);
    }

    // use the random class to randomly get the server
    public String getServer() {
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
