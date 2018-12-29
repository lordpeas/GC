package jmock;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Cui Tianqi
 * Create Date: 2018/12/29 15:50
 * Description: ${DESCRIPTION}
 */
public class GuavaDemo {


   static LoadingCache<Object, Object> build =
           CacheBuilder.newBuilder().expireAfterWrite(3, TimeUnit.SECONDS).softValues().build(new CacheLoader<Object,
                   Object>() {
        @Override
        public Object load(Object key) throws Exception {
            return null;
        }
    });

    public static void main(String[] args) throws ExecutionException {
        Object o = build.get("");
    }
}
