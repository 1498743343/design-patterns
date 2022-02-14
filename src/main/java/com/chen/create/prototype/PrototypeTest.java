package com.chen.create.prototype;

import com.chen.create.prototype.pojo.Address;
import com.chen.create.prototype.pojo.User;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 原型模式：原型模式一般用于对目标对象的复制，当直接创建对象的代价比较大时，则采用这种模式。（代价大不单指调用构造函数占用的资源多，也可能是访问数据库的代价大等原因）
 * 例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。
 *
 * @author chenzihan
 * @date 2022/02/14
 */
public class PrototypeTest {

    /**
     * java 原生的 clone 方法，需要类对象实现 Cloneable 接口，并重写 clone 方法，clone 方法是 native 方法，不会调用类对象的构造方法，所以如果在类对象的构造
     * 方法中添加了一些初始化的逻辑，就不建议使用原生的 clone 了，并且 clone 是浅拷贝，如果想进行深拷贝，需要在重写的 clone 中进行逻辑补充
     */
    @Test
    public void t1() {
        Address address = new Address("China", "Beijing");
        User user = new User(1L, "czh", address);
        User clone = (User)user.clone();
        System.out.println(clone);
        System.out.println(user.getAddress());
        System.out.println(clone.getAddress());
    }

    /**
     * 可以实现对象复制的方法有很多，例如通过序列化实现深拷贝，当然使用这个方法的前提是目标类实现了 Serializable 接口
     * 这种方法虽然可以实现深拷贝，但是性能是瓶颈，序列化和反序列化两个操作比较耗时
     * 目前 deep copy的第三方库很多：Dozer（https://github.com/DozerMapper/dozer，Kryo（https://github.com/EsotericSoftware/kryo），
     * cloning（https://github.com/kostaskougios/cloning）等
     */
    public static Object deepCopy(Object from) {
        Object obj = null;
        try {
            // 将对象写成 Byte Array
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(from);
            out.flush();
            out.close();
            // 从流中读出 byte array，调用readObject函数反序列化出对象
            ObjectInputStream in = new ObjectInputStream(
                    new ByteArrayInputStream(bos.toByteArray()));
            obj = in.readObject();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
